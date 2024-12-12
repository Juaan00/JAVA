from random import randint

def quicksort(A,p,q):
    if p>=q: return
    pos_pivot = randint(p,q)
    A[p], A[pos_pivot] = A[pos_pivot],A[p]
    i, j = p + 1, q
    while i<=j:
        while i<=q and A[i]<=A[p]: i +=1
        while j>=p and A[j]>A[p]: j -=1
        if i<j: A[i],A[j] = A[j], A[i]
    A[p],A[j] = A[j],A[p]
    quicksort(A,p,j-1)
    quicksort(A,j+1,q)
    
A = [12,5,7,4,2,1,87,12,21,23]
quicksort(A,0,len(A)-1)
print(A)