
public interface List {

	void addHead(int data);
	void addTail(int data);
	
	void removeHead();
	void removeTail();
	
	void insertAt(int index, int data);			//몇번째에 넣겠다는것.
	void removeAt(int index);
	
	int getAt(int index);
	int size();
	
}
