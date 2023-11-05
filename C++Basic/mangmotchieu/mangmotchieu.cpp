#include<iostream>
using namespace std;

int main() {
	int A[50];
	int n; 
	cout << "Nhap so nguyen n : ";
	cin >> n;

	for (int i = 0; i < n; i++) {
		cout << "A[" << i + 1 << "] = "; 
		cin >> A[i];
	}

	cout << "\n";
	for (int i = 0; i < n; i++) {
		cout << "A[" << i << "] = " << A[i] << endl; 
	}
	return 0; 
}