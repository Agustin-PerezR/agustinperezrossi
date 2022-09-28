import pandas as pd
df1 = pd.read_csv("/content/barrios.csv",sep=",",engine="python" )
condicion = df1['comuna'] == 3
df1 = df1[condicion]
print(df1[['barrio', 'area', 'perimetro']])

df2 = pd.read_csv("/content/barrios.csv",sep=",",engine="python" )
condicion = df2['comuna'] > 4
condicion2 = df2['comuna'] < 10
df2 = df2[condicion]
df2 = df2[condicion2]
print(df2[['barrio', 'area', 'perimetro']])

df3 = pd.read_csv("/content/comunas.csv",sep=",",engine="python" )
condicion = df3['ID'] == 5
df3 = df3[condicion]
print(df3[['PERIMETRO','AREA']])

df4 = pd.read_csv("/content/barrios.csv",sep=",",engine="python" )
condicion = df4.barrio.str.startswith('v')
df4 = df4[condicion]
print(df4['comuna'])

df5 = pd.read_csv("/content/barrios.csv",sep=",",engine="python" )
condicion = df5.barrio.str.contains('a')
df5 = df5[condicion]
print(df5['area'])

df6 = pd.read_csv("/content/comunas.csv",sep=",",engine="python" )
condicion = df6['ID'] == 15
df6 = df6[condicion]
print(df6['PERIMETRO'])

df7 = pd.read_csv("/content/comunas.csv",sep=",",engine="python" )
condicion = df7['ID'] == 7
df7 = df7[condicion]
print(df7['AREA'])

df9 = pd.read_csv("/content/comunas.csv",sep=",",engine="python" )
condicion = df9['ID'] == 3
df9 = df9[condicion]
print(df9[[]])
