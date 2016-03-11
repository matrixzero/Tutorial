package Object;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class InputOutputStream {
	
	public static void GhiFile_BufferedWriter(String s,ArrayList<Human> arr){
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(s));
			int i;
			for(i=0;i<arr.size();i++){
				writer.write(arr.get(i).toString()+"\r\n");
			}
			writer.close();
			System.out.println("ghi file thanh cong");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void DocFile_BufferedReader(String s){
		
		String a="";
		try {
			BufferedReader read = new BufferedReader(new FileReader(s));
			String chuoi="";
			try {
				while((chuoi=read.readLine())!=null){
					a+=chuoi;
					System.out.println(a);
					a="";
				}
				read.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void DocFile_Scanner(String s) throws FileNotFoundException{
		
		String a="";
		Scanner scan = new Scanner(new File(s));
		while(scan.hasNextLine()){
			a=scan.nextLine();
			System.out.println(a);
			a="";
		}
		scan.close();
	}
	public static void GhiFile_PrintWriter(String s,ArrayList<Human> arr){
		
		try {
			PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter(s)));
			int i;
			for(i=0;i<arr.size();i++){
				print.print(arr.get(i).toString()+"\r\n");
			}
			System.out.println("Ghi file thanh cong");
			print.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("deprecation")
	public static void DocFile_DataStream(String s){
		
		String a="";
		try {
			DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
			String chuoi="";
			try {
				while((chuoi=input.readLine())!=null){
					a+=chuoi;
					System.out.println(a);
					a="";
				}
				input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void GhiFile_DataStream(String s,ArrayList<Human> arr) throws IOException{
		
		try {
			DataOutputStream output = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(s)));
			int i;
			for(i=0;i<arr.size();i++){
				output.writeUTF(arr.get(i).toString()+"\r\n");
			}
			output.close();
			System.out.println("ghi file thanh cong");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws IOException {
		
		ArrayList<Human> arr = new ArrayList<Human>();
		
		String s="D:/tien/tien.txt";
		
		Employment emp = new Employment("tien", 28, 1987, 2.0);
		arr.add(emp);
		
		EmployGuard emp1 = new EmployGuard("hau", 28, 1987, 3.0);
		arr.add(emp1);
		
		Manager_CompositePatern manager = new Manager_CompositePatern("Mom", 54, 1954, 3.0);
		manager.setEmployment(emp);
		manager.setEmployguard(emp1);
		arr.add(manager);
		
		GhiFile_DataStream(s, arr);
	}

}
