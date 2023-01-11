/*Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
Input format :
String in a single line
Output format :
Word wise reversed string in a single line
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always */

public class Solution {
	public static String reverseWordWise(String input) {
	
			// Write your code here
			if (input.length() == 0) {
				return "";
			}
			int n = input.length();
			int currentWordStart;
			int currentWordEnd = n;
			String reversedString = "";
			int i;
			for (i = n - 1; i >= 0; i--) {
				if (input.charAt(i) == ' ') {
					currentWordStart = i + 1;
					reversedString += input.substring(currentWordStart, currentWordEnd) + " ";
					currentWordEnd = i;
				}
			}
			// System.out.println(currentWordEnd);
			// thi swe are doing for the first word.
			currentWordStart = i + 1;
			reversedString += input.substring(currentWordStart, currentWordEnd);
			return reversedString;
		}

		// main driver code to check solution
		public static void main(String[] args) {
			String str = "Welcome to";
			String result = reverseWordWise(str);
			System.out.println(result);
		
	
	}
}
