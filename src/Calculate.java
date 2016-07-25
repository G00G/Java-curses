/**
 * Created by administrator on 25/07/16.
 */
public class Calculate{

    public static void main(String[] args){
        System.out.println("Calculate run");
        int first = Integer.valueOf(args[0]); // Integer.valueof(args[0]) первый элимент масива аргументов.
        int second = Integer.valueOf(args[1]); // Второй элимент
        int summ = first + second;
        System.out.println(first + " " + "+" + " " +  second + " " + "= " + summ );
    }
}


