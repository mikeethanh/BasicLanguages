#include<iostream>
#include<string>
using namespace std;

class sinhvien {
private : 
	string masv; 
	string ten;
	string lop; 
	float gpa;
public :
	sinhvien() {
		masv = "";
		ten = "";
		lop = "";
		gpa = 0;
	}
	friend istream& operator >> (istream& in, sinhvien& a);
	friend ostream& operator << (ostream& out, sinhvien a);
};

istream& operator >> (istream& in, sinhvien& a) {
	a.masv = "B2DCCN001";
	getline(in, a.ten);
	in >> a.lop >> a.gpa; 
}

ostream& operator << (ostream& out, sinhvien a) {
	out << a.masv << a.ten << a.lop << a.gpa << endl;
}

int main() {

}