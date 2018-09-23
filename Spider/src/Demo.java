
public class Demo<P> {//generics
	private P data;

	public Demo(P data) {
		this.data = data;
	}

	public P getData() {
		return data;
	}

	public void setData(P data) {
		this.data = data;
	}

	public static void main(String[] args) {
			Demo <String>d1 = new Demo<String> ("Hello");
			//d1.setData(1000);
			
			Demo<Integer> d2 = new Demo<Integer> (500);
			//d2.setData("Bye");
	}

}
