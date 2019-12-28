
public class StudentExam extends LibraryDetails{
	private int sub1;
	public StudentExam(int regno, String stdname, String group, int bkDue, int sub1, int sub2) {
		super(regno, stdname, group, bkDue);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}

	private int sub2;
	
	//Constructors are generated
	
	

	/*public StudentExam(){
		sub1=70;
		sub2=90;
		} */
	
	public void display(){
		System.out.println("from sub class");
		
	}
		
	public void output(){
		int total=sub1+sub2;
		System.out.println("Regno is: "+regno+", Student name is: "+stdname);
		System.out.println("Group is: "+group+", Total is: "+total+", Books due is: "+bkDue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		StudentExam exam=new StudentExam(123,"abcdefds","ECE",50,76,4);
		student.display();
		student=exam;
		student.display();
		exam.output();
	}

}
