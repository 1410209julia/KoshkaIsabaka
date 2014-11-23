package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BinaerHashTree<T, U, R> implements AssociativeArray<T, U, R> {

	public TreeNode root;
	int counter = 0;

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
			n.parent = this;

		}

		public void setRight(TreeNode n) {
			right = n;
			n.parent = this;
		}

		public void print() {
			System.out.print(value + " " + key.hashCode() + '\n');
		}

		// ok
		public String toString() {
			return value + " " + key;

		}

		public void printReversePostorder() {
			printReversePostorder(this);
		}

		public void printReversePostorder(TreeNode n) {
			// Ist der Baum nicht leer?
			if (n != null) {
				// Dann kann weiter gemacht werden.
				printReversePostorder(n.right);
				printReversePostorder(n.left);
				n.print();
			}
		}
	}

	// ok
	public TreeNode getNode(T key) {

		return getNodeRek(key, root);
	}

	// ok
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

	// ok
	@Override
	public boolean containsKey(T key) {
		return contains(root, key.hashCode());
	}

	// ok
	@Override
	public boolean containsValue(U value) {
		return contains(root, value.hashCode());
	}

	// ok
	public boolean contains(TreeNode node, int hash) {
		if (node != null) {
			if (node.key.hashCode() == hash || node.value.hashCode() == hash) {
				return true;
			} else if (node.key.hashCode() > hash) {
				return contains(node.left, hash);
			} else {
				return (contains(node.right, hash));
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
		put(new TreeNode(value, key));

	}

	// ok
	public void put(TreeNode knoten) {

		TreeNode parent = null;
		TreeNode node = root;

		while (node != null) {
			parent = node;

			if (knoten.key.hashCode() == node.key.hashCode()) {
				return;
			} else if (knoten.key.hashCode() < node.key.hashCode()) {
				node = node.left;
			} else {
				node = node.right;
			}
		}

		if (parent == null) {
			root = knoten;
		} else if (knoten.key.hashCode() < parent.key.hashCode()) {
			parent.setLeft(knoten);
		} else {
			parent.setRight(knoten);
		}
	}

	@Override
	public void putAll(
			BinaerHashTree<? extends T, ? extends U, ? extends R> knoten) {
		// TODO Auto-generated method stub
	}

	@Override
	public void remove(T key) {
		// TODO Auto-generated method stub
	}

	// ok
	@Override
	public int size() {
		if (root == null) {
			return counter;
		} else {
			counter++;
			return size(root);
		}
	}

	// ok
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
	public void foreach(BiConsumer<? super T, ? super U> consum) {
		// TODO Auto-generated method stub
	}

	@Override
	public void extractAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public void map(BiFunction<? super T, ? super U, ? super R> function) {
		// TODO Auto-generated method stub
	}

	public void printReversePostorder() {
		root.printReversePostorder();
	}

}
