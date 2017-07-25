package tr.org.linux.kamp.car;

public class CarFactory {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("BMW",0);
		Car car2 = new Car("Toyota", 90);
		Car car3 = new Car("VW", 123);
		
		System.out.println("Birinci arabanın markası " + car1.getBrand() + " hızı " + 
		car1.getSpeed() + " vitesi " + car1.getGear() );
		
		System.out.println("İkinci arabanın markası " + car2.getBrand() + " hızı " + 
		car2.getSpeed() + " vitesi "+ car2.getGear());
		
		System.out.println("Üçüncü arabanın markası " + car3.getBrand() + " hızı " +
		car3.getSpeed() + " vitesi " + car3.getGear());
	}
	

	
}
