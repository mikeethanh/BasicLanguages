#include<iostream>
using namespace std;

int gcd(int a, int b) {
	if (b == 0) return a;
	return gcd(b, a%b);
}

class phanso {
private :
	int mau;
	int tu;
public:
	phanso(int tu, int mau);
	void rutgon();
	friend istream& operator >> (istream& , phanso& a);
	friend ostream& operator << (ostream&, phanso);
};

ostream& operator << (ostream& out, phanso a) {
	out << a.tu << a.mau;
}

istream& operator >> (istream& in, phanso& a) {
	in >> a.tu >> a.mau;
}
void phanso::rutgon() {
	int g = gcd(tu, mau);
	tu /= g;
	mau /= g;
}

int main() {
	phanso p(1,1);
	cin >> p; 
	p.rutgon();
	cout << p;

	return 0;
}