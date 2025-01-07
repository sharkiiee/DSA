l = [1,2,3,4,5,6,7,8,9];
value = int(input("Enter the value"))
found = False
for i in range(len(l)):
    if(value == l[i]):
        index = i
        found = True
        break

if(found):
    print(index)
else:
    print("value not found")