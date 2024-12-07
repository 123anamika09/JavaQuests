import java.util.Scanner;
public class q12 {
    public static void main(String[] args){
    Scanner ss = new Scanner(System.in);
    System.out.print("Enter n:");
    int n = ss.nextInt();
    for(int i =1;i<=n;i++){
        for(int j = n;j>=i;j--){
            System.out.print(" ");
        } 
            for(int j =1;j<=2*i-1;j++){
                
                System.out.print(j);
            }
        System.out.println();
    }
}
}
