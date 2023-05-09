#forward printing a circular array

def printForward(c,start,size):

    index=start

    i=0

    while(i<size):

        print(c[index])

        index=(index+1)%len(c)

        i=i+1

circularArray=[40,50,0,0,0,0,0,0,10,20,30] #creating a circular array with start 8 and size 5

printForward(circularArray,8,5)

"""
Thumb rule 2
Whenever you icreament the index of a circular array,
always mod the increamented value with the circular
array's length.
"""