package io.ridham._20_fileIO;

import java.io.*;

// FileWriter and BuffredWriter has some problems
// All problem solved in PrintWriter(Most Enhanced Writer)
public class G {
	public static void main(String[] args) throws IOException {
		
		//PrintWriter can work with BW or FW
		PrintWriter out = new PrintWriter(new FileWriter("E://abc.txt"));
		
		out.write(100);		// this will print d
		out.print(100);		// this will print 100
		
		out.write("Hello");
		
		out.print(10.0);
		out.println("There");	// println adds new line
		
		out.println(true);
		
		out.flush();
		out.close();
	}
}


/*
							data
							----
		character							binary
		---------							------
writers		printers				OutputStram		InputStream
-------		--------				-----------		-----------
====================================================================

											Object
											------
						Writer										Reader
						------										------
OutputStreamWriter			BufferWriter			InpurStramReader		BufferReader
------------------			------------			----------------		------------
	FileWriter		BufferWriter	PrintWriter			FileReader
	----------		------------	-----------			----------





*/
