package chapter11;

public class CarMain {
	/*

	public static void main(String[] args) {
		method(new ManualCar());
		System.out.println("---------------");
		method(new AiCar());
		System.out.println("---------------");
		

	}
	
	public static void method(Car car) {
		car.drive();
		car.stop();
	}
	*/
	
	public static void main(String[] args) {
	
	System.out.println("------자율주행------");
	Car mycar = new AiCar();
	mycar.run();
	
	System.out.println("------사람이 운전하는 자동차------");
	Car hiscar=new ManualCar();
	hiscar.run();
}
}
