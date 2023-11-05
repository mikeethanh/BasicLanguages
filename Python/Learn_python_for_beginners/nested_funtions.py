def talk(pharse):
    def say(word):
        print(word)

    words = pharse.split(' ')
    for word in words:
        say(word)    

talk('i am buying new phone')     

def counter():
    count = 0 
    def increment():
        nonlocal count
        count = count+1
        return count
    
    return increment

increment = counter()
        