package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import model.entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Aluno> set = new HashSet<>();
		
		System.out.print("How many studentes for course A? ");
		int cA = sc.nextInt();
		
		for (int i = 1; i <= cA; i++) {
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			
			set.add(new Aluno(id));
		}
		
		System.out.print("How many studentes for course B? ");
		int cB = sc.nextInt();
		
		for (int i = 1; i <= cB; i++) {
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			
			set.add(new Aluno(id));
		}
		
		System.out.print("How many studentes for course C? ");
		int cC = sc.nextInt();
		
		for (int i = 1; i <= cC; i++) {
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			
			set.add(new Aluno(id));
		}
		
		System.out.println("Total Students: " + set.size());
		sc.close();
	}

}
