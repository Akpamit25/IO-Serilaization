package com.IO_Operations;

import java.util.*;
import java.io.*;

public class DeSerialization {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		Employee emp1 = null;
		FileInputStream fis = null;
		ObjectInputStream objStream1 = null;

		try {
			//File f1 = new File("D:\\Capg_Personal\\FileIO Serialization\\src\\com\\IO_Operations", "serialization.txt");
			//f1.createNewFile();
			fis = new FileInputStream("D:\\Capg_Personal\\FileIO Serialization\\src\\com\\IO_Operations\\serialization.txt");
			objStream1 = new ObjectInputStream(fis);
			emp1 = (Employee)objStream1.readObject();
			objStream1.close();
			fis.close();
		}
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}
		catch(ClassNotFoundException i)
		{
			System.out.println("Employee Class Not Found");
		}
		finally {
			System.out.println("Employee Name : "+emp1.getName());
			System.out.println("Employee Address : "+emp1.getAddress());
			System.out.println("Employee SSN : "+emp1.getSSN());
		}
	}

}
