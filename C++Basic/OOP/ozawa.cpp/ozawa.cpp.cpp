#include<iostream>
using namespace std;
/*
4 đặc điểm của hướng đối tượng 
Tính đóng gói(escapsulation:cac thuoc tinh duoc dong lai , ben ngoai khong nhin vao duoc.
Tính trừu tượng(abstraction):
Tính kế thừa(inheritance):class base :dac diem chung , hanh vi chung cua nhieu class 
Tính đa hình(polymorphism):
*/

//class base
class phuNu {
	//access modifier:
public:
	//phuong thuc:method
	void trangdiem() {

	}
	string choinhaccu(string nhaccu) {
		return "aaaaaaaaa";
	}
	//constructor:
	//const: chong thay doi du lieu goc, reference;
	phuNu() {};
	phuNu(const string& ht, int t, bool z = true) : hoten(ht), tuoi(t), con_zin(z) {};
	//destructor:khi muon huy object;
	~phuNu() {};

	//abstraction : thay doi thuoc tinh
	void va_zin() {
		if (tuoi < 25) {
			con_zin = true;
		}
	}

	void showhang() {
		cout << hoten << " " << (con_zin ? "conzin" : "matzin") << endl;
	}
private:
	//property :
	string hoten;
	bool con_zin;
	int tuoi;
};
  
//inheritance: 
//public phu nu co gi gai ngoan co do (excenpt construtor , destructor)
class gaingoan : public phuNu {
public:
	gaingoan(const string& ht, int t, bool z = true) : phuNu(ht, t, z) {};

	void noitro() {

	}

	//tinh da hinh : dinh nghia lai ham da duoc dinh nghia
	string choinhaccu(string nhaccu) {
		return "aaaaaaaaa";
	}
};

class gai_hu : public phuNu {

};
class danOng {

};
int main() {
	//class object;
	phuNu thao;
	phuNu* Mario = new phuNu("mario",22,false);
	//object truy cap vao cac phuong thuc :
	Mario->choinhaccu("ken");
	Mario->va_zin();
	Mario->showhang();
	//destructor :
	delete Mario;
	danOng* vu = new danOng;
}