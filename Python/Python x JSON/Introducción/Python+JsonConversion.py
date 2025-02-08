import json

clientes = '{"nombre":"Mario","edad":18,"nacionalidad":"Espana"}'

print(clientes)
print(type(clientes))

python_dict = json.loads(clientes)
print(python_dict)

print(python_dict['nacionalidad'])

data={
        "id":2345653,
        "empleado":"Marc",
        "edad":25,
        "puesto":"recuroso_humanos",
        "habilidades":["liderazgo","trabajo en equipo","comunicativo"]
}
json_data=json.dumps(data) # De Json a String
print(type(json_data))
print(json_data)

data={
        "id":2345653,
        "empleado":"Marc",
        "edad":25,
        "puesto":"recuroso_humanos",
        "habilidades":["liderazgo","trabajo en equipo","comunicativo"]
}

json_database=json.dumps(data,indent=4,separators=(", ", ": "),sort_keys=True) #sort_keys ordena el contenido
print(json_database) # .dumps convierte de Objeto a Cadena

json_data2=json.JSONEncoder().encode({"lenguajes":["javascript","go"]})
print(type(json_data2))

json_dict2=json.JSONDecoder().decode(json_data2)
print(type(json_dict2))


class Curso():

    def __init__(self,codigo,nombre,creditos):
        self.codigo=codigo
        self.nombre=nombre
        self.creditos=creditos

curso1=Curso("4567","Matematicas",5)        
json_object_data=json.dumps(curso1.__dict__) # Se convierte a str/diccionario

python_dict2=json.loads(json_object_data) # Se convierte a dicionario
print(python_dict2)