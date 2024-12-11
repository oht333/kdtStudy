package ex05_오현택;

import java.util.Arrays;

public class Zoo {
//	필드
//    Animal[] animals : 동물 객체 배열
//    int animalCount : 현재 동물 수
//    생성자
//    배열 크기를 매개변수로 받아 초기화
//    메소드
//    void addAnimal : 동물을 배열에 추가, 매개변수는 참조변수의 다형성 이용할 것
//        배열 크기를 초과하면 "더 이상 동물을 추가할 수 없습니다"를 출력
//    void printAllAnimals() : 모든 동물의 이름과 행동을 출력
	//1) 필드 만들기
	//2) 생성자 만들기 (매개변수 : 배열크기?) 
	//3) addAnimal 메서드 : 객체를 만들어서 인수를 동물이름 넣고, 객체명.메소드()로 호출
	//4) Arrays.toString으로 printAllAnimals메소드의 배열 출력
	Animal[] animals;
	int animalCount;
	
	Animal a = new Pet("돼지");
	
	public Zoo(Animal[] animals) {
		super();
		this.animals = animals;
	}
	
	void addAnimal(Animal animal) {
		a.performActions();
	}
	
	void printAllAnimals(Animal[] animals) {
		System.out.println(Arrays.toString(animals));
	}
	
}
