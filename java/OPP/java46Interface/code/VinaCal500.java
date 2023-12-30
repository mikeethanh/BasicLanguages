////các lớp hiện thực hoá interface calculator sẽ thực hiện ghi đè các phương thức abstract
// của interface
public class VinaCal500 implements calculator{
    
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    @Override
    public double div(double a, double b) {
        return a / b;
    }
}
