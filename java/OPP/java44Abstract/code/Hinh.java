//lop truu tuong 
public abstract class Hinh {
    //Đây là khai báo một trường có tên là toaDo, kiểu dữ liệu của trường này là ToaDo
    //khai bao voi muc do truy cap la protected de cac lop con co the truy cap dc : cac ham constructor 
    protected ToaDo toaDo;

    //constructor
    //ham tap se nhap 1 doi tuong toaDo duoc tao tu class ToaDo
    public Hinh(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    public Hinh() {};
    //getter,setter
    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(ToaDo toaDo) {
        this.toaDo = toaDo;
    }

    //lop abstract , chi duoc khoi tao , khong duoc trien khai  
    public abstract double tinhS();
}
