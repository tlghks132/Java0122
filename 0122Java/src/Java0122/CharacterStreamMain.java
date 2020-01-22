package Java0122;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class CharacterStreamMain {
	public static void main(String[] args) {
		try(
				//파일의 문자 단위로 기록하기 위한 스트림
				PrintWriter pw = new PrintWriter("C:\\javaTest\\javaTest.txt");
				BufferedReader br = new BufferedReader(
						new FileReader("C:\\javaTest\\javaTest.txt"));												
				){
			
			
			
			pw.println("까치 까치 설날은 어저께 고요");
			pw.println("우리 우리 설날은 오늘 이래요");
			
			//파일의 내용 읽기
			while(true) {
				//한 줄 읽기
				String line = br.readLine();
				//다 읽었으면 중지
				if(line == null) {
					break;					
				}System.out.println(line);
				
			}
			
		}catch(Exception e) {
			System.out.println("예외:" + e.getMessage());
			
		}
		
	}
}




