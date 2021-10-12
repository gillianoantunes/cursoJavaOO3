package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Aluno aluno;
		aluno = new Aluno();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno:");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a nota do aluno no primeiro trimestre:");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do aluno no segundo trimestre:");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a nota do aluno no terceiro trimestre:");
		aluno.nota3 = sc.nextDouble();
        
		Double notaFinal = aluno.notaFinal();
		aluno.mostrarDados(notaFinal);
	   sc.close();
	}

}
