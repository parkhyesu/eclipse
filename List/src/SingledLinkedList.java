
public class SingledLinkedList implements List {
	
	class Node {
		
		private int data;
		private Node next;
		
		
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
			
		}
				
	}
	
	private Node head;
	private Node tail;
	
	public SingledLinkedList(){
		
		this.head = null;
		this.tail = null;
	}
	
	public void addHead(int data) {
		Node newNode = new Node (data, this.head);
		if (this.head == null)
			this.tail = newNode;
		
		this.head = newNode;	//������ constructor�� �����ؼ� else �ʿ����
		
	}

	public void addTail(int data) {
		Node newNode = new Node (data, null);
		if (this.head == null)			//�ƹ��͵� ��������
			this.head = newNode;		//head�� newNode
		else {					//�־��ٸ�
			this.tail.next = newNode;		// inner class�� private����
											//���ٰ���
		}

		this.tail = newNode;
	}
	
	public void removeHead() {
		
		if (this.head == null)
			return;				//�Լ����� ����������
		
		this.head = this.head.next;		//head�� next�� null�� ���ɼ��� �ֱ⿡
		
		if(this.head == null)			//���ο� head�� null���̶��
			this.tail = null;
	
	}
	
	public void removeTail() {		//�������� ���ְڴٰ� ������ ������� ���� Ȯ��
		if (this.head == null)		//����ִٸ�
			return;
		
		Node prev = this.head;		//head���� tail�� �� Node���� �˻� prev�� �Ӹ��� ����
			while (prev.next != this.tail) 
				prev = prev.next;	//���� prev�� �Ѿ��.
			
			
			prev.next = null;
			this.tail = prev;
		}
		
	//������ ���ϴ� �Լ� �ϴ� ��������
	public int size() {
		int count = 0;				
		Node next = this.head;		//head ���� ����.
		
		while (next != null) {		//�������� ���鼭 ī��Ʈ ����
			next = next.next;
			count++;
			
		}
		return count;
	}
	
	
	
	public void insertAt(int index, int data) {
		int count = size();
		if (index < 0 || index >= count) {		//>= ���� > ���� �ٲ�� �ڵ尡 �޶���..
			throw new IndexOutOfBoundsException();
		}
		//�� �ڸ��� �ִ´ٴ°� ���� �� �ڸ��� �ִ� �ְ� �ڷ� �и��ٴ°�.
		
		Node next = this.head;
		Node prev = null;
		while (index > 0) {		//index �� 0�̸� ���� �� �ʿ� ����.count�� 0�̸� ������ ��忡 �ִ´ٴ� ��.
			prev = next;
			next = prev.next;
			index--;
		}
		
		Node newNode = new Node(data, next);
		
		if (prev == null) {			//count�� 0�� ���(���� �����ٴ� ��), prev�� null�̶�°� ������ ��忡 �ְڴ�
			if(next == null) {		//
				this.head = newNode;
				this.tail = newNode;
			}//next �� null�� �ƴϸ� ������ next�� �����Ѿ��ϴµ� �̹� ����Ű�� �����ϱ� else �ʿ����
			
			this.head = newNode;
			
		}else {					//��尡 �ƴ� �ٸ����� �ְڴٴ¶�
			prev.next = newNode;
			if (prev == this.tail) {	//(next == null) �̶�� �ص� ��. ������ �ִ°��...
				//���Ⱑ ���� ����°�.. >�̰ɷ� �ȴٸ�.
				this.tail = newNode;
			}
		}
	}
	
	public void removeAt(int index) {
		
		int count = size();
		if (count == 0 || index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}

		Node next = this.head;
		Node prev = null;
		while (index > 0) {
			prev = next;
			next = prev.next;
			index--;
		}

		if (prev == null) {
			if (next.next == null) {
				this.tail = null;
			}
			this.head = next.next;
		} else {
			if (next.next == null) {
				this.tail = prev;
			}
			prev.next = next.next;
		}
	}
		
		

	
	public int getAt(int index) {
		
		int count = size();
		if (count == 0 || index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}

		Node next = this.head;
		while (index > 0) {
			next = next.next;
			index--;
		}
		return next.data;
		
	}
	
	
}
