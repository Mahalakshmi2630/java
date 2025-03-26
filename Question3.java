package testpapper1;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		for (char c : s1.toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.print("*");
			} else {
				System.out.print(c);
			}
		}
		s2 = s2.replaceAll("[^AEIOUaeiou]", "@");
		System.out.print(s2);
		for (char c : s3.toCharArray()) {
			char lc = Character.toLowerCase(c);
			if (lc >= 'a' && lc <= 'z') {
				System.out.print(Character.toUpperCase(c));
			} else {
				System.out.print(c);
			}
		}

	}

}
