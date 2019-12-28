
public class StudentExam extends LibraryDetails{
	protected int sub1;
	protected int sub2;
	
	//Constructors are generated
	public StudentExam(int regno, String stdname, String group, int sub1, int sub2,int bkDue) {
		super(regno, stdname, group, bkDue);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	/*public StudentExam(){
		sub1=70;
		sub2=90;
		} */
	
	public void output(){
		int total=sub1+sub2;
		System.out.println("Regno is: "+regno+", Student name is: "+stdname);
		System.out.println("Group is: "+group+", Total is: "+total+", Books due is: "+bkDue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExam exam=new StudentExam(123,"abcdefds","ECE",50,76,4);
		exam.display();
		exam.output();
	}

}
