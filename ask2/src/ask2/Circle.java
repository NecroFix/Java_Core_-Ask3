package ask2;

public class Circle {
	private double radius;
	private double diameter;
	
	Circle(){
		this.radius = 16.14;
		this.diameter = 12.57;
	}
	
	public void squareCircle() {
		double Pi = 3.141592;
		double S = Pi * (diameter * diameter);
		System.out.println("Площа кола = "+S);
	}
	
	public void lengthCircle(){
		double Pi = 3.141592;
		double L = 2 * Pi * radius;
		System.out.println("Довжина кола = "+L);
	}
	
	public String toString() {
		
		return "Cirle [radius ="+ radius + ", diameter = "+ diameter+"]" ;
	}
	
	
	public static void main (String [] args) {
		
		Circle c = new Circle ();
		
		System.out.println();
		c.squareCircle();
		
		System.out.println();
		c.lengthCircle();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
