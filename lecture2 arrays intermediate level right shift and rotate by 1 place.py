#right rotating an array by one place
def rightRotate(source):

    temp=source[len(source)-1] #copying the last element of the array in temp

    i=len(source)-1 #pointer at last index of source

    while(i>=1):

        source[i]=source[i-1] #shifting elements to the right

        i=i-1

    source[0]=temp #copying the last element of the array in the 0th index



a=[10,20,30,40,50]

rightRotate(a)

print(a)