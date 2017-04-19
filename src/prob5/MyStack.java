package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	
	public MyStack( int capacity ) {
		top = -1;
		resize( capacity );
	}

	public void push( String s ) {
		if( ++top == buffer.length ) {  // stack is full
			resize( buffer.length*2 );
		}
		buffer[ top ] = s;
	}

	public String pop() throws MyStackException {
		if( isEmpty() ) { 
			throw new MyStackException( "stack is empty" );
		}
		
		return buffer[ top-- ];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	private void resize( int capacity ) {
		String[] temp = new String[ capacity ];
		
		int count = ( capacity > top ) ? top : capacity;
		for( int i = 0; i < count; i++ ) {
			temp[ i ] = buffer[ i ];
		}
		
		buffer= temp;
	}
}
