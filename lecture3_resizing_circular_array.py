#resizing a circular array



def resize(circ,start,size):

    resizedCirc=[0]*(len(circ)+2)

    index_circ=start

    index_resizedCirc=start

    i=0

    while(i<size):

        resizedCirc[index_resizedCirc]=circ[index_circ]

        index_circ=(index_circ+1)%len(circ)

        index_resizedCirc=(index_resizedCirc+1)%len(resizedCirc)  

        i=i+1

    return resizedCirc



circ=[20,30,40,50,10] #creating a circular array with start 4 and size 5

circ=resize(circ,4,5) 

print(circ)