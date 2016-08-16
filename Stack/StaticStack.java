package Stack;

public class StaticStack extends AbstractStack {
	
	private int top;
	private Object arr[];
	private int size; 
	
	public StaticStack( int size ) {
		
		this.size = size;
		arr = new Object[size];
		top = 0;
	}
	
	@Override
	public Object pop() {
		if ( isEmpty() ) {
			System.err.println("Exception underflow of data in StaticStack");
			return null;
		} else {
			return arr[--top];
		}
	}
	
	@Override
	public void push( Object obj ) {
		if ( isFull() ) {
			System.err.println("Exception overflow of data in StaticStack");
			System.exit(0);
		} else {
			arr[top++] = obj;
		}
	}
	
	@Override
	public boolean isEmpty() {
		return top == 0;
	}
	
	public boolean isFull() {
		return top == arr.length;
	}
	
	public Object top() {
		if ( isEmpty() ) {
			System.err.println("Exception no data in StaticStack");
			return null;
		} else {
			return arr[top - 1];
		}
	}
	
	public int maxSize() {
		return size;
	}
	
	public int size() {
		return top;
	}
}
