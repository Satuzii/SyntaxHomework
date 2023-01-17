package class8;

public class homework6 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
