import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        float A , B , C, delta ;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of A (and press enter):");
        A = scanner.nextFloat();
        if (A == 0) {
            System.out.println("The number should not equal 0.");
            return;
        }

        System.out.println("Enter the value of B: (and press enter)");
        B = scanner.nextFloat();

        System.out.println("Enter the value of C :(and press enter)");
        C = scanner.nextFloat();

        delta =     B*B - 4*A*C;
        int numberOfRoots;

        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta  == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }

        switch (numberOfRoots) {
            case 2: {
                float x1 = (-B + (float)Math.sqrt(delta )) / (2*A);

                float x2 = (-B - (float)Math.sqrt(delta )) / (2*A);

                System.out.printf("Two distinct real roots: x1 = %.2f, x2 = %.2f\n", x1, x2);
                break;
            }
            case 1: {
                float x = -B / (2*A);
                System.out.printf("One real root (repeated): x = %.2f\n", x);
                break;
            }
            case 0:
                System.out.println("No real roots.");
                break;
            default:

                System.out.println("An unexpected error occurred.");
        }
    }
}

