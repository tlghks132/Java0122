package Java0122;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathUse {

	public static void main(String[] args) {
		//src 디렉토리에 있는 0.png 파일을 Path 객체로 생성
		Path path = Paths.get("./src/0.png");
		//복사할 파일 경로를 생성
		Path to = Paths.get("./src/zero.png");
		
		try {
			//path에서 to로 복사
			Files.copy(path, to);
		}catch(IOException e) {
			//TODO Auto-gennerated catch block
			e.printStackTrace();
		}

	}

}
