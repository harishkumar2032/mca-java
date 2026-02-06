package string;

class Student{
    private String name;
    private int id;
    
    //default constructor
    Student()
    {
        System.out.println("Constructor");
    }
    //parameterized constructor
    Student(String n,int i)
    {
        this.name=n;
        this.id=i;
//        System.out.println(n+"  "+i);
    }
    
    void getdata() {
    	
    	System.out.print(name);
    	System.out.print(id);
    	
    }
    
}



public class stringmethod1
{
	public static void main(String[] args) {
	    
	        Student s1 = new Student("Dharaneesh", 1);
	        Student s2 = new Student("Dharshan", 2);
	        Student s3 = new Student("harish", 3);
	        
	        s3.getdata();
	}
}
