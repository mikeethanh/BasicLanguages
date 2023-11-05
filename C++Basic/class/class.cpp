/* - class dung de mieu ta cac hanh dong , lap trinh huong doi tuong 
 - rong hon struct 
 - object(doi tuong) tao ra tu class
*/
#include<iostream>
using namespace std;


class student {
public://tat ca deu nhin thay 

	//properties
	char name[20]; 
	char ID[20];
	int age; 
	float mark; 

	//hanh dong tuong ung : (method-ham)
	void showIDCard() {

	}

	void Study(char* subject) {

	}

	void doExample(char* subjName) {
	
	}

	void payFee(float amount) {

	}
};

	

int main() {

	student s1;//bien kieu student 
	s1.mark = 8, 5; 
	s1.age = 20;

	cout << "age: " << s1.age;
	
	

}
