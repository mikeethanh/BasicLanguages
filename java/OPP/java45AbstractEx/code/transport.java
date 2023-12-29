//lớp này là abstract class cuz transport là chung chung , ko cụ thể phương tiện gì 
// sẽ có 1 trường thuộc tính là manufacturer bởi vì phương tiện thì phả có hãng 

public abstract class transport {
    //để protected để các lớp sau còn có thể sử dụng 
    //cụ thể sử dụng trong hàm tạo;
    protected String typeOfTransport;
    
    protected manufacturer manufacturer;

    //constructor
    public transport(String typeOfTransport, manufacturer manufacturer) {
        this.typeOfTransport = typeOfTransport;
        this.manufacturer = manufacturer;
    }

    //getter,setter
    public String getTypeOfTransport() {
        return typeOfTransport;
    }
    
    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    //method 
    //có thể lấy ra được tên hãng sản xuất đã được khởi tạo của loại phượng tiện 
    //đã được khởi tạo thôn qua các method()
    public String getNameOfManufacturer(){
        return this.manufacturer.getNameManufacturer();
    }

    public void start() {
        System.out.println(this.typeOfTransport + " is starting");
    }

    public void speedUp() {
        System.out.println(this.typeOfTransport + " is speeding up");
    }

    public void stop() {
        System.out.println(this.typeOfTransport + " is stopping");
    }

    //abstract method 
    public abstract void speed() ;
}
