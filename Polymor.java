package mahi9890;
class friends{

	void display() {
		System.out.println("we are friends");
	}
}
class Mahi extends friends{
	void display() {
		System.out.println("Mahi is friend");
	}
	
}
class mouni extends friends{
	void display() {
		System.out.println("Mouni is friend");
	}
}
public class Polymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
friends frnd=new friends();
friends frnd1=new Mahi();
friends frnd2=new mouni();

frnd.display();
frnd1.display();
frnd2.display();


}
}