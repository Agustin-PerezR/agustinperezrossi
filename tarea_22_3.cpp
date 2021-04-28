#include <iostream>
#include <vector>
using namespace  std;

bool  esPar(int n){
	bool esPar = n%2 ==0;
	return esPar;
}

bool esInpar(int n){
	bool esInpar = n%2 ==1;
	return esInpar;
}
bool todosPares(vector<int> numeros){
    bool sonPares= true;
    for(int a :numeros){
    	if(esPar(a)){
    		sonPares= sonPares && true; 
    	}else{
    		sonPares= sonPares && false;
    	}
    }		
}


void agregarNumeros(vector<int>& numeros, vector<int> numero2){
	for(int a : numero2){
		numeros.push_back(a);
	}
}


void imprimir (vector<int> numeros){
	for(int a : numeros){
		cout<<a<<endl;
	}
}


void eliminarimpar(vector<int> numeros){
	for(int a : numeros ){
		if(esInpar(a)){
			numeros.erase(a);
		}
	}
}

int main(){
  vector<int> numeros(1,2,3,4);
  vector<int> numero2(10,8,6,4);
}
   