import java.util.Scanner;
	public class Exer13{
		
		public static void main(String[] args){
			Scanner reader=new Scanner(System.in);
		int s;
		System.out.println(" digite o seu ano de nascimento e o ano actual");
		int born_year=reader.nextInt();
		int recent_year=reader.nextInt();
     			System.out.println("a sua idade e ="+(born_year-recent_year));
			System.out.println("em 2050 teras ="+(2050-born_year)+" anos");
}
	}