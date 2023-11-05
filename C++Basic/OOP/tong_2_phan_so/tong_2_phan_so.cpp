#include<iostream>
using namespace std;

class phanso {
private :
	int tu; 
	int mau;
public : 
	phanso(int tu, int mau);
	friend istream& operator >> (istream& in, phanso& a);
	friend ostream& operator << (ostream& out, phanso a);
};

istream& operator >> (istream& in, phanso& a) {
	in >> a.tu >> a.mau;
}

ostream& operator << (ostream& out, phanso a) {
	out << a.tu << a.mau;
}

int main() {
	phanso p(1, 1), q(1, 1);
}