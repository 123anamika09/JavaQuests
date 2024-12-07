 import java.util.Scanner;
 public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of array:" + " ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();        
          }
        for(int i =0;i<n;i++){
        System.out.print(arr[i] + " ");
        }
        sc.close();
}

}