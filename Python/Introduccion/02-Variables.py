    # type : Consulta el tipo de dato.
print(type("Hello Python")) # Tipo 'str'
print(type(7))              # Tipo 'int'
print(type(7.9))            # Tipo 'float'
print(type(1 + 3j))         # Tipo 'complex'
print(type(True))           # Tipo 'bool'

variable_string = "Un String"
print("String:" + variable_string)

variable_int = 6
print("Int:" , variable_int)

variable_bool = False
print("Bool:",variable_bool)

variable_bool_str = str(variable_bool) # str(): Convierte un valor a String.
print("str():", variable_bool_str)
print("Tipo str():", type(variable_bool_str))

print("Concatenar:", variable_string, variable_int, str(variable_bool))# Con ',' se separa en el print.

""" Funciones del Sistema"""
print("Len:",len(variable_string))

'''Variables en una sola línea''' # Practica no recomendable.
nombre, apellido, edad = "Marc", "Martin", 19
print("Usuario:",apellido, nombre,"/ Edad:", edad)

"""Input"""
dni = input("Introduce tu dni: ")
print("Input: ", dni)

"""Tipado débil"""
direccion: str = "Calle"
direccion = 32
print("Tipado:",type(direccion))
