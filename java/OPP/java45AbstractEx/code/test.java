public class test {
    public static void main(String[] args) {
        manufacturer m1 = new manufacturer("Honda","japan");
        manufacturer m2 = new manufacturer("Toyota","japan");
        manufacturer m3 = new manufacturer("ford","america");

        transport car =new auto("car",m1,"petrol");
        transport plane =new plane("plane",m2,"petrol");

        car.speed();
    }
}
