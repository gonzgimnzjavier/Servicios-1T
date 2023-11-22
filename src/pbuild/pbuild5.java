package pbuild;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pbuild5 {
	public static void main(String[] arg) throws IOException {
		// creating list of commands
		List list = new ArrayList();

		list.add("notepad.exe");
		list.add("xyz.txt");

		// creating the process
		ProcessBuilder build = new ProcessBuilder(list);

		// checking if error stream is redirected
		System.out.println(build.redirectErrorStream());

	}
}
