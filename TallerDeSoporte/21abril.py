import pandas as pd
df = pd.read_csv(contentdelitos_2021.csv)
df = pd.read_csv(contentdelitos_2021.csv,sep=;,engine=python)
print(df)
print(list(df.columns))
print(list(df.index))
print(df['tipo'])
df.loc[03000]
df.loc[8600088000]
df.loc[[1,5,12,36]]
dfConIndiceDNI = df.set_index('id-mapa')
df['tipo'].value_counts()
df_2 = df.drop_duplicates()
df.to_csv(nuevo.csv)