#include <iostream>
#include <string>
using namespace std;

class Pizza {
protected:
    string name;
    string dough;
    string sauce;
    string topping;

public:
    Pizza() = default;

    void prepare() {
        cout << "Preparing " << name << endl;
        cout << "Tossing dough" << endl;
        cout << "Adding sauce" << endl;
        cout << "Adding toppings" << endl;
    }

    void bake() {
        cout << "Baking " << name << " in 30 mins" << endl;
    }

    void cut() {
        cout << "Cutting " << name << endl;
    }

    void box() {
        cout << "Boxing " << name << endl;
    }
};
