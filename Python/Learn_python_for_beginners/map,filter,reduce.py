numbers = [1,2,4]

res = map(lambda a : a*2,numbers)

print(list(res))

res2 = filter(lambda n : n % 2 ==0 , numbers)

print(list(res2))