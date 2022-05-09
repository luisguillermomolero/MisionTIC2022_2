"""
SECUENCIAS
Un tipo de secuencia es un tipo de dato en Python el cual es capaz de 
almacenar mas de un valor (o ninguno si la secuencia esta vacía), los 
cuales pueden ser secuencialmente (de ahí el nombre) examinados, elemento 
por elemento.
"""

"""
MUTABILIDAD
Es una propiedad de cualquier tipo de dato en Python que 
describe su disponibilidad para poder cambiar libremente durante la ejecución 
de un programa. Existen dos tipos de datos en Python: mutables e inmutables.
"""

"""
INMUTABILIDAD
Las tuplas....
"""

"""
•	Cada clave debe de ser única. No es posible tener una clave duplicada.
•	Una clave puede ser un tipo de dato de cualquier tipo: puede ser un número
    (entero o flotante), o incluso una cadena.
•	Un diccionario no es una lista. Una lista contiene un conjunto de valores 
    numerados, mientras que un diccionario almacena pares de valores.

"""


# Ejercicios 1
diccionario = {}

print(diccionario)

# Ejemplo 2

# #Diccionario vacio usando el constructor dict()
diccionario = dict()

print(diccionario)

# Ejercicio 2 -

# Si necesitamos almacenar nuevos valores basta con separarlos mediante una coma.

diccionario = {
    "total": 55,
    "descuento": True,
    "subtotal": 15.325478596,
    "Cliente": 'Luis Molero'
}

print(diccionario)

# Ejercicio 4

# Argumentos con nombre
Diccionario = dict(uno=1, dos=2, tres=3)

print(Diccionario)

# Pares clave: valor encerrados entre llaves
Diccionario = dict({'uno': 1, 'dos': 2, 'tres': 3})

print(Diccionario)

# Iterable que contiene iterables con dos elementos (lista de tuplas)
# Los valores de una «tupla» se guardan entre () «inmutables»
# Los valores de una «lista» se guardan entre [] «mutables»

Diccionario = dict(
    [('uno', 'Luis Molero'), ('dos', True), ('tres', 3.321654987)])
print(Diccionario)

# Ejercicio 5

dict = {
    "gato": "chat",
    "perro": "chien",
    "caballo": "cheval"
}

numerosTelefono = {
    'jefe': '+57 5551234567',
    'Suzy': '+57 3669258787'
}

diccionarioVacio = {}

print(dict)
print(numerosTelefono)
print(diccionarioVacio)

print(dict['gato'])
print(numerosTelefono['Suzy'])

# Ejemplo 6

usuario = {
    'nombre': 'Nombre del usuario',
    'edad': 23,
    'curso': 'Curso de Python',
    'skills': {
        'programacion': True,
        'base_de_datos': False
    },
    'No medallas': 10
}

print(usuario)

# Ejemplo 6
"""
Para poder agregar, obtener o modificar algún valor del diccionario haremos 
uso de corchetes.
"""
diccionario = dict()

diccionario['usuario'] = 'eduardo'
print(diccionario['usuario'])
diccionario['usuario'] = 'Carlos'
print(diccionario['usuario'])
diccionario['usuario'] = 'Luis'
print(diccionario['usuario'])
diccionario['usuario'] = 'Molero'
print(diccionario['usuario'])

# Ejemplo 7
"""
podemos obtener todas las llaves de nuestro diccionario utilizando el método 
keys, de igual forma podremos obtener todos los valores el diccionario con le 
método values.
"""

diccionario = {'Eduardo': 1, 'Fernando': 2, 'Uriel': 3, 'Rafael': 4}
print(diccionario.keys())
print(diccionario.values())

# Ejercicio 7
Diccionario = {
    "Nombre": "Sixto Manuel",
    "Apellido": "García Romero",
    "Cedula": 72153890,
    "Dirección": "calle 50 carrera 20",
    "Telefono": 3197138795,
    "Titulo": "Ingeniero",
    "Ciudad": "Barranquilla",
    "Trabajo": "independiente"
}

print("cantidad de datos: ", len(Diccionario), "\n")
print(Diccionario, "\n")
print(Diccionario.keys(), "\n")
print(Diccionario.values(), "\n")

# Ejercicio 7

datos = {'id': '87689s87d6',
         'nombre': 'Andres',
         'apellido': 'Pizarro',
         'email': 'andres.pizarro@hotmail.com',
         'telefono': 3135555555,
         'direccion': 'calle 98',
         'ciudad': 'Pereira',
         'departamento': 'Risaralda',
         'pais': 'Colombia'}

print(f'Numero de datos: {len(datos)}')

for k in datos.keys():
    print(f'{k} = {datos[k]}')

# Ejercicio 7

datos = dict(
    id='87689s87d6',
    nombre='Mauricio',
    apellido='Posada',
    email='maopos@micorreo.com',
    telefono=78576588765,
    github='@maopos',
    instagram='@maoposites',
    direccion='calle 5 carrera 20b',
    ciudad='cali',
    departamento='Valle',
    pais='Colombia'
)

print('Cantidad de datos: ', len(datos))
print(datos)
print()
print(datos.keys())
print()
print(datos.values())
print()

# Ejemplo 8

diccionario = {
    "clave1": 234,
    "clave2": True,
    "clave3": "Eduardo_gpg",
}

print(diccionario)
print(type(diccionario))
print(diccionario['clave1'])
print(type(diccionario['clave1']))
print(diccionario['clave2'])
print(type(diccionario['clave2']))
print(diccionario['clave3'])
print(type(diccionario['clave3']))

# Ejemplo 9

"""
Acceder a valor de clave
Esta operación le permite acceder a un valor especifico del diccionario 
mediante su clave.
"""

diccionario = dict(python=2.7, zope=2.13, plone='+57 326.214.5698', django=2.1)

print(diccionario['zope'])


# Encapsulamiento con Diccionario

def promedioNotas2(dicNotas):
    sumatoria = 0
    sumatoria += dicNotas['Nota1']
    sumatoria += dicNotas['Nota2']
    sumatoria += dicNotas['Nota3']
    sumatoria += dicNotas['Nota4']
    promedio = round(sumatoria / 4, 2)
    return promedio


dicNotas = {}
dicNotas['Nota1'] = 3.0
dicNotas['Nota2'] = 2.1
dicNotas['Nota3'] = 5.0
dicNotas['Nota4'] = 4.7
print('El promedio es de: ', promedioNotas2(dicNotas))

# Ejemplo 3

# Encapsulamiento con Diccionario - Otra notación


def promedioNotas3(dicNotas):
    sumatoria = 0
    sumatoria += dicNotas['Nota1']
    sumatoria += dicNotas['Nota2']
    sumatoria += dicNotas['Nota3']
    sumatoria += dicNotas['Nota4']
    promedio = round(sumatoria / 4, 2)
    return promedio


dicNotas = {
    'Nota1': 3.0,
    'Nota2': 2.1,
    'Nota3': 5.0,
    'Nota4': 4.7
}

print('El promedio es de: ', promedioNotas3(dicNotas))

# Ejemplo 4

# Paso entre funciones


def reportePromedio(dicReporte):
    return dicReporte['estudiante'] + ' = ' + str(dicReporte['promedio'])


def generarReporteNotas(dicNotas):
    sumatoria = 0
    sumatoria += dicNotas['Nota1']
    sumatoria += dicNotas['Nota2']
    sumatoria += dicNotas['Nota3']
    sumatoria += dicNotas['Nota4']
    promedio = round(sumatoria/4, 2)
    reporteNotas = {
        'promedio': promedio,
        'estudiante': dicNotas['estudiante']
    }
    return reporteNotas


dicNotas = {
    'estudiante': 'Beneficiario Rodriguez',
    'Nota1': 3.0,
    'Nota2': 2.1,
    'Nota3': 5.0,
    'Nota4': 4.7
}

print(reportePromedio(generarReporteNotas(dicNotas)))


# Ejercicio tipo Reto

def datosPersonales(Ficha: dict) -> dict:

    uCe = Ficha['Cedula']
    uNom = Ficha['Nombre']
    uApe = Ficha['Apellido']
    uCor = Ficha['Correo']

    # Condición de fealdad

    if uCe <= 500000:
        condicion = 'Feo'
    else:
        condicion = 'Buena persona'

    dicSalida = {
        'Cedula': uCe,
        'Condicion': condicion
    }

    return dicSalida


Ficha = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}

print(datosPersonales(Ficha))

Ficha = {
    'Cedula': 10200300,
    'Nombre': 'Calos',
    'Apellido': 'Perdomo',
    'Correo': 'batequebrado@yahoo.es'
}

print(datosPersonales(Ficha))


# Ejemplo 10

"""
clear()
Este método remueve todos los elementos desde el diccionario.
"""

diccionario = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}
print(diccionario)
diccionario.clear()
print(diccionario)

# Ejemplo 11

"""
copy()
Este método devuelve una copia superficial del tipo diccionario
"""

diccionario = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}
print('Variable versiones     ', diccionario)

nuevaVersion = diccionario.copy()
print('Variable otro_versiones', nuevaVersion)


# Ejemplo 12

"""
fromkeys()
Este método crea un nuevo diccionario con claves a partir de un tipo 
de dato secuencia. El valor de value por defecto es el tipo None.
"""

lista = ('python', 'zope', 'plone')
versiones = dict.fromkeys(lista)
print("Nuevo Diccionario : %s" % str(versiones))

# Ejercicio

diccionario = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}
versiones = dict.fromkeys(diccionario)
print("Nuevo Diccionario : %s" % str(versiones))

"""
En el ejemplo anterior inicializa los valores de cada clave a 
None, mas puede inicializar un valor común por defecto para cada clave:
"""

versiones = dict.fromkeys(diccionario, 0.1)
print("Nuevo Diccionario : %s" % str(versiones))

# Ejemplo 13

"""
get()
Devuelve el valor de una clava solicitada. Sino la encuentra devuelve None
"""

diccionario = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}
print(diccionario.get('Cedula'))
print(diccionario.get('Correo'))


# Ejemplo 14

"""
items()
Devuelve una lista de pares de diccionarios (clave, valor), como una lista de tuplas
"""

diccionario = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}

print(diccionario.items())

# Ejemplo 15

"""
pop()
Remueve específicamente una clave de diccionario y devuelve valor correspondiente. 
Lanza una excepción KeyError si la clave no es encontrada.
"""

diccionario = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}
print('Version original ', diccionario)

versiones = diccionario.pop('Cedula')
print('Nueva version    ', diccionario)

# En este caso no existe la clave Telefono
versiones = diccionario.pop('Telefono')
print('Nueva version    ', diccionario)

# Ejemplo 16

"""
update()
Actualiza un diccionario agregando nuevos pares clave-valores en un segundo diccionario. 
Si se llama a update() sin pasar parámetros, el diccionario permanece sin cambios.

Este método no devuelve nada.
"""

diccionarioOriginal = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}
print('\nDiccionario Original ', diccionarioOriginal)

# nuevoDiccionario = dict(telefono = +012546935456)
nuevoDiccionario = ({'Telfono': 12546935456})

print('\nNuevo Diccionario - complemento ', nuevoDiccionario)

diccionarioOriginal.update(nuevoDiccionario)
print('\nDiccionario Actualizado ', diccionarioOriginal)


# Ejercicio 17
Usuario_1 = {
    'Cedula': 102000,
    'Nombre': 'Luis',
    'Apellido': 'Molero',
    'Correo': 'elsabroso@gmail.com'
}

Usuario_2 = {
    'Cedula2': 235487,
    'Nombre2': 'Carlos',
    'Apellido2': 'Perez',
    'Correo2': 'mondongo@gmail.com'
}

print('Producto 1:      \n', Usuario_1)
print('Producto 2:      \n', Usuario_2)

Usuario_1.update(Usuario_2)

print('Usuarios actualizados:      \n', Usuario_1)
print('\n')

for k in Usuario_1.keys():
    print(f'{k} = {Usuario_1[k]}')


# Ejercicio 18

datos = {
    'nombre': 'Andres',
    'apellido': 'Pizarro',
    'cc': '9862000'
}

print(f'\nNumero de datos: {len(datos)}\n')

for k in datos.keys():
    print(f'{k} = {datos[k]}')

# Agregamos 2 nuevos datos y actualizamos el registro
datos_add = {
    'cuenta_ahorros': 270819629,
    'Saldo': 100000000000
}

datos.update(datos_add)

print(
    f'\nAgregamos Información Adicional: Nuevo Numero de Datos: {len(datos)}\n')

for k in datos.keys():
    print(f'{k} = {datos[k]}')


# Ejemplo 19

# Funciones integradas en los diccionarios

"""
len()
Esta función devuelve un valor entero con el número de claves de un
diccinario especificado en su parametro.
"""

Datos = {
    'nombre': 'Andres',
    'apellido': 'Pizarro',
    'cc': '9862000'
}

print(len(Datos))

# Ejemplo 20

"""
El método keys() y sorted()
Retorna una lista de todas las claves dentro del diccionario.
"""

Datos = {
    'Nombre': 'Andres',
    'Apellido': 'Pizarro',
    'CC': '9862000'
}
print('\n')
for key in sorted(Datos.keys()):
    print(key, "->", dict[key])

# Ejercicio 21

animales = {
    'Nombre_gato': 'chat',
    'Nombre_perro': 'chien',
    'Nombre_caballo': 'cheval',
    'Nombre_gallina': 'chaki',
    'Nombre_raton': 'choin'
}

for i in sorted(animales.keys()):
    print(f'{i}: {animales[i]}')

# Ejercicio 23

"""
Métodos item()
Retorna una lista de tuplas donde cada tupla es un par de cada clave/valor.
"""

dict = {
    "Gato": "chat",
    "Perro": "chien",
    "Caballo": "cheval"
}

for spanish, french in dict.items():
    print(spanish, "->", french)

# Ejercicio 24

"""
Sentencias
Los diccionario tienen disponibles sentencias integradas en Python para su tratamiento

del: 
"""

# Ejercicio 25

# Comparando los nombres de los estudiantes

Informacion = {
    'Alumno1': {'nombre': 'Daniel', 'edad': 11, 'estatura': 1.75, 'grado': 'Master'},
    'Alumno2': {'nombre': 'David', 'edad': 32, 'estatura': 1.85, 'grado': 'Doctor'}
}

print('\n', Informacion, '\n')

# Comparado los Nombres de cada alumno

if Informacion['Alumno1']['nombre'] == Informacion['Alumno2']['nombre']:
    print('\n' + str(Informacion['Alumno1']['nombre']) +
          ' es igual a ' + str(Informacion['Alumno2']['nombre']) + '\n')
else:
    print('\n' + str(Informacion['Alumno1']['nombre']) +
          ' es diferente a ' + str(Informacion['Alumno2']['nombre']) + '\n')

# Comparado la edad de cada alumno

if Informacion['Alumno1']['edad'] > Informacion['Alumno2']['edad']:
    print('\n' + str(Informacion['Alumno1']['nombre']) +
          ' es mayor a ' + str(Informacion['Alumno2']['nombre']) + '\n')
else:
    print('\n' + str(Informacion['Alumno1']['nombre']) +
          ' es menor a ' + str(Informacion['Alumno2']['nombre']) + '\n')

# Ejercicio 26

dict = {"gato": "chat",
        "perro": "chien",
        "caballo": "cheval"
        }

words = ['gato', 'leon', 'caballo']

for word in words:
    if word in dict:
        print(word, "->", dict[word])
    else:
        print(word, "no está en el diccionario")

# Ejemplo 27

"""
Agregando nuevas claves
"""

Animales = {"gato": "chat", "perro": "chien", "caballo": "cheval"}

Animales['cisne'] = 'cygne'
print('\n', Animales)

# También es posible insertar un elemento al diccionario utilizando el método update()

Animales = {"gato": "chat", "perro": "chien", "caballo": "cheval"}

Animales.update({"pato": "canard"})
print('\n', Animales)

# Ejemplo 28

"""
Eliminado claves
"""
Animales = {"gato": "chat", "perro": "chien", "caballo": "cheval"}
print('\nDiccionario original ', Animales)

del Animales['perro']

print('\nNuevo diccionario    ', Animales)
