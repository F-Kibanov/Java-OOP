package Console;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);


    public double getValue(String data) { 
        System.out.printf(data);
        return sc.nextDouble(); }
    
    public void show(Double value, String data) {
        System.out.println();
        System.out.printf("%s %s", data, value);
        System.out.println();
    }

    public int getChoise() {
        System.out.println("Choice operation:");
        System.out.println("\t1: +");
        System.out.println("\t2: -");
        System.out.println("\t3: *");
        System.out.println("\t4: /");
        return sc.nextInt();
    }
}
