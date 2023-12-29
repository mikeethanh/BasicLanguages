public class auto extends transport{
    private String typeOfMaterial;

    //constructor
    public auto(String typeOfTransport, manufacturer manufacturer, String typeOfMaterial) {
        super(typeOfTransport, manufacturer);
        this.typeOfMaterial = typeOfMaterial;
    }

    //getter,setter
    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    //
    @Override
    public void speed() {
        System.out.println(this.typeOfTransport + " is speeding up with 100km/h");
    }
}
