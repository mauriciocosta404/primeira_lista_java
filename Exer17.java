import java.util.Scanner;

public class Exer17{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o seu salario");
		int salary=leitor.nextInt();
		System.out.println("o seu novo salario e = "+ (salary-((salary*25)/100)));
						
	 }
}