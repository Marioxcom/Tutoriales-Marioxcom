import json

def read_db(data_path,field):
    with open(data_path, mode="r", encoding="utf-8") as file:
        data = json.load(file) # Convierte el contenido del archivo en un objeto de Python;
    items_dict = {item["id"] : item for item in data[field]} # Busca los ID dentro del archivo field, gracias a un bucle;
    return items_dict # Regresa el diccionario anteriormente creado

def read_db_list(data_path,field):
    with open(data_path, mode="r", encoding="utf-8") as file:
        data = json.load(file) # Lo convierte en un Objeto;
    return data[field] # Devuelve el archivo con la base de datos;

def save_db(data_path, data):
    pass