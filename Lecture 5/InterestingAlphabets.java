/*Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
Input format :
N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 26
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG*/

import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1;
int num=n;
while(i<=n){
    int j=1;
    int Start ='A'+num-1;
    while (j<=i){
        System.out.print((char)(Start));
        j++;
        Start++;
        
    }
    System.out.println();
    num--;
    i++;
    
}
	}
}
