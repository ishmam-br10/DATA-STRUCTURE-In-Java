print("Configure array in python")
# codes mainly cover array manipulation
def print_array(a):
    i = 0
    while i < len(a):
        print(a[i])
        i = i + 1

def print_array_reverse(a):
    i = len(a)-1
    while i>=0:
        print(a[i])
        i = i -1
    # u can also use for loop 
    # for i in range(1, len(a)+1):
    #     print(a[-1 * i])
def insert(s, index, value, size):
    if(size == len(s)):
        print("No space in array!")
        return
    if(index<0 or index> size):
        print('Wrong index!')
        return
    i = size -1
    while(i>=index):
        s[i+1] = s[i]
        i = i - 1
    s[index] = value
    
    
# ===================================
a = [10, 20, 30, 40, 50]
print_array(a)
print("Printing in reverse")
print_array_reverse(a)
l = [10, 20, 30, 40, 50, 0, 0, 0]
print(f"l before insertion {l}")
insert(l, 2, 200, 5)
print(l)
