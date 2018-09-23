
public class MyImpl {
	public static void main(String[] args) {
			MyInterface.sayHello("Pranjali");//direct call for static
			new MyInterface() {}.sayGoodbye("Pranjali");//new object for default method
	}
}
