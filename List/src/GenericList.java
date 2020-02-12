
public interface GenericList<T extends Object> {
	
	void addHead(T data);
	void addTail(T data);
	
	void removeHead();
	void removeTail();
	
	void insertAt(int index, T data);			//몇번째에 넣겠다는것.
	void removeAt(int index);
	
	T get(int index);
	int size();

}
