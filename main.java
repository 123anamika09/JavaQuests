 import java.util.Scanner;
 class main{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        // code herei
        System.out.print("Enter 1st no:");
        int A = sc.nextInt();
        System.out.print("Enter 2nd no:");
        int B = sc.nextInt();
        System.out.println(A+B ); 
        System.out.print("Enter mobile no:");
         long n = sc.nextLong();
         System.out.println(n);
         System.out.print("Enter the name of the person :");
         String name = sc.next();
         System.out.println(name);
        char ch = sc.next().charAt(0);
        if(ch == 'f') System.out.println("female");
         else if( ch == 'm') System.out.println("male");

         else System.out.println("neither male nor female:");
          int d=0;
          for(;d<=10;){ 
            System.out.println("Anamika is a good girl.");
              d++;
             }
    }
}