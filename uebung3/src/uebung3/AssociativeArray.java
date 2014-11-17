package uebung3;

public interface AssociativeArray <T,U> {
	
	public void clear();
	public boolean containsKey(T key);
	public boolean containsValue(U value);
	public T get(T kay);
	public boolean isEmpty();
	public void put(T key, U value);
	//Paratmer
	public void putAll();
	public void remove(T key);
	public int size();
	public void update(T key, U value);	
	
	//foreach net vergessen!!!
	
	public void extractAll();
	
	//map noch machen

}
