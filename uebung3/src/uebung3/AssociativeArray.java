package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
	 * Das Interface AssociativeArray, welches einen Wert mit einem Schlüssel
	 * verbindet
	 *
	 * @param <T> der generische Typ fuer Key
	 * @param <U> der generische Typ fuer Value
	 */
	public interface AssociativeArray <T,U> {
	
	/**
	 * Löscht die Schluesselwertpaare
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
	 * Gets the.
	 *
	 * @param key the key
	 * @return the u
	 */
	public U get(T key);
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty();
	
	/**
	 * Put.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void put(T key, U value);
	
	/**
	 * Put all.
	 *
	 * @param node the node
	 */
	public void putAll(BinaerHashTree<T,U> node);
	
	/**
	 * Removes the.
	 *
	 * @param key the key
	 * @return the u
	 */
	public U remove(T key);
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size();
	
	/**
	 * Update.
	 *
	 * @param key the key
	 * @param value the value
	 */
	public void update(T key, U value);	
	
	/**
	 * For each.
	 *
	 * @param consum the consum
	 */
	public void forEach(BiConsumer<T, U> consum);
	
	/**
	 * Extract all.
	 *
	 * @param node the node
	 */
	public void extractAll(BinaerHashTree<T,U> node);
	
	/**
	 * Map.
	 *
	 * @param function the function
	 * @return the binaer hash tree
	 */
	public BinaerHashTree<T,U> map(BiFunction<T,U,U> function);
}
