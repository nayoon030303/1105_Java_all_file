package PPT3;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------자바실행-----");
		System.out.println("이름          과제          보너스           합계");
		String n1,n2,n3;
		int  s1,s2,s3;
		int b1,b2,b3;
		int sum1,sum2,sum3;
		 
		n1 = "선미";
		n2 = "성우";
		n3 = "가연";
		s1 = 82; b1 = 7;
		s2 = 71; b2 = 4;
		s3 = 92; b3 = 8;
		
		sum1 = s1+b1;
		sum2 = s2+b2;
		sum3 = s3+b3;
		
		System.out.println(n1+"\t"+s1+"\t"+b1+"\t"+sum1);
		System.out.println(n2+"\t"+s2+"\t"+b2+"\t"+sum2);
		System.out.println(n3+"\t"+s3+"\t"+b3+"\t"+sum3);
	}
}
