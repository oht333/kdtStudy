package task3;

import java.util.Scanner;

//3. 사용자로부터 정수를 입력받아, 입력받은 정수가 0에서 100 사이의 값인 경우, 
//입력받은 정수를 2배한 값을 출력하고, 그 외의 값이 입력될 경우 
//"잘못된 입력입니다"라는 예외 메시지를 출력하세요.

class NotValidNumberException extends Exception{
	public NotValidNumberException(String num) {
		super(num);
	}
}

public class DoubleMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = " ";
		
		System.out.println("숫자를 입력하세요");
		
		str = sc.nextLine();
	}
}
