# coding=utf8
def multiplicar(num):
    for x in range(1,11):
        print(num*x);

n1 = int(input("Ingrese el Primer Numero : "))
n2 = int(input("Ingrese el Segundo Numero: "))

if(n1>n2):
    print("El Primer Numero Ingresado es Mayor");
    multiplicar(n1);  
elif(n2>n1):
    print("El Segundo Numero Ingresado es Mayor");
    multiplicar(n2);  
else:
    print("Los dos Numeros Ingresados son Iguales");
    multiplicar(n1);  
