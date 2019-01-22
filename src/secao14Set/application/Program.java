/*
Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.

Example:

How many students for course A? 3
21
35
22
How many students for course B? 2
21
50
How many students for course C? 3
42
35
13
Total students: 6

 */

package secao14Set.application;

import java.util.HashSet;
import java.util.Scanner;

import secao14Set.model.entities.Course;
import secao14Set.model.entities.Instructor;
import secao14Set.model.entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStudents;
		Instructor instructor = new Instructor(new HashSet<>());

		Course courseA = new Course('A', new HashSet<>());
		Course courseB = new Course('B', new HashSet<>());
		Course courseC = new Course('C', new HashSet<>());

		instructor.getCourses().add(courseA);
		instructor.getCourses().add(courseB);
		instructor.getCourses().add(courseC);

		for (Course c : instructor.getCourses()) {
			System.out.print("How many students for course " + c.getIdCourse() + " ?");
			numOfStudents = sc.nextInt();

			for (int i = 1; i <= numOfStudents; i++) {
				courseA.getStudents().add(new Student(sc.nextInt()));
			}
		}
		
		System.out.print("Total students: " + instructor.totalOfStudents());
		

		sc.close();
	}

}
