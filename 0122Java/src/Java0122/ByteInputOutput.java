package Java0122;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteInputOutput {

	public static void main(String[] args) {
		//try() 안에서는 자원은 close를 호출하지 않아도 된다.
		try(
				//파일에 기록하기 위한 인스턴스 생성
				//파일 경로만 설정하면 기록 할 때마다 새로 기록
				//두번째 매개변수로 true를 설정하면 존재하는 경우 이어쓰기를 한다.
				FileOutputStream fos = new FileOutputStream("./file.dat", true);
				//파일에서 읽어오기를 위한 인스턴스 생성
				FileInputStream fis = new FileInputStream("./file.dat");
			){
		
				//기록할 내용 만들기
				String msg = " 오늘은 점심 뭐 먹지?";
				//문자열을 바이트 배열로 만들기
				byte [] b = msg.getBytes();
				//기록
				fos.write(b);
				fos.flush();
				
				/*
				//한번에 읽기
				//읽을 데이터 개수 가져오기
				int len = fis.available();
				//읽을 데이터를 저장할 배열 생성
				b = new byte[len];			
				//데이터 읽기
				fis.read(b);	
				//바이트 배열을 문자열로 변환
				String date = new String(b);
				System.out.println(date);
				*/
				
				//용량이 큰 경우 한번에 읽으면 메모리 부족으로 예외가 생기거나 시간이 오래 걸릴수 있다.
				//나누어서 읽는 것이 효율적이다.
				
				
				//저장할 배열 생성 - 크기는 8의 배수로 생성하는 것이 일반적
				byte [] sh = new byte[8];
				while(true) {
				//sh 크기만큼 읽고 읽은 개수를 리턴
				int r = fis.read(sh);
				//r이 0보다 작거나 같으면 읽으넥 없음
				if(r <= 0) {
					break;
				}
				String str = new String(sh, 0, r);
				System.out.println(str);
				
				}
				//읽은 데이터가 있으면 처리
				//문자를 바이트로 읽어서 변환하지 않음
				//데이터를 사용할 때 배열을 바로 사용하면 안되고 0부터 읽은 개수만큼만 사용해야 한다.
				//전체를 사용하는 경우 읽은 개수가 부족하면 이상한 결과를 만든다.
				
				

		}catch(Exception e) {
			System.out.println("예외 내용: " + e.getMessage());
		}
		
	}

}
