suma = 0
cantidadNumeros = int(input("Cuantos números desea ingresar : "))

for n in range(cantidadNumeros):
    numero = int(input("Ingrese el numero : "))
    suma += numero

print("El resultado de la suma es :", suma)
