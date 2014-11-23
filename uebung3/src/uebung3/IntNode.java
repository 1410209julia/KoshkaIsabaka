package uebung3;

/**
 * Ein Knoten, der <code>int</code>-Elemente aufnehmen kann.
 * </p>
 * Diese Klasse zeigt kompletten Source-Code von Beispielen, die in der
 * Vorlesung gezeigt werden. Es werden bewusst nicht alle Eigenschaften von Java
 * genutzt, da diese zum Zeitpunkt der Vorlesung offiziell nicht bekannt sind.
 * 
 * @author Markus Gumbel
 * @version 1320 public
 */
public class IntNode {

	/**
	 * Den int-Wert, den dieser Knoten aufnimmt.
	 */
	int value = 0;

	/**
	 * Der Nachfolger dieses Knotens. null bedeutet: kein Nachfolger.
	 */
	IntNode next = null;

	// Konstruktoren

	/**
	 * Erzeugt einen neuen Knoten.
	 * 
	 * @param value
	 *            int-Wert dieses Knotens
	 * @param n
	 *            Nachfolger-Knoten
	 */
	public IntNode(int value, IntNode n) {
		this.value = value;
		next = n;
	}

	/**
	 * Erzeugt einen neuen Knoten.
	 * 
	 * @param value
	 *            int-Wert dieses Knotens
	 */
	public IntNode(int value) {
		this.value = value;
	}

	/**
	 * Erzeugt einen neuen Knoten mit 0 als int-Wert und keinem Nachfolger.
	 */
	public IntNode() {
	}

	/**
	 * Gibt das Element auf die Console aus (ohne Zeilenumbruch).
	 */
	public void print() {
		System.out.print(value + " ");
	}

	public String toString() {
		return value + " ";
	}
}
