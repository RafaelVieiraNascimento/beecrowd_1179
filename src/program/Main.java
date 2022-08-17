package program;

/*
beecrowd | 1179
Preenchimento de Vetor IV

Neste problema você deverá ler 15 valores colocá-los em 2 vetores conforme estes valores forem pares ou ímpares.
Só que o tamanho de cada um dos dois vetores é de 5 posições. Então, cada vez que um dos dois vetores encher,
você deverá imprimir todo o vetor e utilizá-lo novamente para os próximos números que forem lidos.
Terminada a leitura, deve-se imprimir o conteúdo que restou em cada um dos dois vetores,
imprimindo primeiro os valores do vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for necessário.

Entrada
A entrada contém 15 números inteiros.

Saída
Imprima a saída conforme o exemplo abaixo.
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, x = 0, y = 0;
		int[] par = new int[5];
		int[] impar = new int[5];

		for (int i = 0; i < 15; i++) {
			if (x == par.length) {
				x = 0;
				for (int j = 0; j < 5; j++) System.out.printf("par[%d] = %d\n", j, par[j]);
			}
			if (y == impar.length) {
				y = 0;
				for (int j = 0; j < 5; j++) System.out.printf("impar[%d] = %d\n", j, impar[j]);
			}
			if ((n = sc.nextInt()) % 2 == 0) {
				par[x] = n;
				x++;
			} else {
				impar[y] = n;
				y++;
			}
		}
		for (int j = 0; j < y; j++) System.out.printf("impar[%d] = %d\n", j, impar[j]);
		for (int j = 0; j < x; j++) System.out.printf("par[%d] = %d\n", j, par[j]);
		sc.close();
	}
}