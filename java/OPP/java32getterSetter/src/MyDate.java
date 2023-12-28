
public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (year >= 1) {
			this.year = year;
		}else {
			this.year = 1;
		}
	}
	public int getDay() {
		return this.day;
	}
	public void setDay(int d) {
		if(d>=1 && d<=31)
			this.day = d;
	}
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int m) {
		if(m>=1 && m<=12)
			this.month = m;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		if(y>=1)
			this.year = y;
	}
	
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/"+this.year;
	}

    public static void main(String[] args) {
		MyDate md = new MyDate(31, 1, 2021);
		System.out.println("Day = "+ md.getDay());
		md.setDay(35);
		System.out.println("Day = "+ md.getDay());
		md.setDay(30);
		System.out.println("Day = "+ md.getDay());
		
		System.out.println("Month = "+ md.getMonth());
		md.setMonth(13);
		System.out.println("Month = "+ md.getMonth());
		md.setMonth(5);
		System.out.println("Month = "+ md.getMonth());

		System.out.println(md);
	}
}