package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;


	public interface AssociativeArray <T,U> {
	
	public void clear();
	public boolean containsKey(T key);
	public boolean containsValue(U value);
	public U get(T key);
	public boolean isEmpty();
	public void put(T key, U value);
	//Paratmer
	public void putAll(BinaerHashTree<T,U> node);
	public void remove(T key);
	public int size();
	public void update(T key, U value);	
	public void forEach(BiConsumer<T, U> consum);
	public void extractAll(BinaerHashTree<T,U> node);
	public BinaerHashTree<T,U> map(BiFunction<T,U,U> function);
}
