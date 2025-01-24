notas = int(input("Número de notas que implementarás: "))
Lista = [notas]
for i in range(notas):
    nota = float(input(f"Nota {i + 1}: "))
    Lista.append(nota)


def media():
    return sum(Lista) / notas

print(media())