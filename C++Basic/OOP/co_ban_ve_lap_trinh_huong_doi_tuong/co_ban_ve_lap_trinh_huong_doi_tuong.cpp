#include <iostream>
#include <cmath> // Thư viện cho hàm sqrt và pow
using namespace std;

typedef struct tg {
    float x1, y1, x2, y2, x3, y3;
};

void nhap(tg& x) {
    cout << "nhap toa do 3 dinh cua tam giac" << endl;
    cin >> x.x1 >> x.y1 >> x.x2 >> x.y2 >> x.x3 >> x.y3;
}

float dodai(float x1, float y1, float x2, float y2) {
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)); // Sửa lỗi ở đây
}

int main() {
    tg tamgiac;
    nhap(tamgiac);

    float a = dodai(tamgiac.x1, tamgiac.y1, tamgiac.x2, tamgiac.y2);
    float b = dodai(tamgiac.x2, tamgiac.y2, tamgiac.x3, tamgiac.y3);
    float c = dodai(tamgiac.x3, tamgiac.y3, tamgiac.x1, tamgiac.y1);

    cout << "Do dai canh a: " << a << endl;
    cout << "Do dai canh b: " << b << endl;
    cout << "Do dai canh c: " << c << endl;

    return 0;
}
