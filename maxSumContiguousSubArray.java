/*Problem Description



Find the contiguous subarray within an array, A of length N which has the largest sum.


        Problem Constraints
1 <= N <= 106
        -1000 <= A[i] <= 1000


Input Format
The first and the only argument contains an integer array, A.


Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.


Example Input
Input 1:
A = [1, 2, 3, 4, -10]
Input 2:
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]


Example Output
Output 1:
        10
Output 2:
        6


Example Explanation
Explanation 1:
The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:
The subarray [4,-1,2,1] has the maximum possible sum of 6.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class maxSumContiguousSubArray {
    public static int maxSum(List<Integer> A) {
        if(A==null || A.isEmpty()) {
            return 0;
        }
        int maxEndingHere=A.get(0);
        int maxSoFar=A.get(0);

        for(int i=1;i<A.size();i++) {
            maxEndingHere=Math.max(A.get(0), A.get(0)+maxEndingHere);
            maxSoFar=Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("total elements:");
        int n=s.nextInt();
        List<Integer> A=new ArrayList<>();
        System.out.println("enter the elements of list:");
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        int maxSoFar=maxSum(A);
        System.out.println("max sum:"+maxSoFar);
    }
}
