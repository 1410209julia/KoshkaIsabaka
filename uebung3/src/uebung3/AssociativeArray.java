package uebung3;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;


	public interface AssociativeArray <T,U,R> {
	
	public void clear();
	public boolean containsKey(T key);
	public boolean containsValue(U value);
	public T get(T kay);
	public boolean isEmpty();
	public void put(T key, U value);
	//Paratmer
	public void putAll(BinaerHashTree<T,U,R>.TreeNode knoten);
	public void remove(T key);
	public int size();
	public void update(T key, U value);	
	public void foreach(BiConsumer<? super T,? super U> consum);
	public void extractAll();
	public void map(BiFunction<? super T,? super U,? super R> function);
}
