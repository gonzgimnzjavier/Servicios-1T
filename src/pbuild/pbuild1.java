package pbuild;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pbuild1 {
	public static void main(String[] arg) throws IOException
	{
	// creating list of process
	List<String> list = new ArrayList<String>();
	list.add("notepad.exe");

	// create the process
	ProcessBuilder build = new ProcessBuilder(list);

	// checking the command i list
	System.out.println("command: " + build.command());
	
	//despues de chequear el proceso lo lanzo
	build.start();
	

	}
}
