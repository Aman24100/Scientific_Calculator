import java.util.Scanner;

public class Scientific_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        int choice;

        System.out.println("Scientific Calculator");
        System.out.println("=====================");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Trigonometric Functions");
        System.out.println("6. Logarithm");
        System.out.println("0. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting the calculator...");
                    System.exit(0);
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    System.out.print("Enter the dividend: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the divisor: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Trigonometric Functions");
                    System.out.println("1. Sine");
                    System.out.println("2. Cosine");
                    System.out.println("3. Tangent");
                    System.out.print("Enter your choice: ");
                    int trigChoice = scanner.nextInt();
                    System.out.print("Enter the angle (in degrees): ");
                    double angle = scanner.nextDouble();
                    double radian = Math.toRadians(angle);
                    switch (trigChoice) {
                        case 1:
                            result = Math.sin(radian);
                            System.out.println("Sine: " + result);
                            break;
                        case 2:
                            result = Math.cos(radian);
                            System.out.println("Cosine: " + result);
                            break;
                        case 3:
                            result = Math.tan(radian);
                            System.out.println("Tangent: " + result);
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 6:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.log10(num1);
                    System.out.println("Logarithm (base 10): " + result);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println();
        }
    }
}
