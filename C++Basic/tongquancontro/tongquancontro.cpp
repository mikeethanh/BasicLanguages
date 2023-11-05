#include<iostream>
using namespace std;

int main() {
	int a = 100;
	//dia chi cua bien a 
	cout << " dia chi cua bien a " << &a;
	cout << " gia tri cua bien a " << a;

	//con tro 
	int* aPtr;
	aPtr = &a;//con tro aPtr tro den bien a 
	cout << "Gia tri trong con tro aPtr : " << aPtr;
	//gia tri cua con tro la dia chi cua mot bien khac ma no dang tro toi 

	cout << "gia tri tai dia chi ma con tro dang tro toi : " << *aPtr;

}
