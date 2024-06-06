/*Given an integer array A of size N.

        You have to pick exactly B elements from either left or right end of the array A to get the maximum sum.

        Find and return this maximum possible sum.

        NOTE: Suppose B = 4 and array A contains 10 elements then

        You can pick the first four elements or can pick the last four elements or can pick 1 from the front and 3 from the back etc. you need to return the maximum possible sum of elements you can pick.


        Problem Constraints
        1 <= N <= 105

        1 <= B <= N

        -103 <= A[i] <= 103



        Input Format
        First argument is an integer array A.

        Second argument is an integer B.



        Output Format
        Return an integer denoting the maximum possible sum of elements you picked.



        Example Input
        Input 1:

        A = [5, -2, 3 , 1, 2]
        B = 3
        Input 2:

        A = [1, 2]
        B = 1


        Example Output
        Output 1:

        8
        Output 2:

        2


        Example Explanation
        Explanation 1:

        Pick element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
        Explanation 2:

        Pick element 2 from end as this is the maximum we can get*/
import java.util.*;
public class pickFromBothSides {
    public static int solve(ArrayList<Integer> A,int B) {
        int n=A.size();

        //calculate sum of first B elements
        int currentSum=0;
        for(int i=0;i<B;i++) {
            currentSum+=A.get(i);
        }
        int maxSum=currentSum;

        //sliding window technique
        //removing the leftmost element of the window and adding the rightmost element of the array
        for(int i=0;i<B;i++) {
            currentSum=currentSum-A.get(B-1-i)+A.get(n-1-i);
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter B:");
        int B=s.nextInt();
        System.out.println("enter size of array:");
        int n=s.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        System.out.println("Enter the elements of array;");
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        int maxSum=solve(A,B);
        System.out.println("Max sum:"+maxSum);
    }

}
