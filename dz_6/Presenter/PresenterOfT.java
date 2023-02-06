package Presenter;

import Console.View;
import Console.View.Value;
import Console.View.Show;
import Model.CalcModel;

public class PresenterOfT<T extends CalcModel> {
    View view;
    CalcModel model;

    public PresenterOfT(T m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        double x = Value.getValue("Enter X: ");
        double y = Value.getValue("Enter Y: ");
        model.setX(x);
        model.setY(y);
        double res = model.result();
        Show.showAnswer(res, "Result:");
    }
}
