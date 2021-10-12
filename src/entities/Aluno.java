package entities;

public class Aluno {
      public String nome;
      public double nota1;
      public double nota2;
      public double nota3;
     
      public  double notaFinal(){
    	  return  nota1 + nota2 + nota3; 
      }
      
      public  String situacaoAluno(double notaFinal) {
    	  String situacao;
    	  if(notaFinal >= 60 ) {
    		  situacao = "Aprovado";
    	  }
    	  else {
    		  situacao = "Reprovado";
    	  }
    	  return situacao;
      }
      
      public double pontosFaltantes(double notaFinal) {
    	  return 60 - notaFinal;
      }
      
      public void mostrarDados(double notaFinal) {
    		if(notaFinal < 60) {
    			Double pontosFaltantes = pontosFaltantes(notaFinal);
    			System.out.printf("Nota Final = %.2f %n %s %n Falta(m) %.2f  ponto(s)", notaFinal , situacaoAluno(notaFinal) , pontosFaltantes);
    		}
    		else {
    		System.out.printf("Nota Final = %.2f %n %s", notaFinal , situacaoAluno(notaFinal));
    		}
      }
}
