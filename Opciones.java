package adivinaYserie;
import java.util.Scanner;
public class Opciones {
	Scanner sc = new Scanner(System.in);
	public void serie(){
		int s=1, r=50;
		while (s<=51){
			System.out.print(s+"\t"+r+"\t");
			s=s+2;
			r=r-2;
		}
	}
	public void adivina(){
		int veces=0;
		int num=(int)(Math.random()*100+1);
		int n;
		do{
			System.out.println("Introduce numero:  ");
			n=sc.nextInt();
			if (num==n)
				System.out.println("Has acertado en "+veces+ " veces");
			else{
				System.out.println("No has acertado");
				if (num>n){
					System.out.println("El numero a adivinar es mayor");
				}
				else
					System.out.println("El numero a adivinar es menor");
				veces++;
			}		
		}while(num!=n);
	}
	public static void main(String[] args) {
		Opciones op = new Opciones();
		op.serie();
		System.out.println();
		op.adivina();

	}

}
