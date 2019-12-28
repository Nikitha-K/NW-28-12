//program to demonstrate the use of command line arguments
//Input data is given through command line 
//by passing the values into the main method
//Use Run Configuration button->Arguments Tab


public class CommandLineArgs {
	public static void main(String[] args){
		
		int code=Integer.parseInt(args[0]);
		String name=args[1];
		double sal=Double.parseDouble(args[2]);
		
		System.out.println(code++);
		System.out.println(code);
		System.out.println(name);
		System.out.println(sal+=5000);
		
	}
	
	
}
