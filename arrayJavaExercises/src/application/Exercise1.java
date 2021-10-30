package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N
Representando o número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida,
registre o aluguel dos N estudantes. Para cada registro de aluguel, informer o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto
vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, por ordem
de quarto, conforme exemplo
---- Exemplo ---
How man rooms will be rentend? 3
Rent #1:
Name: Maria Green
Email: maria@gmail.com
Room: 5

Rent #2:
Name: Marco Antonio
Email: marco@gmail.com
Room: 1

Rent #3:
Name: Alex Brown
Email: alex@gmail.com
Room: 8

Busy rooms:
1: MArco Antonio. marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com
 */
public class Exercise1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rentend? ");
        int n = sc.nextInt();
        Rent[] vect = new Rent[10];

        for (int i=1; i<=n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect[room] = new Rent(name, email);
        }

        System.out.println("Busy rooms: ");

        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: ", i);
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
