lista = []

for i in range(1000):
    lista.append(i + 1)


for i in lista:
    if i % 2 == 0:
        lista.remove(i)
print(lista)