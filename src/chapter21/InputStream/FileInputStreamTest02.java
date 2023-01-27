package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {

	public static void main(String[] args) {
		// 한글깨짐
		// FileInputStream fis = null;

		FileReader fis = null;
		try {
			// fis = new FileInputStream("Input.txt");
			fis = new FileReader("Input.txt");
			int i;
			// fis.read();
			while ((i = fis.read()) != -1) {
				System.out.println((char) i + " ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				//NullPointerException을 잡지 못해서 죽음
				//catch
				
			} catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("end");
	}

}
