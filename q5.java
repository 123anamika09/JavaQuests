import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        for(int rows = 1;rows<=5;rows++){
            if(rows%2==0){
                for(int column = 0;column<rows ;column++){
                 System.out.print((char)(column +65));
            }
               
            }else{
                for(int column =1;column<=rows;column++){

                    System.out.print(column);
                }
                    

            }
            System.out.println( );
        }
        sc.close();
    }
}

