#include<iostream>
using namespace std;

int main() {
	char choice = ' ';
	cout << "Dau la thu do cua nuoc viet nam : " << endl;
	cout << "A . Ha Noi " << endl;
	cout << "B . Nghe An" << endl;
	cout << "C . Ha Tinh " << endl;
	cout << "D . Thanh Hoa " << endl;
	cout << "Nhap dap an cua ban  : "; 
	cin >> choice;
	switch (choice) {
	case 'A' : 
	case 'a' : 
		cout << "Chinh xac ! " << endl;
		break;
	case 'B':
	case 'b': 
		cout << " Sai ! " << endl;
		break;
	case 'C':
	case 'c':
		cout << " Sai ! " << endl;
		break;
	case 'D':
	case 'd':
		cout << " Sai ! " << endl;
		break;
	default : 
		break;
	}
}