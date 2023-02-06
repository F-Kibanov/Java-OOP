import Console.View;
import Model.Sub;
import Presenter.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter p = new Presenter (new Sub(), new View());
        p.runOperation();
    }
}
