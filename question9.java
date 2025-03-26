package testpapper1;
import java.util.*;
public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your weight");
		System.out.println("enter your height");
		int w=sc.nextInt();
		double h=sc.nextDouble();
		if(w>=55 && h>=5.5) {
			System.out.println("you are eligible for physical test");
		}
		else {
			System.out.println("not eligible");
		}

	}

}
