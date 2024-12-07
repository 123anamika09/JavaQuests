import java.util.Scanner;
public class q11 {
    public static void main(String[] args){
    Scanner ss = new Scanner(System.in);
    System.out.print("Enter n:");
    int n = ss.nextInt();
    for(int i =1;i<=n;i++){
        for(int j = i;j>=1;j--){
                System.out.print((char)(j+64));  
        }
        System.out.println();
       }
     }
    }
