#include<iostream>
using namespace std;
/* cac kieu du lieu : 
* int : so nguyen co dai 
* unsigned int : kieu nguyen duong 
* long : so nguyen > int 
* long long so nguyen > long 
* unsigned long 
* unsigned long long 
* float : so thuc co dau 
* double : so thuc > float 
* char 
* bool 
*/

int main() {
	cout << "MAX kieu int : " << INT_MAX << endl;
	cout << "MIN kieu int : " << INT_MIN << endl;
	cout << endl;
	cout << "MAX kieu unsigned int : " << UINT_MAX << endl;
	cout << "MIN kieu unsigned int :  0 "  << endl;
	cout << "\n";
	cout << "MAX long : " << LONG_MAX << endl;
	cout << "MIN long " << LONG_MIN << endl;
	cout << "\n";
	cout << "MAX long long : " << LLONG_MAX << endl;
	cout << "MIN long long " << LLONG_MIN << endl;
	cout << "\n";
	cout << "MAX double  : " << DBL_MAX << endl;
	cout << "MIN double  : " << DBL_MIN << endl;
	cout << "\n";
	cout << "MAX float  : " << FLT_MAX << endl;
	cout << "MIN float  : " << FLT_MIN << endl;
}