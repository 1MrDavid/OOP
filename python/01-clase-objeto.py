# 01_clase_objeto.py
class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def saludar(self):
        print(f"Hola, me llamo {self.nombre} y tengo {self.edad} años.")


# Crear objetos
persona1 = Persona("David", 25)
persona2 = Persona("Ana", 30)

nombre = 'Gabriel'

persona1.saludar()
persona2.saludar()