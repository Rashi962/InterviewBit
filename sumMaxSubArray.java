import java.util.*;
public class sumMaxSubArray {
    public static ArrayList<Integer> subArray(ArrayList<Integer> A) {
        long maxSum=-1, currentSum=0;
        ArrayList<Integer> maxSubArray=new ArrayList<>();
        ArrayList<Integer> currentSubArray=new ArrayList<>();

        for(int num:A) {
            if(num>=0) {
                currentSum+=num;
                currentSubArray.add(num);
            } else {
                if(currentSum>maxSum || ( currentSum==maxSum && currentSubArray.size()>maxSubArray.size())) {
                    maxSum=currentSum;
                    maxSubArray=new ArrayList<>(currentSubArray);
                }
                currentSum=0;
                currentSubArray.clear();
            }
        }
        if(currentSum>maxSum || (currentSum==maxSum && currentSubArray.size()>maxSubArray.size())) {
            maxSubArray=new ArrayList<>(currentSubArray);
        }
        return maxSubArray;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("No. of elements in the array:");
        int n=s.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        System.out.println("enter the elements of the array:");
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        ArrayList<Integer> result=subArray(A);
        System.out.println("max sub-array:");
        for(int num:result) {
            System.out.print(num+" ");
        }
    }
}
