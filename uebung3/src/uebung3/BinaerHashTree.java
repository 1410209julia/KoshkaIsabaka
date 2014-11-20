package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BinaerHashTree<T, U,R> implements AssociativeArray<T, U,R> {
	
	public TreeNode root;
	
	class TreeNode {

	    U value;
	    T key;
	    
	    TreeNode left = null;
	    TreeNode right = null;
	    TreeNode parent = null;

	   //Objektwerte werden in einen Knoten reingesetzt
	    public TreeNode(U value, T key) {
	        this.value = value;
	        this.key = key;
	    }

	    // left und right wird erzeugt
	    public TreeNode(U value, T key, TreeNode left, TreeNode right) {
	        this(value,key);
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

	    public String toString() {
	        return value + " " ;
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
	
	//ok
	@Override
	public void clear() {
		root = null;
	}

	@Override
	public boolean containsKey(T key) {
		return contains(root, key.hashCode());
	}
	
	@Override
	public boolean containsValue(U value) {
			return contains(root, value.hashCode());
	}
	
	public boolean contains(TreeNode node, int hashwert){
		if(node != null){
			if(node.key.hashCode() == hashwert || node.value.hashCode() == hashwert){
				return true;
			} else if (contains(node.left, hashwert)){
				return true;
			} else if (contains(node.right, hashwert)){
				return true;
			}
		}
		return false;
	}

	

	@Override
	public U get(T key) {
		if(containsKey(key)){
			//noch zu machen
		}
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.root == null;
	}

	@Override
	public void put(T key, U value) {
		put(new TreeNode(value, key));
		
	}
	
	public void put(TreeNode knoten){
		
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
	public void putAll(BinaerHashTree<? extends T,? extends U,? extends R> knoten) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update(T key, U value) {
		// TODO Auto-generated method stub
		
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
