import java.util.Scanner;

public class Exercitiu4 {

    public static void main(String[] args) {
        double numar1, numar2;
        char operator = 'a';


        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti primul numar :");
        numar1 = scanner.nextDouble();

        System.out.println("Introduceti al doilea numar :");
        numar2 = scanner.nextDouble();

        System.out.println("Introduceti tipul de operatie :");
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+' : {
                double rez = numar1 + numar2;
                System.out.println(rez);
                break;
            }

            case '-' : {
                double rez = numar1 - numar2;
                System.out.println(rez);
                break;

            }

            case '*' : {
                double rez = numar1 * numar2;
                System.out.println(rez);
                break;
            }

            case '/' : {
                double rez = numar1 / numar2;
                System.out.println(rez);
                break;
            }

        }

    }

}