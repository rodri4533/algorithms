package Stack;

public class DinamicStack extends AbstractStack {

	private int size;
	
	private class Node {
		Object data;
		Node next;
		
		private Node ( Object data, Node next ) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node top;
	
	public DinamicStack() {
		size = 0;
	}
	
	@Override
	public Object pop() {
		if ( isEmpty() ) {
			System.err.println("Exception underflow of data in DinamicStack");
			return null;
		} else {
			Node temp = top;
			top = top.next;
			--size;
			return temp.data;
		}
	}
	
	@Override
	public void push (Object obj) {
		Node temp = new Node (obj, top);
		top = temp;
		++size;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public Object top() {
		return top.data;
	}
	
	
}

