#include <iostream>
#include"TypePizza.cpp"
using namespace std;

 class Pizza_store {
    public:
        void Order_pizza(Pizza& pizza) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    };

