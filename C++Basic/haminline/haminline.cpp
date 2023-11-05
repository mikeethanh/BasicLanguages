#include<iostream>
using namespace std;

/* ham inline 
* neu mot ham don gian , thuc hien 1 ,2 cau lenh thi thuong de ham inline
* ham inline de toi uu hoa chuong trinh 
*/

inline int cong(int a, int b) {
	return (a + b);
}
int main() {
	int a = 100;
	int b = 200;
	int sum = cong(a, b);
	cout << "tong = " << sum;
}