import java.util.Scanner;

public class Exer28{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o numero de horas trabalhadas e o salario minimo");
		int hour_number=leitor.nextInt();
		float min_salary=leitor.nextFloat();
		float hour_work=min_salary/2;
		float brute_salary=hour_number*hour_work;
		float duty=(brute_salary*3)/100;
		System.out.println("o seu novo salario e = "+ (brute_salary-duty));
						
	 }
}