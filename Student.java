 class Student1{
     int stuid;
	 String Sname;
	 float m1,m2,m3;
	
 public Student1(int id,String name,float m1,float m2,float m3){
	stuid=id;
	Sname=name;
	m1=m1;
	m2=m2;
	m3=m3;
}
 public Student1()
 {
	 stuid=21;
	 Sname="MERLIN";
	 m1=78;
	 m2=88;
	 m3=81;
 }
    public void display()
	{
      System.out.println(" \n The Student Name=" + Sname);
      System.out.println(" \n The Student id=" +stuid);
      System.out.println(" \n Marks are =" +m1 +m2 +m3);
	}
 }
 public class Student{
  public static void main(String[] args){
    Student1 ob = new Student1();
    ob.display();
	Student1 ob1 = new Student1(20,"Aby",78,90,89);
  ob1.display();
  }
 }
	