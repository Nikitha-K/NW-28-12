//describes concrete and abstract class

public class ClassOneAppn extends ClassOne {

	public ClassOneAppn(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){		
		ClassOne one = new ClassOneAppn(5,6);
		one.output();
		}
	
	@Override
		void output() {
		// TODO Auto-generated method stub
		System.out.print("Over ridden data");
	}
	
}
