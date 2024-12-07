import java.util.Scanner;
public class q14 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter n: ");
    int n = sc.nextInt();
for(int i =1;i<=n;i++){
    for(int j = n;j>=i;j--){
           System.out.print(" ");
    }
    for(int j=1;i<2*i-1;j++){
        System.out.print((char)j);
    }
System.out.println();
}    
sc.close();
  }
}
