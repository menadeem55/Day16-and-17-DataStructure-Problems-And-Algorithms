package com.AssignmentDay16and17;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchWord {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//sorting words in string type of array
		String[] words = {"Nadeem", "Aman", "Kunal", "Ramesh", "Akash", "Atul", "Ankit", "Ashish"};
		
		//sorting the array
		Arrays.sort(words);
		
		//printing using inbuilt toString in String class
		System.out.println(Arrays.toString(words));
		System.out.println("Enter a Word to serarch: ");
		String searchWord = sc.next();
		
	}

}
