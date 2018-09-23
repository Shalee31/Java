
import java.io.*;
import java.io.IOException;
import java.nio.channels.*;

public class ChannelFileCopy {
	public static void main(String[] args) throws IOException {

		FileChannel sourceChannel = new FileInputStream("D:/Demo/vsc.exe").getChannel();
		FileChannel destChannel = new FileOutputStream("D:/Demo/vsx.exe").getChannel();
		
		long start = System.currentTimeMillis();
		destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
		long end = System.currentTimeMillis();
		System.out.println("Copy time " + (end - start) + " m.s.");
		
		sourceChannel.close();
		destChannel.close();
		
	}
}
