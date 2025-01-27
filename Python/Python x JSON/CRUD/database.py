import json

def read_db(data_path,field): # read_db: Lee archivo JSON y devuelve un diccionario; 
                              # data_path: Ruta donde se encuantra el JSON;
                              # field: Nombre del campo en el JSON que contiene la lista de los datos a procesar?
    with open(data_path, mode="r", encoding="utf-8") as file: # Abre el documento en modo lectura 'r', como archivo. Con el 'with' lo cierra al acabar;
        data = json.load(file) # Convierte el contenido del archivo en un objeto de Python;
    items_dict = {item["id"] : item for item in data[field]} # Busca los ID dentro del archivo field, gracias a un bucle;
    return items_dict # Regresa el diccionario anteriormente creado

def read_db_list(data_path,field):
    with open(data_path, mode="r", encoding="utf-8") as file: # Abre el documento en modo lectura 'r', como archivo. Con el 'with' lo cierra al acabar;
        data = json.load(file) # Convierte el contenido del archivo en un objeto de Python;
    return data[field] # Devuelve el archivo con la base de datos;

def save_db(data_path, data):
    pass # pass = aun no tiene implementación;