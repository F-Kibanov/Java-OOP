package Console;

import java.util.Scanner;

public class View {
    static Scanner sc = new Scanner(System.in);

    public static int getChoise() {
        System.out.println("Choice operation:");
        System.out.println("\t1: +");
        System.out.println("\t2: -");
        System.out.println("\t3: *");
        System.out.println("\t4: /");
        return sc.nextInt();
    }

    // Выделил отдельные классы под каждую задачу:

    // public double getValue(String data) { 
    //     System.out.printf(data);
    //     return sc.nextDouble(); }
    
    // public void show(Double value, String data) {
    //     System.out.println();
    //     System.out.printf("%s %s", data, value);
    //     System.out.println();
    // }


    public static class Value {
        public static double getValue(String data) { 
            System.out.printf(data);
            return sc.nextDouble(); 
        }
    }

    public static class Show {
            public static void showAnswer(Double value, String data) {
            System.out.println();
            System.out.printf("%s %s", data, value);
            System.out.println();
        } 
    }
}
