
import tkinter as tk
from tkinter import messagebox

class Contactos:
    def __init__(self):
        self.contactos = {}

    def agregar_contacto(self, nombre, telefono):
        self.contactos[nombre] = telefono

    def buscar_telefono(self, nombre):
        if nombre in self.contactos:
            return self.contactos[nombre]
        else:
            return "Contacto no encontrado"

    def mostrar_contactos(self):
        return "\n".join([f"{nombre}: {telefono}" for nombre, telefono in self.contactos.items()])

class ContactosGUI:
    def __init__(self):
        self.lista_contactos = Contactos()
        self.ventana = tk.Tk()
        self.ventana.title("Gestor de Contactos")
        
        # Campos de entrada
        tk.Label(self.ventana, text="Nombre:").grid(row=0, column=0, padx=5, pady=5)
        self.nombre_entry = tk.Entry(self.ventana)
        self.nombre_entry.grid(row=0, column=1, padx=5, pady=5)
        
        tk.Label(self.ventana, text="Teléfono:").grid(row=1, column=0, padx=5, pady=5)
        self.telefono_entry = tk.Entry(self.ventana)
        self.telefono_entry.grid(row=1, column=1, padx=5, pady=5)
        
        # Botones
        tk.Button(self.ventana, text="Agregar Contacto", command=self.agregar).grid(row=2, column=0, columnspan=2, pady=5)
        tk.Button(self.ventana, text="Buscar Contacto", command=self.buscar).grid(row=3, column=0, columnspan=2, pady=5)
        tk.Button(self.ventana, text="Mostrar Todos", command=self.mostrar).grid(row=4, column=0, columnspan=2, pady=5)
        
        # Área de texto para mostrar resultados
        self.resultado_text = tk.Text(self.ventana, height=10, width=40)
        self.resultado_text.grid(row=5, column=0, columnspan=2, padx=5, pady=5)

    def agregar(self):
        nombre = self.nombre_entry.get()
        telefono = self.telefono_entry.get()
        if nombre and telefono:
            self.lista_contactos.agregar_contacto(nombre, telefono)
            messagebox.showinfo("Éxito", "Contacto agregado correctamente")
            self.nombre_entry.delete(0, tk.END)
            self.telefono_entry.delete(0, tk.END)
        else:
            messagebox.showerror("Error", "Por favor ingrese nombre y teléfono")

    def buscar(self):
        nombre = self.nombre_entry.get()
        if nombre:
            resultado = self.lista_contactos.buscar_telefono(nombre)
            self.resultado_text.delete(1.0, tk.END)
            self.resultado_text.insert(tk.END, resultado)
        else:
            messagebox.showerror("Error", "Por favor ingrese un nombre para buscar")

    def mostrar(self):
        self.resultado_text.delete(1.0, tk.END)
        self.resultado_text.insert(tk.END, self.lista_contactos.mostrar_contactos())

    def iniciar(self):
        self.ventana.mainloop()

if __name__ == "__main__":
    app = ContactosGUI()
    app.iniciar()
