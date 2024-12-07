public class q13 {
    public static void main(String[] args) {
        int size = 5; // Adjust the size of the triangle as needed
        int count = 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" "); // Print spaces for the left side of the triangle
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(count++); // Print counting numbers for the triangle
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
