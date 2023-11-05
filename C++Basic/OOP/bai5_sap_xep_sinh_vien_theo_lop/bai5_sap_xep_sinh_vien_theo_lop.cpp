#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

class sinhvien {
private : 
	string masinhvien; 
	string hovaten; 
	string lop; 
	string email;
	static int dem;
public: 
	sinhvien();
	void nhap();
	void xuat();
	string getLop();
};


int sinhvien::dem = 0;

sinhvien ::sinhvien() {
	masinhvien = "";
	hovaten = "";
	lop = "";
	email = "";
}

void sinhvien::nhap() {
	cin >> masinhvien;
	cin.ignore();
	getline(cin, hovaten);
	cin >> lop;
	cin >> email;
}

void sinhvien::xuat() {
	dem++;
	cout << dem << " " << masinhvien<<" " << hovaten<<" " << lop << " " << email << endl;
}


string sinhvien::getLop() {
	return this->lop;
}

bool cmp(sinhvien a, sinhvien b) {
	return a.getLop() > b.getLop();
}


void sapxep(sinhvien a[], int n) {
	sort(a, a + n,cmp);
	for (int i = 0; i < n; i++) {
		a[i].xuat();
	}
}


int main() {
	int n; 
	cin >> n;
	sinhvien a[100];
	for (int i = 0; i < n; i++) {
		a[i].nhap();
	}

	for (int i = 0; i < n; i++) {
		a[i].xuat();
	}
	sapxep(a, n);
}