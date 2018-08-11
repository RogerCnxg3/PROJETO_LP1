package codigos;
import java.util.Scanner;

public class Calculo_de_tijolo {

	public static void main(String[] args) {
		double L_parede, A_parede, bloco;
		float Tipo1, Tipo2, Tipo3;
		
			Tipo1 = (float) (0.19*0.19); // tijolo 8 furos
			Tipo2 = (float) (0.14*0.24); // tijolo 6 furos
			Tipo3 = (float) (0.09*0.19); // tijolo maciço
			
		Scanner in = new Scanner(System.in);
		System.out.println("Qual tipo de Tijolo? ");
		
		System.out.println("Aperte 1 para tijolo de 8 furos ");
		System.out.println("Aperte 2 para tijolo de 6 furos ");
		System.out.println("Aperte 3 para tijolo Maciço ");
		
		float tipo_tijolo = in.nextInt();
		
//########################################################################	
		//medidas das paredes
		System.out.println("Entre com a Largura da parede");
			L_parede = in.nextDouble();
		System.out.println("Entre com a Altura da parede");
			A_parede = in.nextDouble();
//########################################################################			
		// TIJOLO DE 8 FUROS
		if (tipo_tijolo ==1)	{	
			     float quant_tijolo = (float) ((L_parede * A_parede)/Tipo1);
			     System.out.println("A quantida de de tijolo é: "+quant_tijolo);
		}
		// TIJOLO DE 6 FUROS
		else 
			if(tipo_tijolo ==2){
					float quant_tijolo = (float) ((L_parede * A_parede)/Tipo2);
					System.out.println("A quantida de de tijolo é: "+quant_tijolo);
			}
		// TIJOLO MACIÇO
		else
			if(tipo_tijolo ==3){
					float quant_tijolo = (float) ((L_parede * A_parede)/Tipo3);
					System.out.println("A quantida de de tijolo é: "+quant_tijolo);
		}
		
	}

}
