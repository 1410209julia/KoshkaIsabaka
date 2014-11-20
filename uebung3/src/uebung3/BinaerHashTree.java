package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BinaerHashTree<T, U,R> implements AssociativeArray<T, U,R> {
	
	public TreeNode root;
	
	class TreeNode {

	    U value;
	    T key;
	    int hashKey;
	    
	    TreeNode left = null;
	    TreeNode right = null;
	    TreeNode parent = null;

	   
	    public TreeNode(U value, T key) {
	        this.value = value;
	        this.key = key;
	        this.hashKey = key.hashCode();
	    }

	
	    public TreeNode(U value, T key, TreeNode left, TreeNode right) {
	        this.value = value;
	        this.hashKey = key.hashCode();
	        this.left = left;
	        this.right = right;
	    }

	    
	    public void setLeft(TreeNode n) {
	        left = n;
	        if (n != null) {
	            //n.parent = this;
	        }
	    }

	  
	    public void setRight(TreeNode n) {
	        right = n;
	        if (n != null) {
	            //n.parent = this;
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(U value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(T kay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void put(T key, U value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putAll(BinaerHashTree<T, U, R>.TreeNode knoten) {
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

}
