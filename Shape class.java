
public abstract class Shape {
	
	protected double length;
	protected double breadth;
	protected double radius;
	
	public Shape(){
		
	}
	public static void main(String[] args){
	}
	
	
	public Shape(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	 
    public Shape(double radius) {
		super();
		this.radius = radius;
	}

    abstract double area();


}
