package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BinaerHashTree<T, U, R> implements AssociativeArray<T, U, R> {
	
	public TreeNode root;
	
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
	public boolean put(T t, U u) {
		Paerchen paar = new Paerchen(t,u);
		 TreeNode parent = null; // (Vorläufiger) Elternknoten
	        TreeNode node = root; // (Vorläufiger) Kindknoten

	        // Solange der aktuelle Kindknoten nicht null ist...
	        while (node != null) {
	            // Setze alten Kindknoten als neuen Elternknoten:
	            parent = node;
	            // Überprüfe, ob der Wert in diesem Knoten gespeicheret ist:
	            if (t.hashCode() == node.value) {
	                // Ja, also kann der Wert nicht nochmal eingefügt werden:
	                return false;
	            } else if (value < node.value) {
	                // Der einzufügende Wert ist kleiner als der aktuelle Knoten.
	                // D.h. suche im linken Teilbaum weiter:
	                node = node.left;
	            } else {
	                // Der einzufügende Wert ist größer als der aktuelle Knoten.
	                // D.h. suche im rechten Teilbaum weiter:
	                node = node.right;
	            }
	        }
	        // Erzeuge den neuen Knoten für den einzufügenden Wert:
	        IntTreeNode newNode = new IntTreeNode(value);
	        if (parent == null) {
	            // Kein Elternknoten gefunden. D.h. Baum ist leer. Neuer Knoten wird
	            // Wurzelelement.
	            root = newNode;
	        } else if (value < parent.value) {
	            // Hier wird festgestellt, ob der neue Knoten der rechte oder linke
	            // Nachfolger des Elternknoten ist. In diesem Fall links:
	            parent.setLeft(newNode);
	        } else {
	            // Dito für rechts:
	            parent.setRight(newNode);
	        }
	        // Neuer Wert konnte erfolgreich eingefügt werden:
	        return true;
	}

	@Override
	public void putAll() {
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
	public void extractAll() {
		// TODO Auto-generated method stub
	}

	@Override
	public void foreach(BiConsumer<? super T, ? super U> consum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void map(BiFunction<? super T, ? super U, ? super R> function) {
		// TODO Auto-generated method stub
		
	}

	class Paerchen{
		public T key;
		public U value;
		
		public Paerchen(T key, U value){
			this.key = key;
			this.value = value;
		}
	}

}
