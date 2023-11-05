#include "pizza.cpp"

class CheesePizza : public Pizza {
public:
    CheesePizza() {
        name = "Cheese pizza";
        dough = "Very thin dough";
        sauce = "Very spicy sauce";
        topping = "Black olives";
    }
};

class PepperoniPizza : public Pizza {
public:
    PepperoniPizza() {
        name = "Pepperoni pizza";
        dough = "Very thin dough";
        sauce = "Sweet sauce";
        topping = "Tomato";
    }
};

class GreekPizza : public Pizza {
public:
    GreekPizza() {
        name = "Greek pizza";
        dough = "Thin dough";
        sauce = "Chilli sauce";
        topping = "Black olives";
    }
};
