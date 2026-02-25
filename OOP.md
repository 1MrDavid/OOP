# ¿Qué es la Programación Orientada a Objetos (POO)?

La **Programación Orientada a Objetos (POO)** es un paradigma de programación que organiza el software alrededor de **objetos**, en lugar de funciones y lógica secuencial.

> La Programación Orientada a Objetos es un paradigma que organiza el software en estructuras llamadas objetos, los cuales encapsulan estado y comportamiento, y se fundamenta en los principios de encapsulación, abstracción, herencia y polimorfismo para promover modularidad, reutilización y mantenibilidad del código.

Un **objeto** es una entidad que combina:
- **Estado** → atributos o propiedades
- **Comportamiento** → métodos o funciones
- **Identidad** → instancia única en memoria

La POO modela el software de forma similar al mundo real.

---
## Clase

Una **clase** es una plantilla o molde que define:
- Qué atributos tendrá un objeto
- Qué métodos podrá ejecutar

Ejemplo conceptual:

```TXT
Clase: Persona  
Atributos: nombre, edad  
Métodos: saludar(), caminar()
```

La clase no es el objeto; es el plano para crearlo.

---

## Objeto

Un **objeto** es una instancia concreta de una clase.

```Java
Persona p1 = new Persona("David", 25);
```

Aquí:
- `Persona` → clase
- `p1` → objeto
- `"David"` y `25` → estado del objeto

---

# Principios Fundamentales de la POO

---

## 1. Encapsulación

### Definición
La **encapsulación** consiste en ocultar los detalles internos de un objeto y permitir el acceso únicamente a través de métodos controlados.

En términos técnicos:
> Es el mecanismo que restringe el acceso directo a los atributos del objeto y protege la integridad del estado interno.

### Objetivo
- Proteger datos
- Evitar modificaciones indebidas
- Mantener coherencia del estado

### Ejemplo conceptual

Incorrecto:

```Java
persona.edad = -10; // Estado inválido
```

Correcto:

```Java
persona.setEdad(25);
```

Donde el método valida:

```Java
public void setEdad(int edad) {  
    if (edad > 0) {  
        this.edad = edad;  
    }  
}
```

### Concepto clave

Se implementa mediante:
- Modificadores de acceso (`private`, `protected`, `public`)
- Getters y setters

---

## 2. Abstracción

### Definición
La **abstracción** consiste en mostrar únicamente la información relevante y ocultar la complejidad interna.

> Permite modelar entidades enfocándose en lo esencial.

### Ejemplo del mundo real
Un conductor usa un carro sin conocer cómo funciona el motor internamente.

### En programación

Se logra mediante:
- Clases abstractas
- Interfaces

Ejemplo conceptual:

```Java
abstract class Animal {  
    abstract void hacerSonido();  
}
```


No importa cómo lo haga cada animal, solo que debe hacerlo.

---

## 3. Herencia

### Definición
La **herencia** permite que una clase derive de otra, reutilizando sus atributos y métodos.

> Establece una relación “es un”.

### Ejemplo conceptual

```TXT
Clase base: Animal  
Clase derivada: Perro
```

Un **Perro es un Animal**.

### Código conceptual

```Java
class Animal {  
    void respirar() {}  
}  
  
class Perro extends Animal {  
    void ladrar() {}  
}
```

Ahora `Perro` tiene:
- respirar()
- ladrar()    

---

## 4. Polimorfismo

### Definición
El **polimorfismo** permite que diferentes objetos respondan de manera distinta al mismo mensaje (método).

> Significa “muchas formas”.

### Ejemplo conceptual

```Java
Animal a = new Perro();  
Animal b = new Gato();  
  
a.hacerSonido();  
b.hacerSonido();
```

Cada uno implementa el método de forma distinta.

### Tipos de Polimorfismo

#### 1️ Polimorfismo por sobrecarga (Compile-time)
Mismo método, diferentes parámetros:

```Java
sumar(int a, int b)  
sumar(double a, double b)
```

#### 2️ Polimorfismo por sobreescritura (Runtime)
Cuando una clase hija redefine un método de la clase padre.

```Java
@Override  
void hacerSonido() {  
System.out.println("Guau");  
}
```

---

## Tabla de Relacion

| Principio     | Problema que resuelve     |
| ------------- | ------------------------- |
| Encapsulación | Protección de datos       |
| Abstracción   | Simplificación del modelo |
| Herencia      | Reutilización             |
| Polimorfismo  | Flexibilidad              |
