## 1 Clase y Objeto → `01_clase_objeto.py`

```Python
class Persona:  
    def __init__(self, nombre, edad):  
        self.nombre = nombre  
        self.edad = edad  
  
    def saludar(self):  
        print(f"Hola, me llamo {self.nombre} y tengo {self.edad} años.")  
  
persona1 = Persona("David", 25)  
persona2 = Persona("Ana", 30)  
  
persona1.saludar()  
persona2.saludar()
```

**Explicación paso a paso:**
1. `class Persona:` → Define la **clase**, que es el molde para crear objetos de tipo `Persona`.
2. `def __init__(self, nombre, edad):` → Constructor que inicializa los atributos `nombre` y `edad` de cada objeto.
3. `self.nombre = nombre` → Cada objeto tiene su propio `nombre`.
4. `self.edad = edad` → Cada objeto tiene su propia `edad`.
5. `def saludar(self):` → Método que imprime un mensaje usando los atributos del objeto.
6. `persona1 = Persona("David", 25)` → Creamos un **objeto** `persona1` con nombre "David" y edad 25.
7. `persona1.saludar()` → Llama al método `saludar` de `persona1`. Cada objeto tiene su propio estado, por eso `persona2.saludar()` muestra valores distintos.

**Conceptos demostrados:**
- Clase → `Persona`
- Objeto → `persona1`, `persona2`
- Atributos → `nombre`, `edad`
- Método → `saludar()`

---

## Encapsulación → `02_encapsulacion.py`

```Python
class CuentaBancaria:  
    def __init__(self, titular, saldo):  
        self.titular = titular  
        self.__saldo = saldo  # atributo privado  
  
    def mostrar_saldo(self):  
        print(f"Saldo de {self.titular}: {self.__saldo}")  
  
    def depositar(self, monto):  
        if monto > 0:  
            self.__saldo += monto  
        else:  
            print("Monto inválido")  
  
    def retirar(self, monto):  
        if 0 < monto <= self.__saldo:  
            self.__saldo -= monto  
        else:  
            print("Saldo insuficiente o monto inválido")  
  
cuenta = CuentaBancaria("David", 1000)  
cuenta.mostrar_saldo()  
cuenta.depositar(500)  
cuenta.retirar(200)  
cuenta.mostrar_saldo()
```

**Explicación paso a paso:**
1. `self.__saldo = saldo` → `__saldo` es un **atributo privado**, no puede ser modificado directamente desde fuera de la clase.
2. `mostrar_saldo()` → Método público para acceder al saldo.
3. `depositar()` → Permite aumentar el saldo solo si el monto es válido.
4. `retirar()` → Permite disminuir el saldo solo si hay suficiente dinero.
5. `cuenta.__saldo` → Si intentamos acceder directamente, Python genera error: **protege la integridad del dato**.

**Conceptos demostrados:**
- **Encapsulación**: ocultamos el estado interno (`__saldo`) y lo protegemos mediante métodos.
- Evita que se asignen valores inválidos al saldo.

---

## Abstracción → `03_abstraccion.py`

```Python
from abc import ABC, abstractmethod  
  
class Animal(ABC):  
    def __init__(self, nombre):  
        self.nombre = nombre  
  
    @abstractmethod  
    def hacer_sonido(self):  
        pass  
  
class Perro(Animal):  
    def hacer_sonido(self):  
        print(f"{self.nombre} dice: Guau!")  
  
class Gato(Animal):  
    def hacer_sonido(self):  
        print(f"{self.nombre} dice: Miau!")  
  
animales = [Perro("Rex"), Gato("Michi")]  
  
for animal in animales:  
    animal.hacer_sonido()
```

**Explicación paso a paso:**
1. `class Animal(ABC):` → Clase abstracta. No puede instanciarse directamente.
2. `@abstractmethod` → Obliga a las clases hijas a implementar `hacer_sonido()`.
3. `class Perro(Animal)` → Hereda de `Animal` y define cómo hace el sonido.
4. `animales = [Perro("Rex"), Gato("Michi")]` → Lista de objetos diferentes que comparten una interfaz común.
5. `for animal in animales:` → Cada objeto puede llamar `hacer_sonido()` aunque sea de clase distinta (**polimorfismo también está presente**).

**Conceptos demostrados:**
- **Abstracción**: define solo lo esencial (`hacer_sonido`) y oculta la implementación interna.
- Permite manejar objetos de diferentes tipos de forma uniforme.

---

## Herencia → `04_herencia.py`

```Python
class Vehiculo:  
    def __init__(self, marca, modelo):  
        self.marca = marca  
        self.modelo = modelo  
  
    def arrancar(self):  
        print(f"{self.marca} {self.modelo} está arrancando.")  
  
class Auto(Vehiculo):  
    def abrir_maletero(self):  
        print(f"{self.marca} {self.modelo}: Maletero abierto.")  
  
mi_auto = Auto("Toyota", "Corolla")  
mi_auto.arrancar()       # heredado  
mi_auto.abrir_maletero() # propio
```

**Explicación paso a paso:**
1. `class Vehiculo:` → Clase base con método `arrancar()`.
2. `class Auto(Vehiculo):` → Clase hija que hereda todos los métodos de `Vehiculo`.
3. `mi_auto.arrancar()` → Método heredado funciona directamente.
4. `mi_auto.abrir_maletero()` → Método exclusivo de la clase hija.

**Conceptos demostrados:**
- **Herencia**: reutilización de código de la clase padre.
- Permite extender funcionalidades sin modificar la clase base.

---

## Polimorfismo → `05_polimorfismo.py`

```Python
class Animal:  
    def hacer_sonido(self):  
        print("El animal hace un sonido.")  
  
class Perro(Animal):  
    def hacer_sonido(self):  
        print("Guau!")  
  
class Gato(Animal):  
    def hacer_sonido(self):  
        print("Miau!")  
  
animales = [Perro(), Gato(), Animal()]  
  
for animal in animales:  
    animal.hacer_sonido()
```

**Explicación paso a paso:**
1. `class Perro(Animal)` y `class Gato(Animal)` → Heredan de `Animal`.
2. Sobrescriben `hacer_sonido()` → Cada clase tiene su propia implementación.
3. Lista `animales` → Contiene objetos de tipos diferentes.
4. Bucle `for animal in animales:` → Llama al mismo método `hacer_sonido()`, pero **cada objeto responde diferente** según su clase.

**Conceptos demostrados:**
- **Polimorfismo**: mismo mensaje (`hacer_sonido`) → diferentes comportamientos.
- Permite escribir código flexible que funcione con distintos tipos de objetos sin condicionales.