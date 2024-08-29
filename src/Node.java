
public class Node {
	private int database;
	public Node next;
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		this.database = database;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int database) {
		this.next=null;
		this.database = database;
	}
	
	
}
