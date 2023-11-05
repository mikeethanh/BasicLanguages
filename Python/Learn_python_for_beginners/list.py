dogs = ["hello",1,2,4,"good"]

dogs += ["jonas",5]

dogs += "jonas"
# j,u,n,a,s

dogs.remove("hello")

print(dogs.pop()) 
# hello

dogs.insert(2,"test")

dogs.sort
# only 1 type data
# is string , priority upper ->lower
dogs.sort(key = str.lower)
sorted(dogs)