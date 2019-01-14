/*
 A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos n�meros 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o n�mero de estudantes que v�o
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relat�rio de todas ocupa��es do pensionato, por ordem de quarto,
conforme exemplo.

How many rooms will be rented? 3
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
1: Marco Antonio, marco@gmail.com
5: Maria Green, maria@gmail.com
8: Alex Brown, alex@gmail.com
 */
package exerciciosSecao5;

import java.util.Scanner;

public class RentOfRooms {

	public static void main(String[] args) {

		String name;
		String email;
		int numRoom; //n�mero do quarto que ser� alugado
		int numOfRooms; // quantidade de quartos que ser�o alugados
		
		Scanner sc = new Scanner(System.in);
		Room vect[] = new Room[11];

		System.out.print("How many rooms will be rented? ");
		numOfRooms = sc.nextInt() ; // acrescentado 1 para descartar a posi��o 0;
 
		for (int count = 0; count < numOfRooms; count++) {

			System.out.printf("Rent #%d:%n", count + 1);
			System.out.print("Name: ");
			name = sc.next();

			System.out.print("Email: ");
			email = sc.next();

			System.out.print("Room: ");
			numRoom = sc.nextInt();
			
			vect[count] =  new Room();
			vect[count].setNumRoom(numRoom);
			vect[numRoom].setStudent(new Student(name, email));

		}

		System.out.println("Busy rooms: ");
		for (int count = 0; count < vect.length; count++) {
			if (vect[count] != null) {
				System.out.println(
						vect[count].getNumRoom() 
						+ ": " 
						+ vect[count].getStudent().getName()
						+ ", "
						+ vect[count].getStudent().getEmail());
			}
		}
		sc.close();
	}

}
