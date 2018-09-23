
public class ThreadYield {
	class HelloThread extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.println("Hello");
				yield();
			}

		}

	}

	class WorldThread extends Thread {

		@Override
		public void run() {
			while (true) {
				System.out.println("World");
				yield();
			}
		}

	}

	public static void main(String[] args) {
		ThreadYield yield = new ThreadYield();
		HelloThread hello = yield.new HelloThread();

		WorldThread world = yield.new WorldThread();

		hello.start();
		world.start();

	}
}
