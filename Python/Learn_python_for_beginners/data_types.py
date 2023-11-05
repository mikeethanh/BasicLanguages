name = "beau"
print(type(name))
print(isinstance(name,str))
#str
#true

# ep kieu
age = float("2")
print(isinstance(age,int))
# $ : and
#|:or
# ^:XOR
#  ~:NOT
# <<:left operation
# >>:right operation

# ternary operator
def is_adult(age):
    return True if age > 18 else False

# string
print(""" beau is 
39
year old
""")

print("bEau".title()) 
# Beau

a = True
b = False 
c = all([a,b])
# False
d = any([a,b])
# true

num1 = 2+3j
num2 = complex(2,3)
print(num2.real , num2.imag)