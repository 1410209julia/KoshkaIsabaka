package uebung3;

public class Test {

	public static void main(String[] args) {
		BinaerHashTree<Object, Object, Object> tree = new BinaerHashTree<Object, Object, Object>();
		tree.put(5, "f�nf");
		tree.put(8, "acht");
		tree.put(4, "vier");
		tree.put(7, "sieben");
		tree.put(6, "sechs");
		tree.put(3, "drei");
		
		System.out.println(tree.containsValue("acht"));
		System.out.println(tree.containsKey(10));
		System.out.println(tree.get(8));
		
		tree.printReversePostorder();
	}

}
