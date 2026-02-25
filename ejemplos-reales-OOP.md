# Python — Objeto SQL con SQLAlchemy
Archivo: modelo_usuario.py

```Python
from sqlalchemy import create_engine, Column, Integer, String
from sqlalchemy.orm import declarative_base, sessionmaker

# 1. Crear clase base
Base = declarative_base()

# 2. Definir clase como modelo de tabla
class Usuario(Base):
    __tablename__ = "usuarios"

    id = Column(Integer, primary_key=True)
    nombre = Column(String)
    email = Column(String)

    def __repr__(self):
        return f"<Usuario(nombre={self.nombre}, email={self.email})>"

# 3. Crear motor de conexión (objeto Engine)
engine = create_engine("sqlite:///ejemplo.db")

# 4. Crear tablas
Base.metadata.create_all(engine)

# 5. Crear sesión (objeto Session)
Session = sessionmaker(bind=engine)
session = Session()

# 6. Crear objeto Usuario
nuevo_usuario = Usuario(nombre="David", email="david@email.com")

# 7. Guardarlo en la base de datos
session.add(nuevo_usuario)
session.commit()

print("Usuario guardado correctamente")
```

## ¿Dónde está la POO aquí?

1. `Usuario` es una clase

```Python
class Usuario(Base):
```

Representa una tabla de base de datos.

2. `nuevo_usuario` es un objeto

```Python
nuevo_usuario = Usuario(...)
```

Representa una fila.

> Cada fila de la base de datos se convierte en un objeto Python.

## Concepto clave

En lugar de escribir SQL como:

```SQL
INSERT INTO usuarios ...
```

Trabajas con objetos:

```Python
session.add(nuevo_usuario)
```

El ORM traduce objetos → SQL.

Eso es POO aplicada a persistencia.

---

# Java — Socket Client (Programación orientada a objetos en red)
Archivo: SocketClient.java

```Java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args) {
        String host = "localhost";
        int puerto = 5000;

        try {
            // 1. Crear objeto Socket
            Socket socket = new Socket(host, puerto);

            // 2. Crear objetos para enviar y recibir datos
            PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            // 3. Enviar mensaje
            salida.println("Hola servidor");

            // 4. Recibir respuesta
            String respuesta = entrada.readLine();
            System.out.println("Servidor dice: " + respuesta);

            // 5. Cerrar conexión
            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

## ¿Dónde está la POO aquí?

1. Socket

```Java
Socket socket = new Socket(host, puerto);
```

`Socket` es una clase.
`socket` es un objeto.

Encapsula:
- Conexión TCP
- Streams
- Estado de red

2. PrintWriter

Es otro objeto que encapsula la escritura de datos.

3️. BufferedReader

Objeto que encapsula lectura eficiente de datos.

> Java modela la red completamente como objetos que representan conexiones y flujos.

Eso es POO aplicada a infraestructura.