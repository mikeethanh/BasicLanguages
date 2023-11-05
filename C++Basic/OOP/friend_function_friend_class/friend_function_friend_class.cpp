#include<iostream>
#include<algorithm>
#include<cmath>
#include<string>
#include<sstream>
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


//friend_function_friend_class
//forward declaration:
class giaovien;
class sinhvien;



class sinhvien {
	///thuoc tinh va phuong thuc 
	//friend class 
	friend class giaovien;
private:
	string id, ten, ns;
	double gpa;
	static int dem;
public:
	//ham tao;
	sinhvien();
	sinhvien(string, string, string, double);

	void nhap();
	void in();

	//
	friend void inthongtin(sinhvien);
	friend void chuanhoa(sinhvien&);
};

int sinhvien::dem = 0;

//implement :
void inthongtin(sinhvien a) {
	cout << a.id << a.gpa;
}
void chuanhoa(sinhvien& a) {
	string res = "";
	stringstream ss(a.ten);
	string token;
	while (ss >> token) {
		res += toupper(token[0]);
		for (int i = 1; i < token.size(); i++) {
			res += tolower(token[i]);
		}
		res += " ";
	}
	res.erase(res.length() - 1);
	a.ten = res;
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
	this->id = "sv" + string(3 - to_string(dem).length(), '0') + to_string(dem);
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


class giaovien {
private:
	string khoa;
public:
	void update(sinhvien&);
};

void giaovien::update(sinhvien& x) {
	x.gpa = 3.0;
}
int main() {
	sinhvien a;
	a.nhap();
	inthongtin(a);
	chuanhoa(a);
}