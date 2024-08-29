
public class LinkedLink {
	public LinkedLink() {
		super();
		this.head = null;
	}
	public Node head;
	public void addFirst(int data)
	{
		Node newNode= new Node(data);
		newNode.next= head;
		head = newNode;
	}
	
	public void display()
	{
		Node temp = head;
		
		while (temp!=null)
		{
			System.out.print(temp.getDatabase()+"->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public void addLast(int data)
	{
		Node temp = head;
		Node last = null;
		while (temp.next!=null)
		{
			temp=temp.next;
		}
		Node newNode = new Node(data);
		temp.next=newNode;
	}
	
	public void add(int data, int index) {
	    if (index < 0) {
	        System.out.println("Index cannot be negative.");
	        return;
	    }

	    if (index == 0) {
	        addFirst(data);
	        return;
	    }

	    Node temp = head;
	    int count = 0;

	    while (temp != null && count < index - 1) {
	        temp = temp.next;
	        count++;
	    }

	    if (temp == null) {
	        System.out.println("Index out of bounds.");
	        return;
	    }

	    Node newNode = new Node(data);
	    newNode.next = temp.next;
	    temp.next = newNode;
	}
	
	public int length()
	{
		int count=0;
		Node temp=head;
		while (temp!=null)
		{
			count=count+1;
			temp=temp.next;
		}
		return count;
	}
	
	public void deleteFirst() {
		if (head != null) {
            head = head.next;
        }
	}
}
