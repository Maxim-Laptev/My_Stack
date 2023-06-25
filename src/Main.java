
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack stack=new MyStack(10);
		stack.add(24);
		stack.add(3123);
		stack.add(23);
		System.out.println("At the moment, the top of the stack is the element:");
		System.out.println(stack.checkElement());
		System.out.println("We are now removing this element:");
		System.out.println(stack.remove());
		System.out.println("_______");
		System.out.println("At the moment, the top of the stack is the element:");
		System.out.println(stack.checkElement());
		System.out.println("We are now removing this element:");
		System.out.println(stack.remove());
		System.out.println("_______");
		System.out.println("At the moment, the top of the stack is the element:");
		System.out.println(stack.checkElement());
		System.out.println("We are now removing this element:");
		System.out.println(stack.remove());
		System.out.println("_______");
		
	}

}
