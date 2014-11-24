package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BinaeryHashTree<T, U> implements AssociativeArray<T, U>{

	public TreeNode root;
	int counter = 0;
	
	BiConsumer<T, U> consume = (key, value) -> this.put(key, value);
	
	public BinaeryHashTree() {
	}
	
	public BinaeryHashTree(TreeNode root) {
		this.root = root;
	}

	public TreeNode getNode(T key) {
		return getNodeRek(key, root);
	}

	public TreeNode getNodeRek(T key, TreeNode node) {
		if (node != null) {
			if (node.key.hashCode() == key.hashCode()) {
				return node;
			} else if (node.key.hashCode() > key.hashCode()) {
				return getNodeRek(key, node.left);
			} else {
				return getNodeRek(key, node.right);
			}
		}
		return null;
	}

	// ok
	@Override
	public void clear() {
		root = null;
	}

 	@Override
 	public boolean containsKey(T key) {	
		return containsKey(root, key);
	}
	
	public boolean containsKey(TreeNode node, T key){
		 if (node != null) {
	            if (node.key.equals(key)) {
	                return true;
	            } else if (containsKey(node.left, key)) {
	                return true;
	            } else if (containsKey(node.right, key)){
	                return true;
	            } 
	        }		    return false;
 	}
 
 	@Override
 	public boolean containsValue(U value) {
	
			return containsValue(root, value);
 	}
	
	public boolean containsValue(TreeNode node, U value){
	    if (node != null) {
            if (node.value.equals(value)) {
                return true;
            } else if (containsValue(node.left, value)) {
                return true;            
                } else if (containsValue(node.right, value)){
               return true;
           } 
       }
	    return false;
  }

	// ok
	@Override
	public U get(T key) {
		if (containsKey(key)) {
			return getNode(key).value;
		}
		return null;
	}

	// ok
	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	// ok
	@Override
	public void put(T key, U value) {
		TreeNode node = new TreeNode(value, key);
		if (root == null) {
			root = node;
		} else {
			put(root, node);
		}
	}

	private void put(TreeNode topnode, TreeNode node) {
		if (topnode.key.hashCode() == node.key.hashCode()) {
			return;
		} else if (topnode.key.hashCode() > node.key.hashCode()) {
			if (topnode.left == null) {
				topnode.setLeft(node);
			} else {
				put(topnode.left, node);
			}
		} else {
			if (topnode.right == null) {
				topnode.setRight(node);
			} else {
				put(topnode.right, node);
			}
		}
	}

	@Override
	public void putAll(BinaeryHashTree<T, U> node) {
		node.forEach(consume);
	}

	@Override
	public void remove(T key) {
		if(containsKey(key)){
			TreeNode node = getNode(key);
			TreeNode parentNode = node.parent;
			if (parentNode.left == node) {
				parentNode.setLeft(null);
			} else {
				parentNode.setRight(null);
			}
			putAll(new BinaeryHashTree<T, U>(node.right));
			putAll(new BinaeryHashTree<T, U>(node.left));
		}
	}

	@Override
	public int size() {
		if (root == null) {
			return counter;
		} else {
			counter++;
			return size(root);
		}
	}

	public int size(TreeNode a) {
		// int size = 0;
		if (a.left != null) {
			counter++;
			size(a.left);
		}
		if (a.right != null) {
			counter++;
			size(a.right);
		}
		return counter;
	}

	@Override
	public void update(T key, U value) {
		if (containsKey(key)) {
			getNode(key).value = value;
		}
	}

	@Override
	public void forEach(BiConsumer<T, U> consume) {
		forEach(consume, root);
	}

	public void forEach(BiConsumer<T, U> consume, TreeNode node) {
		if (node != null) {
			consume.accept(node.key, node.value);
			forEach(consume, node.left);
			forEach(consume, node.right);
		}
	}

	@Override
	public void extractAll(BinaeryHashTree<T, U> node) {
		node.putAll(this);
	}

	// BiFunction<T, U, R> function = (key, value) -> key + value;

	@Override
	public BinaeryHashTree<T, U> map(BiFunction<T, U, U> function) {
		BinaeryHashTree<T, U> newTree = new BinaeryHashTree<T, U>();
		return map(function, root, newTree);
	}

	// kein R mehr, weil wir sonst put nicht aufrufen k�nnen!
	public BinaeryHashTree<T, U> map(BiFunction<T, U, U> function,
			TreeNode node, BinaeryHashTree<T, U> newTree) {
		if (node != null) {
			newTree.put(node.key, function.apply(node.key, node.value));
			map(function, node.left, newTree);
			map(function, node.right, newTree);
		}
		return newTree;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consume == null) ? 0 : consume.hashCode());
		result = prime * result + counter;
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaeryHashTree<T, U> other = (BinaeryHashTree<T, U>) obj;
		if (consume == null) {
			if (other.consume != null)
				return false;
		} else if (!consume.equals(other.consume))
			return false;
		if (counter != other.counter)
			return false;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}

	BiFunction<T, U, String> function = (key, value) -> getNode(key).toString();

	String ausdruck;

	public String ausgabe(BiFunction<T, U, String> consume, TreeNode node) {
		if (node != null) {
			ausdruck += consume.apply(node.key, node.value);
			ausgabe(consume, node.left);
			ausgabe(consume, node.right);
		}
		return ausdruck;
	}

	@Override
	public String toString() {
		return toString(root);
	}

	private String toString(TreeNode node) {
		String str = "";
		if (node == null) {
			return str;
		}
		str += "{KEY=" + node.key.toString() + "; VALUE="
				+ node.value.toString() + "}";
		str += toString(node.left) + " " + toString(node.right);
		return str;
	}

	class TreeNode {

		U value;
		T key;
		TreeNode left = null;
		TreeNode right = null;
		TreeNode parent = null;

		// Objektwerte werden in einen Knoten reingesetzt
		public TreeNode(U value, T key) {
			this.value = value;
			this.key = key;
		}

		// left und right wird erzeugt
		public TreeNode(U value, T key, TreeNode left, TreeNode right) {
			this(value, key);
			this.left = left;
			this.right = right;
		}

		public void setLeft(TreeNode n) {
			left = n;
			if (n != null) {
				n.parent = this;
			}

		}

		public void setRight(TreeNode n) {
			right = n;
			if (n != null) {
				n.parent = this;
			}
		}

	}

}
