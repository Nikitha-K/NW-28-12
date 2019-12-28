
public class StudentExam extends Student{
	private int sub1;
	private int sub2;
	
	//Constructors are generated
	public StudentExam(int regno, String stdname, String group, int sub1, int sub2) {
		super(regno, stdname, group);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	/*public StudentExam(){
		sub1=70;
		sub2=90;
		} */
	
	public void output(){
		int total=sub1+sub2;
		System.out.println(regno+stdname+group+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentExam exam=new StudentExam(123,"abcdefds","ECE",50,76);
		exam.display();
		exam.output();
	}

}
