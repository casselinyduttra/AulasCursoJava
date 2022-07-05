package com.casse.cursojava.aula20;

public class Matriz {

	public static void main(String[] args) {
		
		
		// matriz: tabela de n x m elementos
		//é uma tabela
		//matriz é uma array de array
		
		// armazenar as 4 notas do ano de 30 alunos.
		
		double[][] notasAlunos = new double [30][4];
	
	    //	[0]= 1º aluno [1]= nota 1
		//  [0]= 1º aluno [2]= nota 2
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		 //	[2]= 2º aluno [1]= nota 1
		//  [2]= 2º aluno [2]= nota 2
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		 //	[3]= 3º aluno [1]= nota 1
		//  [3]= 3º aluno [2]= nota 2
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		// [4]= 4º aluno [1]= nota 1
		// [4]= 4º aluno [2]= nota 2
		notasAlunos[3][0] = 8;
		notasAlunos[3][1] = 9;
		notasAlunos[3][2] = 10;
		notasAlunos[3][3] = 7;
		
		System.out.println("A nota do 1 aluno: " + notasAlunos[0][2]);
			System.out.println("A nota do 2 aluno: " + notasAlunos[1][2]);
				System.out.println("A nota do 3 aluno: " + notasAlunos[2][2]);
					System.out.println("A nota do 4 aluno: " + notasAlunos[3][1]);
		

	}

}
