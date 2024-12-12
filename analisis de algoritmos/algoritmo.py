"""
Ejemplo de análisis de Orden de Crecimiento

def programa_1(A, objetivo):
    n = A.length
    for (int i=0;i=0;i++)
        for (int j=0; j<n; j++)
            if A[i] + A[j] == objetivo:
                return i,j
    return None
    
Arreglo de ejemplo:

A = [5, 10, 12, 20, 21, 24, 27, 31, 38, 42, 50]

T_mejor (n) = C_0 + C_1 + C_2 + C_3 + C_4 = C -> tiempo de ejecución es constante

T_peor (n) = C_0 + (n+1)C_1 + n(n+1)C_2 + n^2C_3 + C_4 -> tiempo de ejecución que sería aproximadamente Cn^2 
"""
"""
def promgrama_2(A, objetivo):
    n = len(A)
    i, j = 0, n-1
    while i < = j:
        if A[i] + A[j] == objetivo: return i, j
        elif A[i] + A[j] > objetivo: j = j - 1
        else: i = i + 1
    return None
    
A = [5, 10, 12, 20, 21, 24, 27, 31, 38, 42, 50]

T_mejor (n) = C_0 + C_1 + C_2 + C_3 + C_4 = C -> tiempo de ejecución constante

T_peor (n) = C_0 + C_1 + nC_2 + nC_3 + nC_4 -> tiempo de ejecución sería aproximadamente Cn

En conclusión este algoritmo sería más eficiente que el anterior presentado. (Siempre y cuando el arreglo esté ordenado)
"""
"""
Algoritmo alternativo a A y B

def programa_2(A,objetivo):
    n = len(A)
    i, j = 0, n-1
    sol = None
    while i < = j:
        if A[i] + A[j] == objetivo: sol = (i,j)
        elif A[i] + A [j] > obejtivo: j = j - 1
        else: i = i + 1
    return sol
"""

"""
Busqueda en un arreglo ordenado

Dado un arreglo ordenado A y un valor x, encontrar i tal que A[i] = x.

def busqueda_lineal(A,x):
    for i in range(len(A)):
        if A[i] == x:
            return i
    return None.
    
    Ω(1) = T(n)
    O(n) = T(n)

"""

"""
def busqueda_binaria(A,x):
    p, q = 0, len (A)-1
    while p<=q:
        m = (p+q)//2
        if A[m] == x: return m
        elif A[m] > x: q = m - 1
        else: p = m + 1
    return None
    
    T(n) = Ω(1)
    T(n) = O(log_2 n)
"""

"""
Algoritmo de ordenamiento de burbuja

[10,7,5,12,20,2,8,13,6]


def ord_burbuja
    ultimo = len(A)-1
    intercambios = 0
    while intercambios > 0:
        for i in range(ultimo):
            if A[i] > A[i+1]:
                A[i],A[i+1] = A[i+1],A[i]
                intercambios +=1
                
        utlimo -=1
        
    T(n) = Ω(n)    
    
"""

"""
def ord_seleccion(A):
    n = len(A)
    for i in range(n-1):
        for j  in range(i+1,n):
            if A[j] < A[i]:
                A[i], A[j] = A[j], A[i]
                
    no importa como venga el arreglo, el comportamiento del algortimo es independiente del arreglo
    Utilizamos notación theta, ya que el mejor y el peor caso serían practicamente lo mismo.
    
    T(n) = Theta(n^2)
"""

"""
Ordenamiento por mezcla -> Ultimate rinse and repeat
[5,8,3,4,2,10,9,7]

- Se toma el arreglo y se parte por mitades (no se parte en lo práctico, en realidad se le saca una copia de la mitad)
- Se ordenan las mitades obtenidas
-luego de ordenarlas, se mezclan

def ord_mezcla(A):
    n = len(A)
    if n <= 1: return
    I = A[:n//2] -> para copiar la mitad de un arreglo, tiene que recorrerse un ciclo. Costo lineal T(n) = n
    D = A[n//2:] -> 
    ord_mezcla(I)
    ord_mezcla(D)
    I.append(math.inf)
    D.append(math.inf)
    p,q = 0,0
    for k in range(n): -> ciclo lineal en la mezcla
        if I[p] < I[q]:
            A[k], p = I[p], p+1
        else:
            A[k], q = D[q], q+1

"""
#Insersion sort

a=[23,1,10,5,2]

def alg_insertion_sort(a):
    n=0
    p=0
    for i in len(a):
        if i < a[n]:
            i,a[n]=a[n],a[i]

b=alg_insertion_sort(a)
print(b)
            
