package testpapper1;
import java.util.*;
public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		if(marks>=80) {
			System.out.println("grade A");
		}
		else if(marks<80 && marks >=60){
			System.out.println("grade B");
		}
		else if(marks==40) {
			System.out.println("garde C");
		}
		else {
			System.out.println("grade D");
		}

	}

}
