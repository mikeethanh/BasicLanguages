#include<iostream>
#include<algorithm>
#include<cmath>
#include<string>
using namespace std;

//class

//operator overloading
//<< >>
//cout : ostream
//cin : istream

class sinhvien {
	///thuoc tinh va phuong thuc 
private:
	string id, ten, ns;
	double gpa;
	static int dem;
public:
	//ham tao;
	sinhvien();
	friend istream& operator >> (istream &in, sinhvien& a);
	friend ostream& operator << (ostream& out, sinhvien a);
};

istream& operator >> (istream& in, sinhvien& a) {
	cout << "nhap id";
}

int main() {
	sinhvien x;
}