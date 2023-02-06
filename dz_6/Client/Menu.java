package Client;

import java.util.Scanner;

import Console.View;
import Model.CalcModel;
import Presenter.Presenter;

public class Menu {
    Presenter pr;
    View v;
    CalcModel calc;

    public Menu() {
        pr = new Presenter(calc, v);
    }
    
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
}