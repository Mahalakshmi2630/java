package testpapper1;
import java.util.*;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num[]= {2,43,66,92,3,5,13,123,432,44,78};
             int x=sc.nextInt();
             for(int i=0;i<=num.length-1;i++) {
            	 if(num[i]>x) {
            		 System.out.println(num[i]);
            	 }
             }
	}

}
