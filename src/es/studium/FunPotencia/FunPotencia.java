package es.studium.FunPotencia;

import java.util.Scanner;

public class FunPotencia
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int base, exponente ;
		System.out.println( "Dame la base" );
		base=teclado.nextInt();
		System.out.println( "Dame el exponente" );
		exponente=teclado.nextInt();
		System.out.println( "El resultado es " + potencia(base,exponente));
		teclado.close();

	}
	public static int potencia(int a, int b)
	{
		int resultado,i;
		resultado=1;
		for (i=1;i<=b;i++)
		{
			resultado=resultado*a;
		}
		return resultado;
	}

}


/*
PROGRAMA ejercicio14
VARIABLES
	ENTERO base,exponente
INICIO
	ESCRIBIR "Introduce la base:"
	LEER base
	ESCRIBIR "Introduce el exponente:"
	LEER exponente

	ESCRIBIR "Resultado"+ funPotencia (base,exponente)
FIN

FUNCION funPotencia (ENTERO base,ENTERO expoente) DEVUELVE ENTERO

VARIABLES
	ENTERO i, resultado
INICIO
	resultado = 1
	PARA i = 1 hasta i <= exponete HACER
		resultado = resultado*base
	FINPARA
DEVOLVER resultado
FIN*/