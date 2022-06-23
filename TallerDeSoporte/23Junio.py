import pandas as pd
import seaborn as sns
df1 = pd.read_csv("/content/sample_data/Software_Professional_Salaries.csv",sep=",",engine="python" )
df2 =df1[["Rating","Salary","Job Title"]]
grafico = sns.pairplot(df2,hue="Job Title",palette="Spectral")
