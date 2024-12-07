import java.util.Scanner;
public class q4 {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    
    
    for(int rows  = 0 ;rows < 4;rows++){
        for(int j =0; j <= rows;j++){
            System.out.print(((char)(j+65)) );
            
        }
        System.out.println(  ); 
    }
  sc.close();
    }
}
