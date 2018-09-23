import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		String path = "D:/song.txt";
		FileWriter fw = new FileWriter(path, true); // Opening file in char stream//true for append
		BufferedWriter writer = new BufferedWriter(fw); // Wrapping Buffer around stream

		// Writing content to file
		writer.write("Hello World");
		writer.newLine();
		writer.write("I am waiting for a chance to see your face");
		writer.newLine();
		writer.write("I am carving to see  the different kind of place");
		writer.close();
		fw.close();

	}
}
