package testpapper1;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,2,3,4,2,7,8,8,3};
		
		for(int i=0;i<=num.length-1;i++) {
			for(int j=i+1;j<=num.length-1;j++) {
				if(num[i]==num[j]) {
					System.out.println(num[i]+" "+"duplicate");
				}
			}
		}
		
	}

}
