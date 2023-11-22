package pbuild;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class pbuild7 {
	public static void main(String[] arg) throws IOException {
		// creating list of commands
		List<String> commands = new ArrayList<String>();
		commands.add("powershell.exe");
		commands.add("dir"); // command
		//commands.add("-l"); // command
		//commands.add("/Users/abhishekverma"); // command in Mac OS

		// creating the process
		ProcessBuilder pb = new ProcessBuilder(commands);

		// startinf the process
		//QUE PINTA AQUÍ LA CLASE Process
		Process process = pb.start();

		// for reading the ouput from stream
		BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String s = null;
		while ((s = stdInput.readLine()) != null) {
			System.out.println(s);
		}
	}
}
