import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);
		System.out.print("Vnesi go prviot broj");
		double a=input.nextDouble();
		System.out.print("Vnesi ja posakuvanata operacija");
		String operacija=scan.nextLine();
		System.out.print("Vnesi go vtoriot broj");
		double b=input.nextDouble();
		double c;
		switch(operacija) {
		case "+" :
		c=a+b;
		System.out.print(a+operacija+b+"="+c);
		break;
		case "-" :
		c=a-b;
		System.out.print(a+operacija+b+"="+c);
		break;
		case "*" :
		c=a*b;
		System.out.print(a+operacija+b+"="+c);
		break;
		case"/":
		c=a/b;
		System.out.print(a+operacija+b+"="+c);
		break;
		default:
		System.out.print("Proverete sto imate  napisano");
		break;
		}
	}

}
