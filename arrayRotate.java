import java.sql.SQLOutput;
import java.util.*;
public class arrayRotate
{
    public static ArrayList<Integer> rotArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> rot=new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            rot.add(A.get((i+B)%A.size()));
        }
        return rot;
    }
    public static void main(String[] args) {
        /*ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6));
        int B = 1; // Number of positions to rotate
        ArrayList<Integer> rotatedArray = rotArray(A, B);
        System.out.println("Rotated Array: " + rotatedArray);*/
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=s.nextInt();
        ArrayList<Integer> A=new ArrayList<>();
        System.out.println("Enter elements of array:");
        for(int i=0;i<n;i++) {
            A.add(s.nextInt());
        }
        System.out.println("Positions to rotate:");
        int B=s.nextInt();

        ArrayList<Integer> rotatedArray=rotArray(A, B);
        System.out.println("Rotated array:"+rotatedArray);
    }
}
