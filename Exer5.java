import java.util.Scanner;

public class Exer5{
	
	 public static void main(String[] args)
	 {
		Scanner leitor=new Scanner(System.in);
                System.out.println("digite as tres notas");
		int n1=leitor.nextInt();
		int n2=leitor.nextInt();
		int n3=leitor.nextInt();
                System.out.println("a media e = "+(n1+n2+n3)/3);
						
	 }
}