public class HinhTron extends Hinh{
    //1 attribute
    private double r ; 

    //constructor
    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }
    
    public HinhTron() {};
    //getter,setter
    public double getR() {
        return r;
    }
    
    public void setR(double r) {
        this.r = r;
    }

    //
    @Override
	public double tinhS() {
		return Math.PI*this.r*this.r;
	}
}
