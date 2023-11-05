#include<iostream>
#include<algorithm>
#include<cmath>
#include<string>
using namespace std;

//class
// thuoc tinh : atribute
// phuong thuc : method , behavior
//object : doi tuong 
//constructor:ham khoi tao
// destructor : ham huy
// this pointed
// setter getter
//encapsulation : dong goi
// access modifier : 
//private 
//public 
//protected 
//SV001 =>SV002=>SV003 static

class sinhvien {
	///thuoc tinh va phuong thuc 
     private: 
		 string id, ten, ns;
		 double gpa;
		 static int dem;
     public:
		 //ham tao;
		 sinhvien();
		 sinhvien(string, string, string, double);

		 void xinchao();
		 void dihoc();
		 void nhap();
		 void in();
		 //ham huy : 
		 //~sinhvien();
		 //
		 double getGpa();

		 void tangdem();
		 int getdem() {
			 return dem;
		 }
};

int sinhvien::dem = 0;

//implement :
void sinhvien::tangdem() {
	++dem;
}

void sinhvien::xinchao() {
	cout << "HEllo" << endl;
}

void sinhvien::dihoc() {
	cout << "di hoc" << endl;
}

//ham constructor: khoi tao 
sinhvien::sinhvien() {
	cout << "ham khoi tao duoc goi" << endl;

}

//ham constructor : khoi tao
sinhvien::sinhvien(string id, string ten, string ns, double gpa) {
	cout << "doi tuong duoc tao" << endl;
	this->id = id; 
	this->ns = ns; 
	this->ten = ten;
	this->gpa = gpa;
}
//hamm huy : 
sinhvien::~sinhvien() {
	cout << "doi tuong duoc hiu tai dai" << endl; 
} 

void sinhvien::nhap() {
	++dem;//dem = 1;
	//cout << "nhap id "; 
	//cin >> id;
	this->id = "sv" + string(3-to_string(dem).length(), '0') + to_string(dem);
	cin.ignore();
	cout << "nhap ten"; 
	cin >> ten; 
	cout << "nhap ns";
	cin >> ns;
	cout << "nhap diem";
	cin >> gpa;
	cin.ignore();
}

void sinhvien::in() {
	cout << id << ten << ns << gpa;
}

double sinhvien::getGpa() {
	return this->gpa;
}
bool cmp(sinhvien a, sinhvien b) {
	return a.getGpa() > b.getGpa();
}

int main() {
	sinhvien x;
	sinhvien("123", "nguyen van A", "12/3", 9.8);
	x.dihoc();
	x.xinchao();

	//khai bao 1 mang 
	int n; 
	cin >> n;
	sinhvien a[100];
	for (int i = 0; i < n; i++) {
		a[i].nhap();
	} 

	for (int i = 0; i < n; i++) {
		a[i].in();
	}
	sort(a, a + n, cmp);
	for (int i = 0; i < n; i++) {
		a[i].in();
	}

	sinhvien y;
	y.tangdem();
	y.tangdem();
	sinhvien z;
	cout << z.getdem(); 

	sinhvien x;
	x.nhap();
}