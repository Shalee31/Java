//ways to write class
public class EventDemo implements Event {

	@Override
	public void doSomething() {
		System.out.println("First Event");
	}

	static class EventImpl implements Event {
		// inner class
		@Override
		public void doSomething() {
			System.out.println("Second Event");
		}
	}

	// class inside a method
	public void doingSomething() {
		class InnerEventImpl implements Event {
			// cannot be public, private or static
			@Override
			public void doSomething() {
				System.out.println("Third Event");
			}
		};
		Event e = new InnerEventImpl();
		e.doSomething();
	}

	public void doingSomethingAgain() {
		Event e = new Event() {
			// new Event() {
			// Anonymous Inner Class
			@Override
			public void doSomething() {
				System.out.println("Fourth Event");
			}
			// }.doSomething();
		};
		e.doSomething();
	}

	public void doingSomethingLastTime() {
		// Lambda Expressions
		Event e = () -> System.out.println("Fifth Event");
		e.doSomething();
	}

	public static void main(String[] args) {
		EventDemo demo = new EventDemo();
		demo.doSomething();

		// EventImpl impl= demo.new EventImpl();
		EventImpl impl = new EventDemo.EventImpl();// if inner class is static
		impl.doSomething();

		demo.doingSomething();
		demo.doingSomethingAgain();
		demo.doingSomethingLastTime();
	}
}
