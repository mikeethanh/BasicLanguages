/*thu hoi bo nho chu dong 
 cu phap : delete pointer_name ; of delete[] pointer_name; 
  - voi con tro null 
  - voi con tro co / khong co tham chieu 
  - voi con tro mang 
  - voi con tro void 
  - voi con tro toi con tro 
*/

#include<iostream>
using namespace std;

int main() {
	int* nptr = NULL;
	delete nptr; 

	double* dptr = new double;
	delete dptr; 

	float* fptr = new float(3.123124f);
	delete fptr; 

	int* aptr; 
	int* a = new int(100);//int a = 100;
	aptr = a;//aptr = &a ; tro den vung nho cua bien a 
	// ......
	//aptr = NULL;
	delete aptr; 

	int* arr = new int[100];
	//.....
	delete arr;

	void* vptr; 
	int* b = new int(100);
	vptr = (int*)b;
	delete vptr; 


}

