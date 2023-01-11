/*Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false */




import java.util.Scanner;
public class Main {

	public static boolean checkPalindrome(String str){
	
        boolean isPalindrome = true;
		for(int i = 0,j = str.length() - 1;i < (str.length()/2);i++,j--){
		if(str.charAt(i) != str.charAt(j)){
		isPalindrome = false;
		break;
		}
		}
		return isPalindrome;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean isPalindrome = checkPalindrome(str);
		System.out.print(isPalindrome);
    }
}