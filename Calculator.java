import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.print("First number: ");
        number1 = input.nextDouble();

        System.out.print("Choose an operator: sum(+), difference(-), product(*), quotient(/): ");
        operator = input.next().charAt(0);

        System.out.print("Second number: ");
        number2 = input.nextDouble();

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                if (number2 == 0) {
                    System.out.println("Invalid input!");
                    break;
                }
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}
