# Funciones básicas
# Ejercicio 1

def sumaNumeros():
    a = 6
    b = 7
    suma = a + b
    return "la suma de " + str(a) + " + " + str(b) + " es igual a: " + str(suma)


print(sumaNumeros())

# Ejercicio 2


def imprime_Cosas():
    # aplicacion
    print("La clase esta genial")
    print('Python es lo máximo')


imprime_Cosas()

# Ejercicio 3


def raizCuadrada():
    valor = float(
        input("Por favor, introduzca un numero a calcaluar su raiz cuadrada: "))
    raiz = valor ** 0.5
    return print("La raiz cuadrada de : ", valor, " es ", raiz)


raizCuadrada()

# Ejercicio 4


def raizCuadrada2():
    valor = int(
        input("Por favor, introduzca un numero a calcular su raiz cuadrada: "))
    raiz = valor ** 0.5
    return 'La raiz cuadrada de :' + str(valor) + ' es ' + str(raiz)


print(raizCuadrada2())

# Ejercicio 5


def raizCuadrada3():
    valor = float(
        input("Por favor, introduzca un numero a calcular su raiz cuadrada: "))
    raiz = valor ** 0.5
    print("La raiz cuadrada de : ", valor, " es ", round(raiz, 2))


raizCuadrada3()


# Funciones con argumentos

# Ejercicio 1

def raizCuadrada4(x):
    raiz = x ** 0.5
    return 'La raiz cuadrada de :' + str(x) + ' es ' + str(raiz)


print(raizCuadrada4(5))

# Ejercicio 2


def suma(a, b):
    return a + b


print(suma(30, 10))

# Ejercicio 3


def suma2(a, b):
    return a + b


b = 30
a = 10
print(suma2(a, b))

# Ejercicio 4


def sumaNumeros(a, b):
    suma = a + b
    return "El resultado de la suma de " + str(a) + " + " + str(b) + ' es igual a: ' + str(suma)


print(sumaNumeros(5, 6))


# Ejercicio 5


def suma3(numero1, numero2):
    print(numero1 + numero2)
    print("\n")


resultado = suma3(30, 10)

print(resultado)

# Ejercicio 6


def suma4(numero1, numero2):
    print(numero1 + numero2)
    print("\n")
    return numero1 + numero2


suma4(30, 10)

# Ejercicio 7


def mi_funcion(nombre, apellido):
    miNombre = nombre + apellido
    return(miNombre)


print(mi_funcion("Luis ", "Molero"))

# Ejercicio 8


def saludar(nombre, mensaje='Hola'):
    print(mensaje, nombre)


saludar('Pepe Grillo')


# Función dentro de otra función

# Ejercicio 1

def imprime_Cosas():
    # aplicacion
    print("La clase esta genial")
    print('Python es lo máximo')


imprime_Cosas()


def repetir_funciones():
    print("\n")
    imprime_Cosas()
    imprime_Cosas()


repetir_funciones()

# Ejercicio 2


def bievenida():
    print('bienvenidos')


def sumarDosnumeros():
    bievenida()
    num1 = float(input("Ingrese el numero 1: "))
    num2 = float(input("Ingrese el numero 2: "))
    print("la suma de", num1, " + ", num2, " es igual a: ", num1 + num2)


sumarDosnumeros()

# Ejercicio 3


def mensaje():
    print("Ingrese por favor un valor")


def sumarDosnumeros():
    mensaje()
    num1 = float(input())
    mensaje()
    num2 = float(input())
    return print("la suma de ", num1, " + ", num2, " es igual a: ", num1 + num2)


sumarDosnumeros()

# Ejercicio 4


def mensaje2():
    print("Por favor, Introduzca un numero a calcaluar su raiz cuadrada: ")


def raizCuadrada():
    mensaje2()
    valor = int(input())
    raiz = valor ** 0.5
    return print("La raiz cuadrada de : ", valor, " es ", valor ** 0.5)


raizCuadrada()

# Funciones anidadas

# Ejercicio 1


def primeraFuncion():  # función externa
    print("\n \"Hola desde la función externa\" \n ")

    def segundaFuncion():  # función interna
        print("\n \"Hola desde la función interna\" \n")

    segundaFuncion()


primeraFuncion()

# Ejercicio 2


def Ejercicio():
    print('Bienvenida')
    valor = int(
        input("Por favor, introduzca un numero a calcaluar su raiz cuadrada: "))

    def raizCuadrada5(valor):
        raiz = round(valor ** 0.5, 3)
        return 'La raiz cuadrada de :' + str(valor) + ' es ' + str(raiz)

    print(raizCuadrada5(valor))


Ejercicio()

# Ejercicio 2


def Bienvenida():
    print('Bienvenid@s a mi código!!!')


def Ejercicio():
    Bienvenida()
    valor = int(
        input("Por favor, introduzca un numero a calcaluar su raiz cuadrada: "))

    def raizCuadrada5(valor):
        raiz = round(valor ** 0.5, 2)
        return 'La raiz cuadrada de :' + str(valor) + ' es ' + str(raiz)

    print(raizCuadrada5(valor))


Ejercicio()
