# 02_encapsulacion.py
class CuentaBancaria:
    def __init__(self, titular, saldo):
        self.titular = titular
        self.__saldo = saldo  # atributo privado

    # Método para consultar saldo
    def mostrar_saldo(self):
        print(f"Saldo de {self.titular}: {self.__saldo}")

    # Método para depositar dinero
    def depositar(self, monto):
        if monto > 0:
            self.__saldo += monto
        else:
            print("Monto inválido")

    # Método para retirar dinero
    def retirar(self, monto):
        if 0 < monto <= self.__saldo:
            self.__saldo -= monto
        else:
            print("Saldo insuficiente o monto inválido")

# Uso
cuenta = CuentaBancaria("David", 1000)
cuenta.mostrar_saldo()
cuenta.depositar(500)
cuenta.retirar(200)
cuenta.mostrar_saldo()
# print(cuenta.__saldo)  # Error: atributo privado