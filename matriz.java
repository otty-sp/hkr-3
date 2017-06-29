import java.util.Scanner;
import java.util.StringTokenizer;
public class matriz {

    public static void main(String[] args) {
      
				int N;
				int[][] matriz; 
				int[] sumar;
				int[] multiplicar;
 				Scanner sc = new Scanner(System.in);
       	//String ;
				System.out.println("Introduce el valor de N");
				N=sc.nextInt();
				
				matriz = new int[N][N];
				sumar = new int[N];
				multiplicar = new int[N];

				for(int i=0;i<N;i++){

					for(int j=0;j<N;j++){

						System.out.println("Introduce el valor de la entrada "+"["+(i+1)+"]"+"["+(j+1)+"]"+" de la matriz");
						matriz[i][j]=sc.nextInt();
						
					}

				}
	

				//suma de columnas

				
			for(int i=0;i<N;i++){

					sumar[i]=0;
					multiplicar[i]=1;

					for(int j=0;j<N;j++){

							sumar[i]=sumar[i]+matriz[i][j];
							multiplicar[i]=multiplicar[i]*matriz[i][j];
							
					}
						
			}


			for(int i=0;i<N;i++){

				System.out.println("Suma["+(i+1)+"] = "+sumar[i]);
				
			}

			System.out.println();
		
			for(int i=0;i<N;i++){

				System.out.println("Multiplicacion["+(i+1)+"] = "+multiplicar[i]);
								
			}
					
    
   }

}
