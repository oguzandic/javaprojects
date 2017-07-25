package tr.org.linux.kamp.car;

public class Car {
	
	
	private int speed;
	private String brand;
	
	public Car(String brand, int speed) {
		
		this.brand = brand;
		
		if(speed > 0.0) {
			this.speed = speed;
		}
		

	}
	
	
	
//brand
	
	public String getBrand() {
		return brand;
	}
	
	public void setName(String brand) {
		this.brand = brand;
		
	}
	
	
// speed	
	
	
	
	public void setSpeed(int speed) {
		
		if(speed > 0.0) {
			this.speed = speed;
		}
	}
	
	
	public void speedUp (int inc) {
		if(inc > 0.0) {
			this.speed = speed + inc;
		}
	}
	
	public void speedDown (int dec) {
		if(dec > 0.0) {
			this.speed = speed - dec;
		}
	}
	
	public int getSpeed() {
		return speed;
		
	}
	
	
// gear 
	
	

	
	public String getGear() {
		
		String gear = "";
		
		if(speed == 0.0) {
			gear = "N";
		}
		
		else if(speed >= 0.0 && speed <= 20.0)  {
			gear = "1";
			
		}
		else if(speed > 20.0 && speed <= 40.0)  {
			gear = "2";
			
		}
		else if(speed > 40.0 && speed <= 80.0)  {
			gear = "3";
			
		}
		else if(speed > 80.0 && speed <= 120.0)  {
			gear = "4";
			
		}
		else if(speed > 120.0 && speed <= 160.0)  {
			gear = "5";
			
		}
		
		return  gear;
	}
	
	
	
	
	

}
