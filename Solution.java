package co.anbu;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		int cube = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Digit Number : ");
		int number = sc.nextInt();
		String n = String.valueOf(number);
		String[] num = n.split("(?<=.)"); 
		if(num.length < 3 || num.length > 3) {
			System.out.println("INVALID INPUT");
		}
		else {
			for(int i=0 ; i < num.length ; i++) {
				int f = Integer.parseInt(num[i]);
				cube += f * f * f;
			}
			if(cube == number) {
				System.out.println("ARMSTRONG");
			}
			else {
				System.out.println("NOT ARMSTRONG");
			}
		}
	}
}
