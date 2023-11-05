#include<iostream>
using namespace std;

//mang mot chieu chinh la con tro , tro den phan tu dau tien trong mang 

void result(int* a) {// or void result (int a[])
	for (int i = 0; i < 10; i++) {
		cout << a[i] << " " ;
	for (int i = 0; i < 10; i++) {
		cout << *a << " "; 
		a++; //dia chi cua con tro a se nhay sang dia chi cua phan tu tiep theo trong mang 
		int* pos = a;// dia chi cua pos la dia chi cua phan tu dau tien trong mang a 
		for (; pos <= &a[9]; pos++) {
			cout << *pos << " "; 
		}
	}

}
int main() {
	int b[10] = { 0,1,2,3,4,5,6,7,8,9 };
	int* a; 
	a = &b;

	result(b);
}