#include<iostream>
using namespace std;

void showExample(void* data, int size) { //void la kieu khong xac dinh 
	if (size == sizeof(char)) {
		char* charptr = (char*)data; //ep kieu void sang char 
		cout << *charptr << endl; // in ra gia tri cua con tro *charptr
	}
	else if (size == sizeof(int)) {
		int* intptr = (int*)data;
		cout << *intptr << endl;
	}
	else if (size == sizeof(double)) {
		double* doubleptr = (double*)data;
		*doubleptr *= 2;
		cout << *doubleptr << endl;
	}
}

int main() {
	int* pptr = NULL; // khi muon gia phong bo nho 
	pptr = 0; 
	char c = 'C';
	showExample(&c, sizeof(char));
	int a = 100;
	showExample(&a, sizeof(int));
	double* d; 
	double d1 = 1.22;
	d = &d1;
	showExample(d, sizeof(double));
		//truyen con tro hoang mang vao ham thi khong can co dau & , truyen bien bth can dau &

}