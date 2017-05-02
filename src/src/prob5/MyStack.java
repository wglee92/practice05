package prob5;

public class MyStack {
	public String[] buf;
	public int top = 0;
	
	public MyStack(int num) {
		buf = new String[num];
	}
	
	public void push(String s) {
		if (top < buf.length) {
			buf[top] = s;
			top++;
		}
		else {
			
		}
	}
	
	public boolean isEmpty() {
		if (top == 0)
			return true;
		else return false;
		
	}
	
	public String pop() {
		return buf[top--];
	}

}
