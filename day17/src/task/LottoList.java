package task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoList {
	public static void main(String[] args) {
		// ArrayList, HashSet을 사용하여 중복을 허용하지 않는 6개의 랜덤숫자를 저장
		// Random 클래스를 이용하여 1부터 45사이의 랜덤 숫자를 생성하고 
		//정렬해서 출력
		List<Integer> list = new ArrayList<>();
		
		System.out.println("로또 자동으로 선택하셨습니다. 6개의 랜덤 숫자를 뽑습니다.");
		
		for(int i=1; i<=6; i++) {
			int temp = (int)(Math.random() * 44) + 1;
			list.add(temp);
		}
		
		Collections.sort(list);
		
		System.out.println("당신이 뽑은 당첨번호숫자 : " + list);
		
		
	}
}
