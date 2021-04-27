import java.util.Scanner;

public class calculadora {
	public static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc=new Scanner (System.in);
		float numero1;
		float numero2;
		int operacion;
		float resultado=0;
		String otros;
		float numero3;

		
		System.out.println("dime un primer numero");
		numero1=sc.nextFloat();
		System.out.println("dime un primer numero");
		numero2=sc.nextFloat();
		
		do {
			System.out.println("dime una operacion");
			System.out.println("1.- SUMAR");
			System.out.println("2.- RESTAR");
			System.out.println("3.- MULTIPLICAR");
			System.out.println("4.- DIVIDIR");
			operacion=sc.nextInt();
		}while(operacion < 1 || operacion >4);
		
		
		switch(operacion) {
			case 1:
				resultado= numero1+numero2;
				System.out.println("El resultado de la suma es "+ resultado);
				break;
			case 2:
				resultado= numero1-numero2;
				System.out.println("El resultado de la resta es "+ resultado);
				break;
			case 3:
				resultado= numero1*numero2;
				System.out.println("El resultado de la multiplicación es "+ resultado);
				break;
			case 4:
				resultado= numero1/numero2;
				System.out.println("El resultado de la división es "+ resultado);
				break;	
		}
		
		do {
			System.out.println("quieres realizar otra operacion S para si N para no");
			otros=sc.next();
			if(otros.equalsIgnoreCase("S")) {
				do {
					System.out.println("dime una operacion");
					System.out.println("1.- SUMAR");
					System.out.println("2.- RESTAR");
					System.out.println("3.- MULTIPLICAR");
					System.out.println("4.- DIVIDIR");
					operacion=sc.nextInt();
				}while(operacion < 1 && operacion <4);
				System.out.println("dime otro numero");
				numero3=sc.nextFloat();
				switch(operacion) {
					case 1:
						resultado= resultado+numero3;
						System.out.println("El resultado de la suma es "+ resultado);
						break;
					case 2:
						resultado= resultado -numero3;
						System.out.println("El resultado de la resta es "+ resultado);
						break;
					case 3:
						resultado= resultado*numero3;
						System.out.println("El resultado de la multiplicación es "+ resultado);
						break;
					case 4:
						resultado= resultado/numero3;
						System.out.println("El resultado de la división es "+ resultado);
						break;	
				}
			}
			else if(otros.equalsIgnoreCase("N")) {
				break;
			}
		}while(otros.equalsIgnoreCase("S"));
		System.out.println("fin del programa");
	}

}
