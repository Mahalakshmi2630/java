package testpapper1;

import java.util.Arrays;

public class angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ramu";
		String s2="ular";
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(s1.length()==s2.length()) {
			if(Arrays.equals(c1, c2)) {
				System.out.println("anagram");
			}
			else {
				System.out.println("not an anagram ");
			}
			
		}
		else {
			System.out.println("not an anagram");
		}

	}

}
