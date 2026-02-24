# 05_polimorfismo.py
class Animal:
    def hacer_sonido(self):
        print("El animal hace un sonido.")

class Perro(Animal):
    def hacer_sonido(self):
        print("Guau!")

class Gato(Animal):
    def hacer_sonido(self):
        print("Miau!")

# Polimorfismo en acción
animales = [Perro(), Gato(), Animal()]

for animal in animales:
    animal.hacer_sonido()