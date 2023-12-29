public class plane extends transport{
    private String typeOfMaterials;
    
    //constructor
    //Trong trường hợp này, khi bạn gọi super(typeOfTransport, manufacturer); từ constructor của lớp con plane, bạn đang gọi 
    //constructor của lớp cha và truyền giá trị cho các thuộc tính typeOfTransport và manufacturer. Mặc dù chúng là private trong lớp cha, 
    //nhưng constructor của lớp cha vẫn có quyền truy cập và thiết lập giá trị cho chúng.
    public plane(String typeOfTransport, manufacturer manufacturer, String typeOfMaterials) {
        super(typeOfTransport, manufacturer);
        this.typeOfMaterials = typeOfMaterials;
    }
    //getter,setter
    public String getTypeOfMaterials() {
        return typeOfMaterials;
    }
    
    public void setTypeOfMaterials(String typeOfMaterials) {
        this.typeOfMaterials = typeOfMaterials;
    }
    //method 
    public void takeOff() {
        System.out.println(this.typeOfTransport + " is taking off");
    }

    public void land() {
        System.out.println(this.typeOfTransport + " is landing");
    }

    //
    @Override
    public void speed() {
        System.out.println(this.typeOfTransport + " is speeding up with 200km/h");
    }
}
