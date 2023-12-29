
public class test {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        double min = mm.findMin(3.0 , 4.2);
        System.out.println(min);
        double arr[] = {3,2,4,52,3};
        System.out.println(mm.findSum(arr));
    }
}
