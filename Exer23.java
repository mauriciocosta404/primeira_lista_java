import java.util.Scanner;

public class Exer23{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite o valor de seu peso");
		int weight=leitor.nextInt();
		System.out.println("se engordares 15% o seu peso sera = " +(weight+((weight*15)/100)));
		System.out.println("se imagreceres 20% o seu peso sera = " +(weight-((weight*20)/100)));				
	 }
}