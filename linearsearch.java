
import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
      System.out.print("enter the elemnt of an array:");
      int n = sc.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter the elemnt of an array:");
      for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
      }

      System.out.print("Enter target element:");
      int target = sc.nextInt();
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
          if( arr[i] == target){
        }
            System.out.print("found");
      }
      sc.close();

    }
    
}
