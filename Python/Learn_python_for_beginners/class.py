class Animal:
    def walk(self):
        print("walking")

# dog inherit class aninal
class Dogs(Animal):
    # construvtor
    def __init__(self,name,age):
        self.name = name
        self.age = age

    def bark(self):
        print("woof")

# gopi ham tao
roger = Dogs("Roger",8)

print(roger.name)
print(roger.age)

print(roger.bark())

print(help(Dogs))