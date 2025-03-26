package Banking;
import java.util.*;
public class Construc {

	int id;
	String name;
	String branch;
	
	Construc(int id ,String name){
		this.id=id;
		this.name=name;
	}
	Construc(int id,String name,String branch){
		this(id,name);
		this.branch=branch;
	}
	void show() {
		System.out.println( id+ " "+ name+" "+branch);
	}
	void display() {
		System.out.println("it is of the display method");
		System.out.println("student details"+" "+id+ " "+ name+" "+branch );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String na=sc.next();
		String nam=sc.next();
		Construc c1=new Construc(n,na,nam);
		c1.show();
		c1.display();
		int n1=sc.nextInt();
		String na1=sc.next();
		String nam1=sc.next();
		Construc c2=new Construc(n1,na1,nam1);
		c2.show();
		c2.display();
		
		
	}
}
