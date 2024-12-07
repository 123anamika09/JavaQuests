import java.util.Scanner;
public class q10 {
    public   static void main(){
    Scanner ss = new Scanner(System.in);
    System.out.print("Enter n:");
    int n = ss.nextInt();
    for(int i =1;i<=n;i++){
        for(int j = i;j>=1;j--){
                System.out.print(j);  
        }
        System.out.println();
       }
     }
    //  in c we use command line arguments having advantage that we can pass arguments to the main fnc from command prompt 
    // in c  its optional to pss an argument to main fnc from command prompt bt in java array of objects are compulsory even we are passing arguments from command prompt or not...
    // 
    }