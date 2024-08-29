
public class main {
	public static void main(String[] args) {
		LinkedLink newlink = new LinkedLink();
		newlink.addFirst(3);
		newlink.addFirst(1);
		newlink.addFirst(4);
		newlink.addFirst(7);
		newlink.addLast(10);
		newlink.add(2, 2);
		newlink.display();;
		System.out.println(newlink.length());
		newlink.deleteFirst();
		newlink.display();
		newlink.deleteFirst();
		newlink.display();
		newlink.deleteFirst();
		newlink.add(100, 0);
		newlink.display();
	}
}
