package pbuild;

import java.io.IOException;

public class pbuild8 {

	public static void main(String[] arg) throws IOException, InterruptedException {
		ProcessBuilder pb = new ProcessBuilder("powershell.exe", "echo",
				"Hello GeeksforGeeks" + "This is ProcessBuilder Example");
		pb.inheritIO();
		Process process = pb.start();
		// esperando a que termine la ejecucuion de echo
		process.waitFor();

	}
}
