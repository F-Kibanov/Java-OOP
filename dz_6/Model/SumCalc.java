package Model;

public class SumCalc extends CalcModel {

    @Override
    public double result() {
        return x + y;
    }

    public double res(double x, double y) {
        return x + y;
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
}
