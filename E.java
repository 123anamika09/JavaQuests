public class E {
            public static void main(String[] args) {
            int size = 9; // Adjust the size of the pattern as needed
    
            for (int i = 0; i < size; i++) {
                System.out.print("*");
    
                for (int j = 0; j < size; j++) {
                    if ((i == 0 || i == size - 1) || (i == size / 2 && j <= size / 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
    
                System.out.println();
            }
        }
    }

