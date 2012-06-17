package szymon.scjp.examexample._24;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilesPlay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		simplestCreation("fileWrite2.txt");
		fileWriterAndReader("#!?.&*"); // shall print exception trace
		fileWriterAndReader("fileWrite3.txt");
		BufferedWriterAndReader("fileWrite4.txt");
		printWriterDemo("fileWrite5");
	}
	
	private static void simplestCreation(String name) {
		System.out.println("\nSimplest file creation: ");
		File file = new File(name); // There's no file yet
		try {
			boolean result = file.createNewFile();
			System.out.println("Trying to create a file: " + file);
			System.out.println("Status: " + (result ? "file doesn't exist" :"file exists"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void fileWriterAndReader(String name) {
		System.out.println("\nFileWriter and FileReader demo. Tested file: " + name);
		
		char[] in = new char[50]; // to store input
		int size = 0;
		try {
			
			// WRITING
		
			File file = new File(name);
			FileWriter fw = new FileWriter(file); 			// create an actual file & a FileWriter obj
			fw.write("howdy\nfolks\n"); 	// write characters to the file
			fw.flush(); 					// flush before closing
			fw.close(); 					// close file when done
			
			// READING 
			
			FileReader fr = new FileReader(file); 			// create a FileReader object
			size = fr.read(in); 			// read the whole file!
			System.out.println("File size: " + size); 	// how many bytes read
			for(char c : in) 				// print the array
			System.out.print(c);
			fr.close(); 					// again, always close
			
		} catch(IOException e) { 
			e.printStackTrace();
		}
	}
	
	private static void BufferedWriterAndReader(String name) {
		System.out.println("\nBufferedWriter and BufferedReader demo. Tested file: " + name);
		
		File file = new File("name"); // create a File object
		try {
			
			// WRITING 
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Elo elo");
			bw.newLine(); // very simple method for creating a new line
			bw.write("3 5 0");
			bw.flush();
			bw.close();
			fw.close();
			
			// READING
			
			useBufferedReader(file);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void useBufferedReader(File file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}
	
	private static void printWriterDemo(String name) {
		System.out.println("\nPrintWriter demo. Tested file: " + name);
		
		try {
			//PrintWriter pw = new PrintWriter(name); // Possible directly with the name (starting JAVA 5)
			File file = new File(name);
			PrintWriter pw = new PrintWriter(file); // In the earlier versions of Java a Writer has to be used
			pw.println("howdy"); // write the data
			pw.println("folks");
			pw.flush();
			pw.close();
			
			useBufferedReader(file);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
