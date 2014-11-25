package uebung3;

import java.util.ArrayList;
/**
 * Die Klasse Dictionary.
 * 
 */
public class Dictionary extends StringAssociativeArray<String> {

	/** Der keyArray. */
	ArrayList<String> keyArray = new ArrayList<String>();
	
	/** Der valueArray. */
	ArrayList<String> valueArray = new ArrayList<String>();

	/**
	 * gibt ein Array mit Schlüsseln zurück
	 *
	 * @return die arrayList mit den Schlüsseln
	 */
	public ArrayList<String> keys() {
		return keys(root);
	}

	/**
	 * Keys füllt die ArrayList
	 *
	 * @param node der Knoten
	 * @return die arrayList mit den Schlüsseln
	 */
	private ArrayList<String> keys(TreeNode node) {
		if (node != null) {
			keyArray.add(node.key);
			keys(node.left);
			keys(node.right);
		}
		return keyArray;
	}

	/**
	 * Values fuellt die ArrayList
	 *
	 * @return die arrayList mit den Werten
	 */
	public ArrayList<String> values() {
		return values(root);
	}
	
	/**
	 * Values fuellt die arrayList
	 *
	 * @param node der Knoten
	 * @return die arrayList mit den Werten
	 */
	private ArrayList<String> values(TreeNode node){
		if (node != null) {
			valueArray.add(node.value);
			values(node.left);
			values(node.right);
		}
		return valueArray;
	}

}
