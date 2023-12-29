public class bicycle extends transport{
    //contructor 
    public bicycle(String typeOfTransport, manufacturer manufacturer) {
        super(typeOfTransport, manufacturer);
    }
    //
    @Override
    public void speed() {
        System.out.println(this.typeOfTransport + " is speeding up with 20km/h");
    }
}
