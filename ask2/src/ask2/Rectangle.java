package ask2;

public class Rectangle {
	private int length;
	private int width;
	
	Rectangle ( int length, int width ){
	this.length = length;
	this.width = width;
	}
	public int getlength() {
		return length;
	}
	
	public void setlength(int length) {
		this.length = length;
	}
	
	public int getwidth () {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
	Rectangle () {
		this.length = 35;
		this.width = 18;
	}
	
	public void perimetr(){
		int p = 2 * (length+width);
		System.out.println("Периметр прямокутника = "+p);
	}
	public void square() {
		int s = length * width;
		System.out.println("Площа прямокутника = "+s);
	}
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width +"]";
	}
}
