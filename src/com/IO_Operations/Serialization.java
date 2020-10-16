package com.IO_Operations;

import java.util.*;
import java.io.*;

public class Serialization {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		FileOutputStream fos = null;
		ObjectOutputStream objStream = null;
		System.out.println("Enter Employee Details");
		System.out.println("Enter Name Of Employee");
		emp.setName(sc.next());
		//sc.next();
		System.out.println("Enter Address Of Employee");
		emp.setAddress(sc.next());
		System.out.println("Enter SSN Of Employee");
		emp.setSSN(sc.nextInt());
		try {
			File f1 = new File("D:\\Capg_Personal\\FileIO Serialization\\src\\com\\IO_Operations", "serialization.txt");
			f1.createNewFile();
			fos = new FileOutputStream(f1);
			objStream = new ObjectOutputStream(fos);
			objStream.writeObject(emp);
		} catch (IOException i) {
			System.out.println(i.getMessage());
		} finally {
			System.out.println(
					"Serialized data is saved in D:\\Capg_Personal\\FileIO Serialization\\src\\com\\IO_Operations");
			try {
				fos.close();
				objStream.close();
			} catch (IOException i) {
				System.out.println(i.getMessage());
			}
		}

	}

}
