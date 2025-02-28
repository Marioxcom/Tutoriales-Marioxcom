
def simplify(data, field, data_filter=None): # data_filter=None: No aplicar filtros de seleccion;
    
    items = [] # Objeto Array
    for item in data[field]: # Bucle con el archivo de la base de datos;
        new_dict = {} # Crea un nuevo diccionario;
        print("launch item.items()") # Texto de iniciacion
        print(item.items()) # Mostrar contenido dentro del array items
        for key, value in item.items(): 
            if key in data_filter:
                new_dict[key] = value
        if new_dict:
            items.append(new_dict)
    new_data = {field:items}
    return new_data



def simplify2(data, field, data_filter=None):
    for item in data[field]:
        keys = list(item.keys())
        for key in keys:
            if key not in data_filter:
                del item[key]

    return data
