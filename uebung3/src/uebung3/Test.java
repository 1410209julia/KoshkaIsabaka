package uebung3;

public class Test {

	public static void main(String[] args) {
		BinaerHashTree<Object, Object, Object> tree = new BinaerHashTree<Object, Object, Object>();
		tree.put(5, "fünf");
		tree.put(8, "acht");
		tree.put(4, "vier");
		tree.put(7, "sieben");
		tree.put(6, "sechs");
		
		System.out.println(tree.containsValue("acht"));
		System.out.println(tree.containsKey(10));
		
		tree.printReversePostorder();
	}

}
