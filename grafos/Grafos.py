class Grafo:
    def __init__(self):
        self.adyacencia = {}
        
    def agregar_arista(self, ciudad1, ciudad2):
        if ciudad1 not in self.adyacencia:
            self.adyacencia[ciudad1] = []
        if ciudad2 not in self.adyacencia:
            self.adyacencia[ciudad2] = []
            
    def recorrer_bfs(self, ciudad_inicio):
        visitados = set()
        cola = [ciudad_inicio]
        visitados.add(ciudad_inicio)
        
        print("Recorrido BFS:")
        while cola:
            ciudad_actual = cola.pop(0)
            print(ciudad_actual, end= " ")
            
            for ciudad_vecina in self.adyacencia[ciudad_actual]:
                if ciudad_vecina not in visitados:
                    cola.append(ciudad_vecina)
                    visitados.add(ciudad_vecina)
                    
                    
        print()
    
    def recorrer_dfs(self, ciudad_inicio):
        visitados = set()
        def _dfs(ciudad):
            visitados.add(ciudad)
            print(ciudad, end=" ")
            for ciudad_vecina in self.adyacencia[ciudad]:
                if ciudad_vecina not in visitados:
                    _dfs(ciudad_vecina)
        print("Recorrido DFS")
        _dfs(ciudad_inicio)
        print()
        
    def encontrar_camino(self, ciudad_inicio, ciudad_destino):
        cola = [(ciudad_inicio, [ciudad_inicio])]
        visitados = set()
        
        while cola:
            ciudad_actual, camino_actual = cola.pop(0)
            
            if ciudad_actual == ciudad_destino:
                return camino_actual
            if ciudad_actual in visitados:
                continue
            visitados.add(ciudad_actual)
            for ciudad_vecina in self.adyacencia[ciudad_actual]:
                cola.append((ciudad_vecina, camino_actual + [ciudad_vecina]))
        return None
    
mapa = Grafo()

mapa.agregar_arista("Bogotá","Medellín")
mapa.agregar_arista("Bogotá", "Cali")
mapa.agregar_arista("Bogotá", "Pereira")
mapa.agregar_arista("Medellín", "Pereira")
mapa.agregar_arista("Cali", "Pereira")
mapa.agregar_arista("Pereira", "Armenia")


mapa.recorrer_bfs("Bogotá")
mapa.recorrer_dfs("Bogotá")

camino = mapa.encontrar_camino("Bogotá", "Armenia")
if camino:
    print("Camino encontrado:", "->".join(camino))
else:
    print("No se encontró camino entre las ciudades.")
