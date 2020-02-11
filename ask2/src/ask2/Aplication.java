package ask2;

public class Aplication {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle ();
		Rectangle r2 = new Rectangle(25,35);
		
		System.out.println(r1);
		
		System.out.println();
		r1.perimetr();
		r1.square();
		
		System.out.println(r2);
		
		System.out.println();
		r2.perimetr();
		r2.square();
	}

}
