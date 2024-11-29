//오현택
package task;

import java.util.Scanner;

public class ArrayTask01 {

	public static void main(String[] args) {
		//배열문제 조건 1) 칸수만 알고있다고 가정
		//		조건 2) 반드시 length 사용
//				조건 3) 값을 대입하는 반복문, 값을 출력하는 반복문 각각 사용
		
		//1. 100~1까지의 값을 배열에 넣고 출력
		//일반 for문만 사용
		//1) int[] num 에 일단 100개의 배열을 선언
		//2) for문을 써서 num[i]을  i + 1 으로 담기
		//3) for문을 써서 num[j]를 출력
		int[] num = new int[100];
		
		for(int i=0;i<100;i++) {
			num[i] = i + 1;
		}
		
		for(int j=0;j<100;j++) {
			System.out.println(num[j]);
		}
		
		System.out.println("=====================================");
		
		//2. 1~10까지의 값을 배열에 넣고 총 합 구하기
		//일반 for문만 사용
		//1) 1번문제의 2)까지 동일
		//2) 총합 sum을 초기화 해주고, for문에서 num2.length까지 '+='을 계산하기
		//3) sum 출력
//		int[] num2 = new int[10];
//		
//		for(int i=0;i<10;i++) {
//			num2[i] = i + 1;
//		}
//		
//		int sum = 0;
//		
//		for(int j=0;j<num2.length;j++) {
//			sum += num2[j];
//		}
//		
//		System.out.println("1부터 10까지의 총 합 : " + sum);
//		
//		System.out.println("=======================================");
		
		//3. 사용자에게 4개의 숫자를 입력받고 입력받은 값을 배열에 저장한 후 배열의 평균 구하기
		//일반 for문, for-each문 상관없음
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
		
		
		
		//4. 0, 1, 2, 3, 4, 0, 1, 2, 3, 4 값을 배열에 담고 출력
		//출력시 for-each문 사용
		
		
		//5. A~F까지를 C만 제외하고 배열에 담아 출력
		//일반 for문
		//초기식 int i = 0;
		
		//6. aBcDeFgHiJkLmNoPqRsTuVwXyZ를 순서대로 배열에 담아 출력
		
		
		//7. 5개의 정수를 입력한 뒤 배열에 담고 최소값과 최대값 출력하기
		//일반 for문
		
		//8. 사물함의 비밀번호를 설정하고 사용자에게 이용할 사물함 번호와 비밀번호를 입력받아
		// 입력된 사물함의 비밀번호와 설정한 비밀번호를 비교하여 일치 여부 출력하기
		
		//9. 학생 1명의 3과목 총점과 평균(소수점 3자리)을 구하고 출력하기
		//	3과목은 배열에 입력받아 저장하며 for-each문만 사용(일반 for문 사용금지!!)
	}

}
