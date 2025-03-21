/*Minimum Lights to Activate
Easy
61.7% Success

663

        51

Bookmark
Asked In:
Max Score: 200
Hint
Solution Approach
Complete Solution
Problem Description



There is a corridor in a Jail which is N units long. Given an array A of size N. The ith index of this array is 0 if the light at ith position is faulty otherwise it is 1.

All the lights are of specific power B which if is placed at position X, it can light the corridor from [ X-B+1, X+B-1].

Initially all lights are off.

Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.



Problem Constraints
1 <= N <= 100000

        1 <= B <= 10000



Input Format
First argument is an integer array A where A[i] is either 0 or 1.

Second argument is an integer B.



Output Format
Return the minimum number of lights to be turned ON to light the whole corridor or -1 if the whole corridor cannot be lighted.


Example Input
Input 1:

A = [ 0, 0, 1, 1, 1, 0, 0, 1].
B = 3
Input 2:

A = [ 0, 0, 0, 1, 0].
B = 3


Example Output
Output 1:

        2
Output 2:

        -1


Example Explanation
Explanation 1:

In the first configuration, Turn on the lights at 2nd and 7th index.
Light at 2nd index covers from [ 1, 5] and light at 7th index covers [6, 8].
Explanation 2:

In the second configuration, there is no light which can light the first corridor.*/
import java.util.Scanner;
import java.util.ArrayList;
public class minimumLightsToActivate {
    public static int solve(ArrayList<Integer> A,int B) {
        int n=A.size();
        int i=0;
        int light=0;
        while(i<n) {
            int nextLight=-1;
            //range to check for the rightmost light
            int start=Math.max(0,i-B+1);
            int end=Math.min(n-1,i+B-1);

            //finding the rightmost light that can cover the current poistion i
            for(int j=end;j>=start;j--) {
                if(A.get(i)==1) {
                    nextLight=j;
                    break;
                }
            }
            if(nextLight==-1) {
                return -1;
            }
            light++;
            i=nextLight+B;

        }
        return light;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=s.nextInt();
        System.out.println("enter array elements:");
        ArrayList<Integer> A=new ArrayList<>();
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        System.out.println("enter B:");
        int B=s.nextInt();
        int light=solve(A,B);
        System.out.println("min number of lights turned on:"+light);

    }
}
