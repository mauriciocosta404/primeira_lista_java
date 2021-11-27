import java.util.Scanner;

public class Exer16{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite a medida em pes");
		int pes=leitor.nextInt();
		System.out.println("a medida em polegadas e = "+ pes*12);
		System.out.println("a medida em jarda e = "+ pes*3);
		System.out.println("a medida em milha e = "+ ((pes*3)*1.760));
						
	 }
}