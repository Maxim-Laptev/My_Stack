
public class MyStack {
	private int[] stack;
	private int size;
	private int thisElement;
	public MyStack(int size) {
		this.size=size;
		stack=new int[size];
		thisElement=-1;
	}
	public boolean add(int el1) {
		if(thisElement==size-1) {
			System.out.println("Stack overflow, you can not add element.");
			return false;
		}
		else{
			thisElement++;
			stack[thisElement]=el1;
			return true;
		}
	}
	public int checkElement() {
		if(thisElement==-1) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			System.out.println(stack[thisElement]);
			return thisElement;
		}
	}
	public int remove() {
		if(thisElement==-1) {
			System.out.println("Stack is empty");
			return 0;
		}
		else {
			int num=stack[thisElement];
			stack[thisElement]=0;
			thisElement--;
			return num;
		}
	}
}
