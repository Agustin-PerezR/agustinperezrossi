import pandas as pd
df = pd.read_csv("delitos_2021.csv")
df = pd.read_csv("delitos_2021.csv",sep=";",engine="python")
print(df)
print(list(df.columns))
print(list(df.index))
df.loc[:3000]
df.loc[:86000:88000]
df.loc[[1,5,12,36]]
dfConIndiceid = df.set_index('id-mapa')
df['id-mapa'].value_counts()
df_2 = df.drop_duplicates()
df.to_csv("archivo.csv")