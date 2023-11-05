#include<iostream>
using namespace std;

//truyen tham chieu cho phep thay doi gia tri goc da duoc tao trong ham main
//truyen gia tri thi khong 
void thamchieu(int& a) {
	a = a * 5;
}

void giatri(int a) {
	a = a * 5;
}

int main() {
	int a = 100;
	giatri(a);
	cout << " truyen gia tri : " << a << endl;
	thamchieu(a);
	cout << "truyen tham chieu : " << a << endl;

}