package chapter21.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip")) {
			millisecond = System.currentTimeMillis() - millisecond;

			int i;
			while ((i = fis.read()) != -1) {

				fos.write(i);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 " + millisecond + "millisecond 소요되었습니다.");
	}

}
