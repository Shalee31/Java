import java.io.*;

public class SerialDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person("Polo", 21);
		System.out.println(p);

		// Serializing person object
		FileOutputStream fos = new FileOutputStream("D:/Demo/pers.dat");
		ObjectOutputStream ostream = new ObjectOutputStream(fos);
		ostream.writeObject(p); // Object Serialized
		ostream.close();
		fos.close();

		// Deserializing person object
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream("D:/Demo/pers.dat"));
		Object po = istream.readObject();
		System.out.println(po);
		istream.close();
	}
}
