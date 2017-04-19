package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	
	public MyStack( int capacity ) {
		top = -1;
		resize( capacity );
	}

	public void push( String s ) {
		if( top == buffer.length - 1 ) {  // stack is full
			resize( buffer.length*2 );
		}
		buffer[ ++top ] = s;
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
		if( capacity - 1 < top ) { // 현재 크기 보다 작게 리사이징 할 경우
			top = capacity - 1;
			return;
		}

		String[] temp = new String[ capacity ];

		for( int i = 0; i <= top; i++ ) {
			temp[ i ] = buffer[ i ];
		}
		
		buffer= temp;
	}
}
