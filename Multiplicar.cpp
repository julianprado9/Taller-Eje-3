#include <conio.h>
#include <stdio.h>

void multiplicar(int num){
	for (int i = 1 ; i <= 10 ; i++ )
    	printf( "\n   %d * %d = %d", i, num, i * num );
}

int main()
{
    int n1, n2;

    printf( "\n   Ingrese el Primer Numero: ");
    scanf( "%d", &n1 );
    printf( "\n   Ingrese el Segundo Numero: ");
    scanf( "%d", &n2 );

    if ( n1 > n2 ){
        printf( "\n   El Primer Numero Ingresado es mayor.", n1 );
        multiplicar(n1);
    }
        
    else
        if ( n1 < n2 ){
			printf( "\n   El Segundo Numero Ingresado es mayor.", n2 );
        	multiplicar(n2);
       }
        else{
            printf( "\n   Los Dos Numeros Ingresados Son Iguales" );
        	multiplicar(n1);
		}    
 
    getch(); /* Pausa */

    return 0;
}
