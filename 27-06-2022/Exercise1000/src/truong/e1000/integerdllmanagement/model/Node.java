package truong.e1000.integerdllmanagement.model;

public class Node {
	Node prev;
	Node next;
	private int data;
	
	public Node (int data) {
		this.setData(data);
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
