package Leson4;

/**
 * Created by administrator on 28/07/16.
 * клас реализует калькулятор
 */
public class Calculate {
    private int result; //результат вычисления

    public void add(int ... params  ) { // Сумируем аргументы
        for (int param : params){
            this.result +=param;
        }
    }

    public int getResult() {
        return this.result;
    }

    public void cleanResult(){
        this.result = 0;
    }
}
