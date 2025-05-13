package act11;

import java.io.File;

public class main {

	public static void main(String[] args) {
		
		File a = new File("C:\\Users\\Acer\\Documents");
		
		System.out.println("Does it exist? "+a.exists());
		System.out.println("Can it read? "+a.canRead());
		System.out.println("Can it be Written? "+a.canWrite());
		System.out.println("Is it a directory? "+a.isDirectory());
		System.out.println("Is it a file? "+a.isFile());
		System.out.println("Is it absolute? "+a.isAbsolute());
		System.out.println("Is it Hidden? "+a.isHidden());
		System.out.println("Absolute path is "+a.getAbsolutePath());
		System.out.println("What is it name? "+a.getName());
		System.out.println("Last Modified on "+ new java.util.Date(a.lastModified()));
		System.out.println("The file has "+a.length()+" bytes");
		

	}

}
