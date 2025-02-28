from database import read_db

data_path = "data/products_simplify.json"
data = read_db(data_path,"products")

def read_all():
    return list(data.values())
def read_item(item_id):
    if item_id not in data:
        raise KeyError("id not found")
    return data[item_id]

def create(data):
    agregar= {
        "id": 31,
        "title": "Nuevo Producto",
        "description": "Descripción del nuevo producto",
        "category": "groceries",
        "price": 9.99
    }
    data.app
    print(type(data))
    #data["products"]

def delete(id):
    pass

def update(item):
    pass

def count_categories(category: str):
    # ej count_categories("beauty") --> 5
    pass

# sobre el orignal
def avg_rating():
    pass

def max_stock() -> tuple[int, int]:
    pass

def count_tags() -> dict[str, int]:
    pass


