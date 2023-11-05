/*
dung vong lap for : 
dung ham std :: fill(from , to , value)\
*/

#include<iostream>
using namespace std;

int main() {
	int b[10][10];
	int a[100];
	int n;
	cout << "Nhap so phap tu thuc te : ";
	cin >> n;

	//C1 
	for (int i = 0; i < n; i++) {
		a[i] = -1;
	}
	//c2 
	fill(a, a + n, -1);
	//mang 2 chieu 
	fill(b[0], b[0] + 10 * 10, -1);
}

