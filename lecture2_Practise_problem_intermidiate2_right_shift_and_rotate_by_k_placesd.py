#right shifting an array by k places

def rightShift(source,k):

    i=len(source)-1 #pointer at the last index of source

    while(i>=k):

        source[i]=source[i-k]  #shifting elements k places to the right

        i=i-1

    i=0

    while(i<k):

        source[i]=0 #setting first k values to 0

        i=i+1



a=[10,20,30,40,50]

rightShift(a,3)

print(a)