package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
	 * Das Interface AssociativeArray, welches einen Wert mit einem Schluessel
	 * verbindet
	 *
	 * @param <T> der generische Typ fuer Key
	 * @param <U> der generische Typ fuer Value
	 */
	public interface AssociativeArray <T,U> {
	
	/**
	 * *
	 * Loescht die Schluesselwertpaare
	 */
	public void clear();
	
	/**
	 * Soll ueberpruefen ob gesuchter Schluessel vorhanden
	 *
	 * @param key der Schluessel
	 * @return true, wenn erfolgreich
	 */
	public boolean containsKey(T key);
	
	/**
	 *  Soll ueberpruefen ob gesuchter Wert vorhanden
	 *
	 * @param value der Wert
	 * @return true, wenn erfolgreich
	 */
	public boolean containsValue(U value);
	
	/**
	 * gibt den passenden Wert zum uebergebenen Schluessel zurueck
	 *
	 * @param key der Schluessel
	 * @return Generic U fuer Value
	 */
	public U get(T key);
	
	/**
	 * Kontrolle ob das AssoziativeArray leer ist
	 *
	 * @return true, wenn es leer ist
	 */
	public boolean isEmpty();
	
	/**
	 * der uebergebene Schluessel und Wert ins assoziative Array speichern
	 *
	 * @param key der Schluessel
	 * @param value der Wert
	 */
	public void put(T key, U value);
	
	/**
	 * alle uebergebenen Schluessel und Werte ins aktuelle assoziative Array 
	 * uebergeben
	 *
	 * @param node der Knoten
	 */
	public void putAll(BinaeryHashTree<T,U> node);
	
	/**
	 * Knoten entfernen anhand des uebergebenen Schluessels
	 *
	 * @param key der Schluessel
	 * @return u
	 */
	public void remove(T key);
	
	/**
	 * gibt die Anzahl der Schluesselwertpaare aus
	 *
	 * @return int
	 */
	public int size();
	
	/**
	 * Wert des uebergebenen Schluessels wird mit uebergebenen Wert 
	 * aktualisiert
	 *
	 * @param key der Schluessel
	 * @param value der Wert
	 */
	public void update(T key, U value);	
	
	/**
	 * fuehrt den uebergebenen BiConsumer fuer alle Schluesselwertpaare 
	 * des assoziativen Arrays aus
	 *
	 * @param consume
	 */
	public void forEach(BiConsumer<T, U> consume);
	
	/**
	 * alle Schluesselwertpaare des aktuellen assoziativen Arrays 
	 * sollen zum uebergebenen 
	 * assoziativen Array hinzugefuegt werden
	 *
	 * @param node der Knoten
	 */
	public void extractAll(BinaeryHashTree<T,U> node);
	
	/**
	 * ein neues assoziatives Array wird erzeugt, indem der uebergebene 
	 * BiFunction fuer alle Schluesselwertpaare 
	 * des assoziativen Arrays die veraenderten Werte auf 
	 * die alten Schluessel uebertraegt
	 *
	 * @param function die Funktion
	 * @return binaerer Hashbaum
	 */
	public BinaeryHashTree<T,U> map(BiFunction<T,U,U> function);
}
