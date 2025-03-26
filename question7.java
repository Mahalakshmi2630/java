package testpapper1;
import java.util.*;
public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("eneter second number");
		int num2=sc.nextInt();
		System.out.println("enter any operator");
		char operator=sc.next().charAt(0);
		double result;
		switch(operator) {
		case '+' :
			result=num1+num2;
		System.out.println("result :"+ result);
		break;
		case '-' :
			result=num1-num2;
		System.out.println("result :"+ result);
		break;
		case '*' :
			result=num1*num2;
		System.out.println("result :"+ result);
		break;
		case '/' :
			result=num1/num2;
		System.out.println("result :"+ result);
		break;
		}

	}

}
