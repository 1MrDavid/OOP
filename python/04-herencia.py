# 04_herencia.py
class Vehiculo:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    def arrancar(self):
        print(f"{self.marca} {self.modelo} está arrancando.")

# Clase hija
class Auto(Vehiculo):
    def abrir_maletero(self):
        print(f"{self.marca} {self.modelo}: Maletero abierto.")

# Uso
mi_auto = Auto("Toyota", "Corolla")
mi_auto.arrancar()       # heredado
mi_auto.abrir_maletero() # propio