import java.util.Scanner;
	public class Exer11{
		
		public static void main(String[] args){
			Scanner reader=new Scanner(System.in);
		int s;
		System.out.println(" digite o seu salario minimo e o seu salario");
		int min_salary=reader.nextInt();
		int salary=reader.nextInt();
		
		s= salary/min_salary;
     			System.out.println("recebes " + s + " salarios minimos");
}
	}