import java.util.*;

public class Contador {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		
		 int x = 0  ;
		 int y = 0 ;
		
	
		try {
		System.out.print("Por Favor informe um número: ");
		x = ler.nextInt();
		
		System.out.print("Por Favor Informe outro número: ");
		
		y = ler.nextInt();
		
		contar( x, y);
		
		}catch (Exception e) {
			System.out.println( e.getMessage());
		}finally {
	
	}

	}		
				
				static void contar(int x,int y) throws Exception {
					
					if( y < x ) {
						throw new Exception("O Segundo Parâmetro deve ser Maior que o Primeiro ");
					}else
						if( y > x);
						int resultado = (y-x);
						System.out.print("Número de iterações: " + resultado);
						System.out.println(" ");
					 for(int i = 0; i < resultado; i++) {
					 
					 System.out.print(i+1 + " ");
					}
					
				}
				
				
				}
					

					
	
