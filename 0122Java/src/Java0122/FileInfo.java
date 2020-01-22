package Java0122;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		//절대 경로를 이용해서 파일 인스턴스 생성 
		//File f = new File("C:\\Users\\tlghk\\Documents\\image\\0.png");
		
		//상대 경로를 이용해서 파일 인스턴스 생성: 파일을 프로젝트 디렉토리에 복사하고 실행
		File f = new File("./src/0.png");
		//파일의 조재 여부 확인 - 서버 & 클라이언트 환경에서 클라이언트에 파일 존재여부를 확인해서 다운로드
		boolean isExists = f.exists();
		System.out.println("존재 여부: " + isExists);		
		//파일의 마지막 수정시간 확인 - 업데이트할 때 이 시간이 서로 다르면 다운로드
		long modify = f.lastModified();
		System.out.println("마지막 수정시간: " + modify);
		
		//수정시간을 우리가 사용하는 시간으로 변경
		Date date = new Date(modify);
		System.out.println("마지막 수정시간: " + date);
		
		//파일크기 확인 - 업데잍트 할 때도 사용할 수 있고 다운로드 여부를 판정하는데도 이용
		//파일 크기를 알려줘서 다운로드 여부를 판단하도록 하는 경우가 있다.
		long size = f.length();
		System.out.println("파일크기:" + size);
		
	}

}
