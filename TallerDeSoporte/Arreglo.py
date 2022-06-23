import pandas as pd

import matplotlib.pyplot as plt1

import numpy as np


valor = np.nan #NaN

df1 = pd.read_csv("/content/sample_data/Arreglo.csv")

df1 = df1.dropna()

print(df1.columns)

columna_Observacion = df1['Observación']

print(columna_Observacion)

df4=[]

#####################################################################

def convertir_en_minusculas(valor):

    if type(valor) == str:

         return valor.lower()

    else:

         return valor


def arreglo_Observacion(valor):
  if valor == "":
    return valor.replace("ninguna")


# ejemplo 2

def arreglar_fecha(valor):

  valor = str(valor)

  for caracter in valor:

      if not caracter.isnumeric() and caracter != "/":

            valor = valor.replace(caracter,'/')

            return valor



#print(df2)

columna_Observacion= columna_Observacion.apply(convertir_en_minusculas)
columna_Observacion = columna_Observacion.apply(arreglo_Observacion)
print(columna_Observacion)

columna_precio = df4['Precio']

for indice, valor in columna_precio.items():

        print("indice: ",indice)

        print("valor: ",valor)
