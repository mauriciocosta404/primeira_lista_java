import java.util.Scanner;

public class Exer6{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digie as tres notas e os seus respectivos pesos");
		int nota1=leitor.nextInt();
		int peso1=leitor.nextInt();
		int nota2=leitor.nextInt();
		int peso2=leitor.nextInt();
		int nota3=leitor.nextInt();
		int peso3=leitor.nextInt();
                System.out.println("a media ponderada e = "+ ((nota1/peso1)+(nota2/peso2)+(nota3/peso3)));
						
	 }
}