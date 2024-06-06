import java.util.*;
public class matrixSpiralOrder {
    public static int[] spiralOrder(int[][] A) {
        if(A==null || A.length==0 || A[0].length==0) {
            return new int[0];
        }
        int m=A.length;
        int n=A[0].length;
        int top=0, bottom=m-1, left=0, right=n-1;
        int k=0;
        int result[]=new int[m*n];
        while(left<=right && top<=bottom) {
            //traversing top
            for(int i=left;i<=right;i++) {
                result[k++]=A[top][i];
            }
            top++;

            //traversing right-most column
            for(int i=top;i<=bottom;i++) {
                result[k++]=A[i][right];
            }
            right--;

            //traversing bottom row
            if(top<=bottom) {
                for(int i=right;i>=left;i--) {
                    result[k++]=A[bottom][i];
                }
                bottom--;
            }
            //traversing left column
            if(left<=right) {
                for(int i=bottom;i>=top;i--) {
                    result[k++]=A[i][left];
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int row=s.nextInt();
        System.out.println("enter number of columns:");
        int col=s.nextInt();
        int A[][]=new int[row][col];

        System.out.println("enter elements:");
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                A[i][j] = s.nextInt();
            }
        }
        System.out.println("spiral ordered matrix is:");
        int[] result=spiralOrder(A);
        for(int i=0;i<result.length;i++) {
            int element=result[i];
            System.out.print(element+" ");
        }
    }
}
