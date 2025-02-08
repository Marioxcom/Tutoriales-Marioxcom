file= open('datos/dato1.txt','r',encoding='utf-8')# Abrir el documento
lineas=file.readlines() # Lee el FILE
print(lineas)
file.close # Cerrar el documento

''' Leer un Archivo '''

with open('datos/dato2.txt','r') as leer1: # Lo abrira y cerrara automáticamente
    lineas2= leer1.readlines()
    print(lineas2)

for i in lineas2: # Igual al For Each en Java
    print(i.replace('\n',' ')) # Reemplaza el Intro por un Espacio

with open('datos/dato2.txt','r') as leer2:
    contenido=leer2.read()
    lineas3=contenido.split('\n') # Divide en cadenas al identificar un saltod e linea (\n)
    print(lineas3)

with open('datos/dato2.txt','r') as leer3:
    contenido=leer3.read()
    lineas3=contenido.split('\n')
    pos=leer3.tell() # Dice en la posicion del Archivo donde estas
    print(pos)

with open('datos/dato2.txt','rb') as leer4:
    print(type(leer4.read()))

''' Escribir y Agregar datos a Archivos'''

with open('datos/dato3.txt','w') as editar: # Escribir en Archivos
    editar.write('Oscar\nAlex\nMichael')

with open('datos/dato3.txt','a') as agregar: # Permite agregar al archivo
    agregar.write('Mario\nNoa')