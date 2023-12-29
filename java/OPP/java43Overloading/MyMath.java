public class MyMath {
    //findMin
    public int findMin(int a , int b) {
        //ternary operator
        return a < b? a : b;
    }

     public double findMin(double a , double b) {
        //ternary operator
        return a < b? a : b;
    }

    //findSum
    public double findSum(double a , double b) {
        return a+b;
    }

    public double findSum(double a[]) {
        double sum = 0;
        for(double num : a) {
            sum += num;
        }
         return sum;
    }


}
