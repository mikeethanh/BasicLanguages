/* Mang ki tu : 
 - luon ket thuc bang null
 doc vao mot chuuoi ky tu : cin.getline(tenmang,sophantu)
*/

#include<iostream>
using namespace std;

int main() {
	int n; 
	char fullname[100];
	cout << "Nhap so sinh vien :";
	cin >> n;
	cin.ignore();
	cout << "Nhap ho va ten sinh vien : ";
	cin.getline(fullname, 99);
	cout << " ten sinh vien thu  la : " << fullname << endl;
	
}