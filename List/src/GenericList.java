
public interface GenericList<T extends Object> {
	
	void addHead(T data);
	void addTail(T data);
	
	void removeHead();
	void removeTail();
	
	void insertAt(int index, T data);			//���°�� �ְڴٴ°�.
	void removeAt(int index);
	
	T get(int index);
	int size();

}
