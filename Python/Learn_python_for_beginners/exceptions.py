try:
    result = 2/0
except ZeroDivisionError:
    print('Can not divide by zero')
finally:
    result = 1 
print(result)   

try:
    raise Exception('an error')
except Exception as error:
    print(error)
        

class dog(Exception):
    pass
try:
    raise dog()
except dog:
    print('dog')        