package uebung3;

public class TreeNode {
	
	int value;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode parent = null;

    public TreeNode(int v) {
        value = v;
        left = right = parent = null;
    }

    /**
     * Erzeuge einen neuen Binärbaum-Knoten.
     * @param v Der Wert des Knotens.
     * @param l Der linke Teilbaum.
     * @param r Der rechte Teilbaum.
     */
    public TreeNode(int v, TreeNode l, TreeNode r) {
        value = v;
        left = l;
        right = r;
    }

    /**
     * Setzt den linken Nachfolger und verknüpft ihn mit seinem Vorgänger.
     *
     * @param n Linker Nachfolgerknoten.
     */
    public void setLeft(TreeNode n) {
        left = n;
        if (n != null) {
            n.parent = this;
        }
    }

    /**
     * Setzt den rechten Nachfolger und verknüpft ihn mit seinem Vorgänger.
     *
     * @param n Rechter Nachfolgerknoten.
     */
    public void setRight(TreeNode n) {
        right = n;
        if (n != null) {
            n.parent = this;
        }
    }
}
