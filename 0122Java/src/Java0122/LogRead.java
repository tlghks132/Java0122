package Java0122;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LogRead {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\javaTest\\log.txt"))){			
			//파일의 내용을 줄단위로 읽기

			
			//트래픽의 합계를 저장할 변수
			int total = 0;
			//접속한 IP 주소를 중복 없이 전부 출력
			HashSet<String> set = new HashSet<String>();
			//접속한 IP 별 트래픽 합계 구하기
			//Map에서 없는 Key를 사용하면 Null이 리턴
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}				
				//System.out.println(line);
				//공백을 기준으로 분할
				String [] ar = line.split(" ");		
				
				
				//ip를 가지고 데이터가 있는지 확인
				Integer traffic = map.get("");
				//없는 데이터면 traffic 은 0
				if(traffic == null) {
					traffic = 0;
				}
				try {
					traffic = traffic + Integer.parseInt(ar[ar.length]);
				}catch(Exception e) {}
				//map 에 저장 - 동일한 key 저장을 하면 업데이트
				map.put(ar[0], traffic);
				
				
				
				//가장 마지막 데이터부터 출력
				//System.out.println(ar[ar.length -1]);
				
				//Set에 첫번째 항목 저장 - 중복된 데이터는 저장하지 않음
				set.add(ar[0]);
				
				//가장 마지막 데이터를 정수로 변환해서 total에 추가
				//예외가 발생해서 중단되면 try~catch로 감싸면 예외가 발생해도 계속 수행된다.
				try {
				total = total + Integer.parseInt(ar[ar.length-1]);					
				}catch(Exception e) {}
			}
			System.out.println("트래픽 합계: " + total);
			System.out.println("===================");
			//Set 출력
			for(String ip : set) {
				System.out.println(ip);
			}
			System.out.println("===================");
			
			
			//Map의 key와 Value를 전부 출력
			Set<String> keys = map.keySet();
			for(String key : keys) {
				System.out.println(key + ":" + map.get(key));
			}
			
						
		}catch(Exception e) {
			System.out.println("예외:" + e.getMessage());
		}

	}

}













