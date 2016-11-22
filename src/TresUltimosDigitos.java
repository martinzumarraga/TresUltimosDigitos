import java.util.Scanner;

public class TresUltimosDigitos {
	/*
	 	Debes encontrar los tres últimos dígitos antes de la coma decimal para 
	 	(3 + raíz(5)) elevado a n.
		Por ejemplo, para n = 5, (3 + √5)5 = 3935.73982... La respuesta es 935.
		Para n = 2, (3 + √5)2 = 27.4164079... La respuesta es 027.
		El primer dato de entrada será la cantidad de valores que se van a analizar.
	 */
	public static void main (String [ ] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cases=Integer.valueOf(scanner.nextLine());
		
		for(int j=0;j<cases;j++){
			int n = Integer.valueOf(scanner.nextLine());
			int num =(int) Math.pow(3+Math.sqrt(5),n);
			String result="";
			
			for(int i=0;i<3;i++){
				if(num%10!=0){
					result=num%10+result;
				}else{
					result="0"+result;
				}
				num/=10;
			}
			
			System.out.println("Case #"+(j+1)+": "+result);
		}
		
	}
}
