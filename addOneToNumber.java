/*Problem Description



Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

        NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example:
        for this problem, following are some good questions to ask :

Q : Can the input have 0's before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0's before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


        Problem Constraints
1 <= |A| <= 106
        0 <= Ai <= 9


Input Format
First argument is an array of digits.



        Output Format
Return the array of digits after adding one.



Example Input
Input 1:

        [1, 2, 3]


Example Output
Output 1:

        [1, 2, 4]


Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.*/

import java.util.Scanner;
import java.util.ArrayList;

public class addOneToNumber {
    public static ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n=A.size();
        //TRAVERSE ARRAY FROM THE END
        for(int i=n-1;i>=0;i--) {
            //if current digit<9, increment by 1 and return list
            if(A.get(i)<9) {
                A.set(i,A.get(i)+1);
                //remove leading zeroes if they exist
                while(A.size()>1 && A.get(0)==0) {
                    A.remove(0);
                }
                return A;
            }
            //if the current digit is 9, set it to 0
            A.set(i,0);
        }
        //if all the digits were 9, we need to add a new digit 1 at the beginning
        A.add(0,1);
        //remove leading zeroes, if exist
        while(A.size()>1 && A.get(0)==0) {
            A.remove(0);
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter no. of elements:");
        int n=s.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        System.out.println("enter the number:");
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        ArrayList<Integer> result=solve(A);
        System.out.println("after adding one:"+A);
        for(int num:result) {
            System.out.print(num+" ");
        }
    }
}
