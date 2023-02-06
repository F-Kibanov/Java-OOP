package Presenter;

import Console.View;
import Console.View.Value;
import Model.CalcModel;
import Model.Div;
import Model.Mult;
import Model.Sub;
import Model.SumCalc;

public class Presenter {
    View view;
    CalcModel model;

    public Presenter(CalcModel m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        double x = Value.getValue("Enter X: ");
        double y = Value.getValue("Enter Y: ");
        model.setX(x);
        model.setY(y);
    }

    public void runOperation() {
        int choice = View.getChoise();
        this.buttonClick();
        switch (choice) {
            case (1): System.out.println(new SumCalc().res(model.x, model.y));
            break;
            case (2): System.out.println(new Sub().res(model.x, model.y));
            break;
            case (3): System.out.println(new Mult().res(model.x, model.y));
            break;
            case (4): System.out.println(new Div().res(model.x, model.y));
            break;
            default: break;
        }
    }
}


