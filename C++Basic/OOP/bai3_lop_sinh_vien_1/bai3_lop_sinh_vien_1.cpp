#include<iostream>
#include <string>
using namespace std;

class sinhvien {
private : 
    string masv; 
    string hoten; 
    string lop; 
    string ngaysinh;
    float gpa; 
public : 
    sinhvien();
    friend void nhap(sinhvien& a);
    friend void in(sinhvien a);
};

sinhvien::sinhvien() {
    masv = "";
    hoten = "";
    lop = "";
    ngaysinh = "";
    gpa = 0;
}
void nhap(sinhvien& a) {
    a.masv = "B20DCCN001";
    getline(cin, a.hoten);
    cin >> a.lop; 
    cin >> a.ngaysinh; 
    if (a.ngaysinh[2] != '/') a.ngaysinh = "0" + a.ngaysinh;
    if (a.ngaysinh[5] != '/') a.ngaysinh.insert(3, "0");
    cin >> a.gpa;
}

void in(sinhvien a) {
    cout << a.masv << a.hoten << a.lop << a.ngaysinh << a.gpa << endl;
}
int main() {
    sinhvien a;
    nhap(a);
    in(a);
}