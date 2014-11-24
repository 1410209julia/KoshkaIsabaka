package uebung3;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {
		BinaerHashTree<Object, Object> tree = new BinaerHashTree<Object, Object>();
		tree.put(5, "fuenf");
		tree.put(8, "acht");
		tree.put(4, "vier");
		tree.put(7, "sieben");
		tree.put(6, "sechs");
		tree.put(3, "drei");
		tree.put(10, "zehn");
		tree.put(10, "fuenf");
		
		//BinaerHashTree<String, String> baum = new BinaerHashTree<String, String>();
		//baum.putAll(tree);
		
		//baum.put("Lisa", "Miller");
		//baum.put("Jochen", "Schweizer");
		//baum.extractAll(tree);
		//BiFunction<String, String, String> function = (key, value) -> key + value;
		//baum.map(function).printPreorder();
		//tree.remove(4);
		
		//System.out.println(tree.containsValue("acht"));
		//System.out.println(tree.containsKey(10));
		//System.out.println(tree.get(12));
		//System.out.println(tree.size());
		//System.out.println(tree.getNode(5));
		//tree.update(10, "fuenf");
		
		System.out.println(tree);
		//System.out.println(tree.toString());
		//System.out.println(tree);
	}

}
