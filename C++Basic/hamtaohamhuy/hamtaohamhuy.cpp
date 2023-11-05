/*
     ham tao ham huy 
     - tao ra thong tin , thu hoi bo nho cua 1 doi tuong 
*/
#include<iostream>
#include<cstring>
using namespace std; 

class student {
public:
   // propeties
    char ID[20];
    char name[100];
    int age; 
    float mark;
    char address[100];


    //ham tao mac dinh : 
    student() {//this giong con tro struct 
        cout << " call non para contructor (ham tao khong tham so)" << endl;
        this->name[0] = '\0';
        this->ID[0] = '\0';
        this->address[0] = '\0';
        this->age = 0;
        this->mark = 0;
    }

    student(char* name) {
        cout << " 1 para contructor (ham tao 1 tham so)" << endl;
        strcpy_s(this->name, 99, name);
       //copy tu tham so truyen vao vao thuoc tinh name (this-> name)
        this->ID[0] = '\0';
        this->address[0] = '\0';
        this->age = 0;
        this->mark = 0;
    }

    student(char* name, int age) {
        cout << "call 2  para contructor (ham tao 2 tham so)" << endl;
        strcpy_s(this->name, 99, name);
        this->ID[0] = '\0';
        this->address[0] = '\0';
        this->age = age;
        this->mark = 0;
    }

    student(char* name, int age, char* id, char* address, float mark) {
        cout << "call 5 para contructor (ham tao 5 tham so)" << endl;
        strcpy_s(this->name, 99, name);
        this->age = age;
        strcpy_s(this->ID, 19, id);
        strcpy_s(this->address, 99, address);
        this->mark = mark;
    }

    void showin4() {
        cout << "======= Student INfo==============" << endl;
        cout << "name " << name << endl;
        cout << "address" << address << endl;
        cout << "ID" << ID << endl;
        cout << "age" << age << endl;
        cout << "mark" << mark << endl;
        cout << "==================================" << endl;
    }
    //ham huy : 
    ~student() {
        cout << "call destrutor" << endl;
    }
};

int main() {
    char* name = new char[100];//tao mang dong cho con tro 
    strcpy_s(name, 99, "tran van hung");
    char* id = new char[20];
    strcpy_s(id, 19, "B21DCCNDEF");
    char* addr = new char[100];
    strcpy_s(addr, 19, "HA NOI");


    student s; //goi ham tao 0 tham so 
    student s1(name); //goi ham tao co 1 tham so 
    student s2(name, 20); //goi ham tao 2 tham so
    student s3(name, 18, id, addr, 9.6);

    s.showin4();
    s1.showin4();
    s2.showin4();
    s3.showin4();
    
    return 0;
}
