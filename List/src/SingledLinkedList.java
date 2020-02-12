
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
		
		this.head = newNode;	//위에서 constructor로 지정해서 else 필요없음
		
	}

	public void addTail(int data) {
		Node newNode = new Node (data, null);
		if (this.head == null)			//아무것도 없었을때
			this.head = newNode;		//head는 newNode
		else {					//있었다면
			this.tail.next = newNode;		// inner class라서 private여도
											//접근가능
		}

		this.tail = newNode;
	}
	
	public void removeHead() {
		
		if (this.head == null)
			return;				//함수에서 빠져나가라
		
		this.head = this.head.next;		//head의 next가 null일 가능성이 있기에
		
		if(this.head == null)			//새로운 head가 null값이라면
			this.tail = null;
	
	}
	
	public void removeTail() {		//꼬리부터 없애겠다고 했으니 비었는지 먼저 확인
		if (this.head == null)		//비어있다면
			return;
		
		Node prev = this.head;		//head부터 tail의 앞 Node인지 검사 prev를 머리로 설정
			while (prev.next != this.tail) 
				prev = prev.next;	//다음 prev로 넘어간다.
			
			
			prev.next = null;
			this.tail = prev;
		}
		
	//개수를 구하는 함수 일단 만들어야함
	public int size() {
		int count = 0;				
		Node next = this.head;		//head 부터 시작.
		
		while (next != null) {		//꼬리까지 가면서 카운트 증가
			next = next.next;
			count++;
			
		}
		return count;
	}
	
	
	
	public void insertAt(int index, int data) {
		int count = size();
		if (index < 0 || index >= count) {		//>= 에서 > 으로 바뀌면 코드가 달라짐..
			throw new IndexOutOfBoundsException();
		}
		//그 자리에 넣는다는건 기존 그 자리에 있던 애가 뒤로 밀린다는것.
		
		Node next = this.head;
		Node prev = null;
		while (index > 0) {		//index 가 0이면 루프 돌 필요 없음.count가 0이면 무조건 헤드에 넣는다는 뜻.
			prev = next;
			next = prev.next;
			index--;
		}
		
		Node newNode = new Node(data, next);
		
		if (prev == null) {			//count가 0인 경우(루프 안탔다는 뜻), prev가 null이라는건 무조건 헤드에 넣겠다
			if(next == null) {		//
				this.head = newNode;
				this.tail = newNode;
			}//next 가 null이 아니면 다음은 next를 가리켜야하는데 이미 가리키고 있으니까 else 필요업승
			
			this.head = newNode;
			
		}else {					//헤드가 아닌 다른데에 넣겠다는뜻
			prev.next = newNode;
			if (prev == this.tail) {	//(next == null) 이라고 해도 됨. 꼬리에 넣는경우...
				//여기가 새로 생기는거.. >이걸로 된다면.
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
