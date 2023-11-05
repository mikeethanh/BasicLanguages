#include <iostream>
#include <string>
#include <vector>
using namespace std;

class sinhvien {
private:
    string masv, ht, l, email;
    static int dem;

public:
    friend void nhap(sinhvien& a);
    friend void xuat(sinhvien a);
};

int sinhvien::dem = 0;

void nhap(sinhvien& a) {
    cin >> a.masv;
    cin.ignore();
    getline(cin, a.ht);
    cin >> a.l;
    cin >> a.email;
}

void xuat(sinhvien a) {
    cout << a.masv << " " << a.ht << " " << a.l << " " << a.email << endl;
}

int main() {
    vector<sinhvien> v;
    sinhvien tmp;

    while (true) {
        nhap(tmp);
        if (tmp.masv == "0") {  // Thay "0" bằng điều kiện kết thúc nhập
            break;
        }
        v.push_back(tmp);
    }

    cout << "Danh sach sinh vien da nhap:" << endl;
    for (const sinhvien& sv : v) {
        xuat(sv);
    }

    return 0;
}
