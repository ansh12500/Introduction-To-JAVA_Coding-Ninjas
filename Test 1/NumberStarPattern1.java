/*Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321 */


 import java.util.Scanner;

public class runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, i, j;
		n = s.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = n; j > 0; j--) {
				if (j == i)
					System.out.print("*");
				else
					System.out.print(j);
			}
			System.out.println();
		}
	

	}
}