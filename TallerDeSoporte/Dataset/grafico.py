import pandas as pd
import matplotlib.pyplot as plt1
import matplotlib.pyplot as plt2

df1 = pd.read_csv("/content/archivo.csv")
df1.set_index('mes')
df1.loc[0:3]
x_values = df1['mes'].unique()
y_values = df1['mes'].value_counts().tolist()
y_values.reverse()
print(x_values)
print(y_values)
# gráfico 1
plt1.bar(x_values,y_values)
plt1.title('delitos')
plt1.xlabel('mes')
plt1.ylabel('tipo')
plt1.show()
# grafico 2
plt2.plot(x_values,y_values);
plt2.title('Delitos')
plt2.xlabel('mes')
plt2.ylabel('tipo')
plt2.show()
