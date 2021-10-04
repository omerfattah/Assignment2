package assignment2;

/*
 * Question-8
Problem Statement – Goutam and  Tanul plays  by  telling numbers.
  Goutam says a number to Tanul.  Tanul should first reverse the number and check if it is same as the original. 
 If yes,  Tanul should say “Palindrome”.  If not, he should say “Not a Palindrome”. 
  If the number is negative, print “Invalid Input”.  Help Tanul by writing a program.
Sample Input 1 :
21212
Sample Output 1 :
Palindrome
Sample Input 2 :
6186
Sample Output 2 :
Not a Palindrome

 * */
import java.util.Scanner;

public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0, r;
		int temp = n;

		if (n > -1) {
			while (n > 0) {
				r = n % 10;
				sum = (sum * 10) + r;
				n = n / 10;
			}
			if (temp == sum)
				System.out.println("Palindrome");
			else
				System.out.println("Not a Palindrome");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
