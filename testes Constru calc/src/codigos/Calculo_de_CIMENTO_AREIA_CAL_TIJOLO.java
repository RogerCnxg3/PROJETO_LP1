package codigos;
//AS ESPICIFICAÇÕES USADAS FOI EXTRAIDAS DO SITE
//http://www.ceramicaverdi.com.br/produtos/

import java.util.Scanner;

public class Calculo_de_CIMENTO_AREIA_CAL_TIJOLO {

	public static void main(String[] args) {
		
		double L_parede, A_parede, AREA;
		
	Scanner in = new Scanner(System.in);
	
	float A_oito=19, L_oito=9, c_oito = 19 ; 
	float A_seis=14, L_seis=9, c_seis = 24 ;
	double A_macico = 5.5, L_macico = 9, c_macico = 19 ;
	
	
// MEDIDAS DA PAREDE
		System.out.println("Entre com a Largura da parede");
		L_parede = in.nextDouble();
		System.out.println("Entre com a Altura da parede");
		A_parede = in.nextDouble();
		
		AREA= L_parede*A_parede;
		System.out.println("A Area é: "+AREA);
//MEDIDAS DO TRAÇO		
		float P_CIMENTO, P_CAL, P_AREIA;
		
System.out.println("ENTRE COM AS MEDIDAS DO TRAÇO: ");
		
		System.out.println("PROPOÇÃO DE CIMENTO ");
		P_CIMENTO = in.nextFloat();
		System.out.println("PROPOÇÃO DE CAL ");
		P_CAL = in.nextFloat();
		System.out.println("PROPOÇÃO DE AREIA ");
		P_AREIA = in.nextFloat();
	
		
//ESPESSURA DA MASSA		
		double  JUNTA;
		Scanner in2 = new Scanner(System.in);
		System.out.println("QUAL A ESPESSURA DA MASSA EM CENTIMETRO");
		JUNTA = in2.nextDouble();
		
		
//TIPO DE TIJOLO	
		double Tipo1, Tipo2, Tipo3, TIPO4;
		System.out.println("Qual tipo de Tijolo? ");		
		System.out.println("Aperte 1 para tijolo de 8 furos ");
		System.out.println("Aperte 2 para tijolo de 6 furos ");
		System.out.println("Aperte 3 para tijolo Maciço ");
		
		Tipo1 =   JUNTA*L_oito*((2*A_oito)+c_oito)*(1.07/((A_oito+1.5 )*(c_oito+1.5 )/10000 ))*AREA/1000000*1.05;// TIJOLO 8 FUROS
		Tipo2 =   JUNTA*L_seis*((2*A_seis)+c_seis)*(1.07/((A_seis+1.5 )*(c_seis+1.5 )/10000 ))*AREA/1000000*1.05;  // TIJOLO 6 FUROS
		Tipo3 =   JUNTA*L_macico*((2*A_macico)+c_macico)*(1.07/((A_macico+1.5 )*(c_macico+1.5 )/10000 ))*AREA/1000000*1.05; // TIJOLO MACIÇO
		
		//TIPO4 =JUNTA*L_oito* ((2*A_oito)+c_oito)*(1.07/((A_oito+1.5 )*(c_oito+1.5 )/10000 ))*AREA/1000000*1.05;
		
		
		int tipo_tijolo = in.nextInt();

		double Q_CIMENTO, Q_CAL, Q_AREIA=0, Q_TIJOLO;
	//################################################################################	
			Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
			Q_CAL =  ((P_AREIA/P_AREIA)*(P_CAL*670))/20;
			

			if (tipo_tijolo ==1)	{	
					Q_AREIA = Tipo1;
					Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
					Q_CAL =  ((Q_AREIA/P_AREIA)*(P_CAL*670))/20;
					
					Q_TIJOLO = 1.07/( (A_oito+1.5 )* (c_oito+1.5 )/10000 )*AREA;
					
					
					System.out.println("Parede com tijolo de 8 furos");
					System.out.printf("A QUANTIDADE DE TIJOLO É:= %.1f %n",Q_TIJOLO,"UNIDADES");
					System.out.printf("A QUANTIDADE DE CIMENTO É:= %.1f %n",Q_CIMENTO,"saco de 50 kg\r\n");
					System.out.printf("A QUANTIDADE DE CAL É:= %.1f %n",Q_CAL,"saco de 20 Kg\r\n");
					System.out.printf("A QUANTIDADE DE AREIA É:= %.1f %n",Q_AREIA,"M³");
		}
		// TIJOLO DE 6 FUROS
		else 
			if(tipo_tijolo ==2){
				Q_AREIA = Tipo2;
				Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
				Q_CAL =  ((Q_AREIA/P_AREIA)*(P_CAL*670))/20;
				
				Q_TIJOLO = 1.07/( (A_seis+1.5 )* (c_seis+1.5 )/10000 )*AREA;
				
				
				System.out.println("Parede com tijolo de 6 furos");
				System.out.printf("A QUANTIDADE DE TIJOLO É:= %.1f %n"+Q_TIJOLO+"UNIDADES");
				System.out.printf("A QUANTIDADE DE CIMENTO É:= %.1f %n"+Q_CIMENTO+"saco de 50 kg");
				System.out.printf("A QUANTIDADE DE CAL É:= %.1f %n"+Q_CAL+"saco de 20 Kg");
				System.out.printf("A QUANTIDADE DE AREIA É:= %.1f %n"+Q_AREIA+"M³");
			}
		// TIJOLO MACIÇO
		else
			if(tipo_tijolo ==3){
				Q_AREIA = Tipo3;
				Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
				Q_CAL =  ((Q_AREIA/P_AREIA)*(P_CAL*670))/20;
				
				Q_TIJOLO = 1.07/( (A_macico+1.5 )* (c_macico+1.5 )/10000 )*AREA;
				
				System.out.println("Parede com tijolo de MACIÇO");
				System.out.printf("A QUANTIDADE DE TIJOLO É:= %.1f %n"+Q_TIJOLO+"UNIDADES");
				System.out.printf("A QUANTIDADE DE CIMENTO É:= %.1f %n"+Q_CIMENTO+"saco de 50 kg");
				System.out.printf("A QUANTIDADE DE CAL É:= %.1f %n"+Q_CAL+"saco de 20 Kg");
				System.out.printf("A QUANTIDADE DE AREIA É:= %.1f %n"+Q_AREIA+"M³");
		}
		
}}