//tạo ra 1 interface để các lớp con có thể thực hiện đa kế thừa 
//trong interface các tất cả các phương thức đều là các phương thức trừu tượng
public interface calculator {
    public double add(double a, double b);

    public double sub(double a, double b);

    public double mul(double a, double b);

    public double div(double a, double b);
}
