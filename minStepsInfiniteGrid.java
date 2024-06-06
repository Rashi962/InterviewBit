/*You are in an infinite 2D grid where you can move in any of the 8 directions

        (x,y) to
    (x-1, y-1),
        (x-1, y)  ,
        (x-1, y+1),
        (x  , y-1),
        (x  , y+1),
        (x+1, y-1),
        (x+1, y)  ,
        (x+1, y+1)
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.



        Problem Constraints
1 <= |A| <= 106
        - 2 * 103 <= Ai, Bi <= 2 * 103
        |A| == |B|


Input Format
Given two integer arrays A and B, where A[i] is x coordinate and B[i] is y coordinate of ith point respectively.



        Output Format
Return an Integer, i.e minimum number of steps.



        Example Input
Input 1:

A = [0, 1, 1]
B = [0, 1, 2]


Example Output
Output 1:

        2


Example Explanation
Explanation 1:

Given three points are: (0, 0), (1, 1) and (1, 2).
It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).*/
import java.lang.reflect.Array;
import java.util.*;
import java.math.*;
public class minStepsInfiniteGrid {
    public static int minSteps(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps=0;

        for(int i=1;i<A.size();i++) {
            //Manhattan Distance
            int dx=Math.abs(A.get(i)-A.get(i-1));
            int dy=Math.abs(B.get(i)-B.get(i-1));
            steps+=Math.max(dx,dy);
        }
        return steps;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        System.out.println("enter the number of points: ");
        int n=s.nextInt();
        System.out.println("Enter the x-coordinates:");
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        System.out.println("enter the y-coordinates:");
        for(int i=0;i<n;i++) {
            B.add(s.nextInt());
        }
        int steps=minSteps(A,B);
        System.out.println("Min steps:"+steps);

    }
}
