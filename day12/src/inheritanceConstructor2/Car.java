package inheritanceConstructor2;

public class Car {
	//필드
	String brand;
	String color;
	int price;
	
	//메소드
	void engineStart() {
		System.out.println("시동이 켜졌습니다");
	}
	
	void engineStop() {
		System.out.println("시동이 꺼졌습니다");
	}

	//생성자
	public Car() {
		super();
	}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	
}