package Presenter;

import Console.View;
import Model.CalcModel;

public class PresenterOfT<T extends CalcModel> {
    View view;
    CalcModel model;

    public PresenterOfT(T m, View v) {
        this.model = m;
        this.view = v;
    }

    public void buttonClick() {
        double x = view.getValue("Enter X: ");
        double y = view.getValue("Enter Y: ");
        model.setX(x);
        model.setY(y);
        double res = model.result();
        view.show(res, "Result:");
    }
}
