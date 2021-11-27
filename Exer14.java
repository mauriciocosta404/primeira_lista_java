import java.util.Scanner;
	
public class Exer14{
		
		public static void main(String[] args){
			Scanner reader=new Scanner(System.in);
		int s;
		System.out.println(" digite o seu ano de nascimento e o ano actual");
		int born_year=reader.nextInt();
		int recent_year=reader.nextInt();
		int year=(recent_year-born_year);
     		System.out.println("a sua idade em anos e ="+year+" anos");
		int month=year*12;
		System.out.println("a sua idade em meses e ="+month+" meses");
		int day=(month*30);
		System.out.println("a sua idade e ="+day+" dias");
		int week=(day/7);
		System.out.println("a sua idade e ="+week+" semanas");
}
	}