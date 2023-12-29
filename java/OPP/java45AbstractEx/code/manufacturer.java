public class manufacturer {
    //khong có lớp nào kế thừa tu lớp này nên để private 
    private String nameManufacturer;
    private String nameNation;

    //contructor
    public manufacturer(String nameManufacturer, String nameNation) {
        this.nameManufacturer = nameManufacturer;
        this.nameNation = nameNation;
    }
    public manufacturer() {};

    //getter,setter
    public String getNameManufacturer() {
        return nameManufacturer;
    }
    
    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public String getNameNation() {
        return nameNation;
    }
    
    public void setNameNation(String nameNation) {
        this.nameNation = nameNation;
    }
}
