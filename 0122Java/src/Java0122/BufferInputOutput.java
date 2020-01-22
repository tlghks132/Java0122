package Java0122;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class BufferInputOutput {

	public static void main(String[] args) {
		try(PrintStream ps = new PrintStream(new FileOutputStream("./buf.dat"));
				BufferedInputStream bis = new BufferedInputStream(
						new BufferedInputStream(
								new FileInputStream("./buf.dat")));					
		){
			//기록하기
			ps.println("Hello Buffer");
			ps.flush();
			
			//읽기
			//읽을 데이터 크기 가져오기
			int len = bis.available();
			//읽은 데이터를 저장할 배열 생성
			byte [] b = new byte[len];
			//데이터 읽기
			bis.read(b);
			//읽은 데이터를 문자열로 변환해서 출력
			System.out.println(new String(b));			
			
			
			
			
		}catch(Exception e) {
			System.out.println("예외: " + e.getMessage());
			
		}
	}

}




































