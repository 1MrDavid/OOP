from abc import ABC, abstractmethod

# --- Clase abstracta ---
class Vehiculo(ABC):
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo

    @abstractmethod
    def arrancar(self):
        """Método obligatorio: todos los vehículos deben poder arrancar"""
        pass

    @abstractmethod
    def detener(self):
        """Método obligatorio: todos los vehículos deben poder detenerse"""
        pass

    def mostrar_info(self):
        """Método común para todos los vehículos"""
        print(f"Vehículo: {self.marca} {self.modelo}")


# --- Clases concretas que implementan la abstracción ---
class Auto(Vehiculo):
    def arrancar(self):
        print(f"{self.marca} {self.modelo} arranca con la llave.")

    def detener(self):
        print(f"{self.marca} {self.modelo} se detiene con frenos hidráulicos.")

    def abrir_maletero(self):
        print(f"{self.marca} {self.modelo}: Maletero abierto.")


class Moto(Vehiculo):
    def arrancar(self):
        print(f"{self.marca} {self.modelo} arranca con botón de encendido.")

    def detener(self):
        print(f"{self.marca} {self.modelo} se detiene con freno de disco.")


# --- Uso práctico ---
vehiculos = [
    Auto("Toyota", "Corolla"),
    Moto("Honda", "CBR500R")
]

for v in vehiculos:
    v.mostrar_info()  # Método común
    v.arrancar()      # Comportamiento definido por cada clase hija
    v.detener()
    print("-" * 30)