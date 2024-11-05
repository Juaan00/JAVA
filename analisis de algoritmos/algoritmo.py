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