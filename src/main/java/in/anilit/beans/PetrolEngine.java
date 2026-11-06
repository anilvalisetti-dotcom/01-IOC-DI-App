package in.anilit.beans;

public class PetrolEngine implements IEngine {
	
	
	
	public PetrolEngine() {
		System.out.println("PE :: Constructor");

	}
	
	
	public int start() {
		
		System.out.println("PE Started...");
	return 1;
	}

}
