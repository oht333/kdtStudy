package method;
//2번 : stack메모리
public class StackMethod {
   public static void main(String[] args) {	//1. main()메소드부터 실행된다. (stack영역에 main stack프레임이 생성된다)
	  //1. main메소드 실행 -> 스택에 main 스택프레임이 생성
	  //	변수 result가 main 스택 프레임에 저장됨
	  //2. add메소드 호출 -> 스택에 add 스택프레임이 생성
//	  // 	매개변수 num1, num2, sum변수가 add 스택프레임에 저장됨
	  //3. add메소드 종료 -> add 스택 프레임 삭제
	  //	sum, num1, num2가 메모리에서 제거됨
	  //4. main메소드 종료 -> main 스택 프레임 삭제
      StackMethod sm = new StackMethod();
      
      int result = sm.add(10, 20);
      System.out.println(result);	//stack영역에 있는 sum을 불러온 다음에 메모리에서 삭제된다.
      
   }
   
   int add(int num1, int num2) {
      int sum = num1 + num2;   
      return sum;
   }
}
