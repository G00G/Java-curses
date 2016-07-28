package Leson4;

import java.util.Scanner;

/**
 *
 * клас для запуска калькулятора
 */
public class Raner {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        Scanner in = new Scanner(System.in);
        try{
            String exit = "no";
            while (!exit.equals("yes")){
                calc.cleanResult();
                System.out.print("Enter first arg: ");
                int first = in.nextInt();
                System.out.print("Enter second arg: ");
                int second = in.nextInt();
                calc.add(first, second);
                System.out.println("Result: " + calc.getResult());
                System.out.println("Exit? yes/no");

                exit = in.next();


            }
        }finally {
            in.close();
        }

    }
}
