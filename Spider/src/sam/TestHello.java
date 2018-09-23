package sam;

public class TestHello {
	public static void main(String[] args) {
		Hello h = new Hello() {
			// Anonymous inner class
			@Override
			public String sayHello(String name) {
				return "Hello " + name;
			}

		};
		System.out.println(h.sayHello("Pranjali"));

		// Lambda Expression works only with SAM (Single Abstract Method)
		Hello hi = (name) -> "Hola " + name;
		System.out.println(hi.sayHello("Pranjali"));

		System.out.println(hi);
		Hello.greet();
		h.seeOff();

	}
}
