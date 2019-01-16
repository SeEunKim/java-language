package javatutorials.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CalculatorDemo {
    public static void execute(Calculator cal) {
        System.out.println("실행결과");
        cal.run();
    }

    public static void main(String[] args) {
        Calculator calculator = new CalculatorDecoPlus();
        calculator.setOprands(10, 20);



        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);

        execute(calculator);
        execute(c2);





//        CalculatorDecoPlus calculatorDecoPlus = new CalculatorDecoPlus();
//        calculatorDecoPlus.setOprands(10,20);
//
//        CalculatorDecoMinus calculatorDecoMinus = new CalculatorDecoMinus();
//        calculatorDecoMinus.setOprands(10,20);
//

    }
/*
    public static void execute(CalculatorDecoPlus cal) {
        System.out.println("실행결과");
        cal.run();
    }

    public static void execute(CalculatorDecoMinus cal) {
        System.out.println("실행결과");
        cal.run();
    }
*/
}
