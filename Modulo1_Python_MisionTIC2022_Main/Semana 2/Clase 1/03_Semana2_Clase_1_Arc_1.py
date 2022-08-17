# Condicionales

"""
    Se sugieren las siguientes formas de clasificarlos condicionales:
        Decisiones simples
        Decisiones en secuencia
        Decisiones en cascada
        Decisiones anidadas
    
    Decisiones simples
    if:
        
    if:
    else:
    
    Decisiones en secuencia
    if:
    if:
    if:
    if:
    if:
    
    Decisiones en cascada
    if:
    else:
        if:
        else:
            if:
            else:
    
    if:
    elif:
    elif:
    elif:
    elif:
    else:
    
    Decisiones anidadas
    if:
        if:
        else:
    else:
        if:
        else:
    
"""

# Algebra de bool

"""
    Proposición: Expresión que contiene al menos un valor de verdad (Verdadero/Falso)
    
    Algebra Booleana: Trabaja con valores booleanos, operaciones lógicas (Verdadero/Falso)
    
    Operaciones Lógicas:
        Conjunción: and
        Disyunción: or
        Negación: not
    
    Tabla de verdad:
    
            and                          or                         not
    false and false = false     false or false = false     Argumento   not argumento
    false and true  = false     false or true  = true      False       true
    true  and false = false     true  or false = true      true        false
    true  and true  = true      true  or true  = true
    
    Ejercicio página 19, 24, 25, 27, 30, 31, 34
    
"""

# Try y Except

# Ejemplo 1: División con divisor igual a cero

dividendo = 10
divisor = 0
try:
    cociente = dividendo / divisor
    print(cociente)
except:
    print("No se permite la división por cero")


# Ejemplo 2: Conversión de Fahrenheit a celcius

temperatura_fahr = input('Introduzca una temperatura en Fahrenheit:')
try:
    fahr = float(temperatura_fahr)
    cel = (fahr - 32.0) * 5.0 / 9.0
    print(cel)
except:
    print('No ingreso ningún número, gracias')


# Ejemplo 3: Valor diferente a un número introducido por teclado

while True:
    try:
        x = int(input("Por favor, ingrese un número: "))
        print(x)
        break  # Si no da error, corta el while con break
    except ValueError:
        print("Eso no es un número, prueba otra vez...")


a = 25
b = 'dasdas'
try:
    resultado = a/b
    print('El resultado de ', a, ' entre ', b, ' es: ', round(resultado, 2))
except ZeroDivisionError:
    print("Error, division por cero.")
except TypeError:
    print("Error en el tipo de dato.")
finally:
    print("Gracias por usar el programa.")
