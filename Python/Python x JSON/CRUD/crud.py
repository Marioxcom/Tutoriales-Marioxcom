from database import read_db

DATA_PATH = "../data/products_simplify.json"
DATA = read_db(DATA_PATH,"products")

def read_all():
    return list(DATA.values())
def read_item(item_id):
    if item_id not in DATA:
        raise KeyError("id not found")
    return DATA[item_id]
def create(item):
    pass
def delete(id):
    pass
def update(item):
    pass
def count_categories(category: str):
    # ej count_categories("beauty") --> 5
    pass
# sobre el orignal
def avg_rating() -> list(float):
    pass

def max_stock() -> tuple[int, int]:
    pass

def count_tags() -> dict[str, int]:
    pass


