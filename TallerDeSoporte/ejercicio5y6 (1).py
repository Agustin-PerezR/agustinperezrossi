diccionario = {"Tomas":17,"Santiago":17}
print(diccionario)
edad = 1

for i in diccionario:
    edad = diccionario.get(i)
    edad = edad  * 2
    diccionario[i] = edad
    print(diccionario)