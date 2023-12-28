public class Dog extends Animal {
     
    public Dog() {
        //'dog' se duoc chuyen vao constructor cua animal 
        super("dog");
    }

    //overriding 
    @Override
    public void eat() {
        System.out.println("Dog2 eat");
    }

    public void bark() {
        System.out.println("bark");
    }
}