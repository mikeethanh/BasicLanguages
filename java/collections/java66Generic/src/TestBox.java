public class TestBox {
    public static void main(String[] args) {
        // chuyen vao giau ngoac phai la 1 class : class Interger
        Box box = new Box<Interger>(15);
        System.out.println("Gia tri:" + box.getValue());

        
    }
}
