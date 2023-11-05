class dog:
    def __init__(self,name,age):
        self.name = name
        self.age = age
    def __gt__(self,other):
        return True if self.age > other.age else False

roger = dog('Roger',8)
syd = dog('Syd',9)
print(roger > syd)             