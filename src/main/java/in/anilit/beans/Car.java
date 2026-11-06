package in.anilit.beans;

public class Car {
	
	private IEngine eng;
	
	public Car() {
		System.out.println("Car :: Constructor");

	}
	
	
	
	public void setEng(IEngine eng) {
		
		System.out.println("SetEng() Method called");

		this.eng=eng;
	}
	
	
	public void drive() {
		int status=eng.start();
		if(status>=1) {
			System.out.println("J Started...");

		}
		else {
			System.out.println("J N  Started engine troubled...");

		}
	}

}
