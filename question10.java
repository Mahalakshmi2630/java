package testpapper1;
import java.util.*;
public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character");
		char val=sc.next().charAt(0);
		if(val=='a'||val=='e'||val=='i'||val=='o'||val=='u') {
			System.out.println("it is a vowel");
		}
		else {
			System.out.println("it is a consonant");
		}
		

	}

}
