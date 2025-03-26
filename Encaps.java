package Banking;
import java.util.*;
public class Encaps {

	int id;
	String name;
	
	public void setid(int id) {
		this.id=id;
		
	}
	public int getid() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encaps es=new Encaps();
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String nm=sc.next();
es.setid(101);
es.setName("mahi");
System.out.println(es.getid()+" "+ es.getName());

	}

}
