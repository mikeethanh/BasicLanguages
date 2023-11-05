#include<iostream>
using namespace std;

//viet chuong trinh xem sv co qua mon hay ko : 
const float pass = 4.0;

int main() {
	float a = 0; 
	cout << "Nhap diem trung binh cua sinh vien : ";
	cin >> a;
	if (a < pass) {
		cout << "sinh vien qua mon " << endl;
	}
	else {
		cout << " sinh vien truot mon " << endl;
	}
}