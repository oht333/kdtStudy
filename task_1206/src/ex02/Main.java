package ex02;

import java.util.Scanner;

//오현택
public class Main {
	public static void main(String[] args) {
		//5명의 학생의 점수(1과목)를 입력받아 아래를 수행하는 프로그램
		// 총합 계산
		// 평균 계산
		// 최고점수와 해당 인덱스 출력
		
		// 점수는 배열에 저장하여 출력
		// 나중에 학생수를 사용자 입력할 수 있도록 변경할 예정이다
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println("각 학생의 점수를 입력하세요");
			arr[i] = sc.nextInt();
		}
		
		for(int j=0; j<arr.length; j++) {
			sum += arr[j];
		}
		
		System.out.println("총합 : " + sum);
		
		avg = sum / arr.length;
		System.out.println("평균 : " + avg);
		
		
	}
}
