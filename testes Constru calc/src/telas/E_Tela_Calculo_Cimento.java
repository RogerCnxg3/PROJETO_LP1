package telas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class E_Tela_Calculo_Cimento implements ActionListener{
//DECLARAÇÃO DOS COMPONETES 
	JFrame frame = new JFrame("Calculo Cimento");
	JPanel P_NORTE = new JPanel();
		JPanel P_Titulo = new JPanel();
			JLabel TITULO = new JLabel("GASTO DE CIMENTO PARA PAREDES:");
		
		JPanel P_Medidas = new JPanel();
				JLabel ALT_PAREDE = new JLabel("ALTURA:");       JTextField C_ALT_PAREDE = new JTextField(20);
				JLabel COMP_PAREDE = new JLabel("COMPRIMENTO:"); JTextField C_COMP_PAREDE = new JTextField(20);
		
	JPanel P_CENTRO = new JPanel();
		JPanel P_TRACO = new JPanel();
				JLabel JUNTA = new JLabel("JUNTA:");	  JTextField C_JUNTA = new JTextField(10);
				JLabel CIMENTO = new JLabel("CIMENTO:");  JTextField C_CIMENTO = new JTextField(10);
				JLabel AREIA = new JLabel("AREIA:");	  JTextField C_AREIA = new JTextField(10);
				JLabel CAL = new JLabel("CAL:");		  JTextField C_CAL = new JTextField(10);
		
				JLabel TIPO_TIJOLO = new JLabel("TIPO DE TIJOLO:");
				String [] T_TIJOLO = {"8 FUROS","6 FUROS","MACIÇO"};
				JComboBox CB_TIJOLO = new JComboBox(T_TIJOLO);
		
		JPanel P_TEXTAREA = new JPanel();
				JTextArea TXA_RESP = new JTextArea(5, 40);
	
	JPanel P_BOTAO = new JPanel();
	
		JButton BT_CALCULAR = new JButton("  CALCULAR  ");
		JButton BT_NOVO = new JButton    ("NOVO CALCULO");
		JButton BT_SAIR = new JButton    ("    SAIR    ");
		
//----------------------------------------------------------------------------------------------	
//CONSTRUTOR
	public E_Tela_Calculo_Cimento() {
		
		frame.setLayout(new BorderLayout());
		P_NORTE.setBorder(new TitledBorder("P_NORTE"));
			P_Titulo.setBorder(new TitledBorder("P_TILULO"));
			P_Medidas.setBorder(new TitledBorder("P_MEDIDAS"));
		
		P_CENTRO.setBorder(new TitledBorder("P_CENTRO"));
			P_TRACO.setBorder(new TitledBorder("P_TRAÇO"));
			P_TEXTAREA.setBorder(new TitledBorder("P_TEXTAREA"));
			
		P_BOTAO.setBorder(new TitledBorder("P_BOTAO"));
//----------------------------------------------------------------------------------------------		
// CAMPO DE TITULO E ENTRADA		
		frame.add(P_NORTE,BorderLayout.NORTH);
			P_NORTE.add(TITULO,BorderLayout.NORTH);
				
			P_NORTE.add(P_Medidas,BorderLayout.SOUTH);
				P_Medidas.add(ALT_PAREDE); P_Medidas.add(C_ALT_PAREDE);  
				P_Medidas.add(COMP_PAREDE); P_Medidas.add(C_COMP_PAREDE);
				
//----------------------------------------------------------------------------------------------
//CAMPO PARA MEDIDAS CIMENTO			
		frame.add(P_CENTRO,BorderLayout.CENTER);
			P_CENTRO.add(P_TRACO,BorderLayout.WEST);
				GridLayout grid = new GridLayout(5, 2);
				
				
				P_CENTRO.add(TIPO_TIJOLO); P_CENTRO.add(CB_TIJOLO);
				P_CENTRO.add(JUNTA);	  P_CENTRO.add(C_JUNTA);
				
				P_TRACO.setLayout(grid);
				P_TRACO.add(CIMENTO);     P_TRACO.add(C_CIMENTO);
				P_TRACO.add(AREIA);       P_TRACO.add(C_AREIA);
				P_TRACO.add(CAL);         P_TRACO.add(C_CAL);
				
				
//----------------------------------------------------------------------------------------------			
// CAMPO DE RESPOSTA 			
			P_CENTRO.add(P_TEXTAREA,BorderLayout.EAST);
				P_TEXTAREA.add(TXA_RESP);
				TXA_RESP.setFont(new Font("arial black", Font.PLAIN, 15));
				TXA_RESP.setEditable(false);

				
//----------------------------------------------------------------------------------------------				
// ADICIONANDO OS BOTOES
		frame.add(P_BOTAO,BorderLayout.SOUTH);
			P_BOTAO.add(BT_CALCULAR);
				BT_CALCULAR.addActionListener(this);
			P_BOTAO.add(BT_NOVO);
				BT_NOVO.addActionListener(this);
			P_BOTAO.add(BT_SAIR);
				BT_SAIR.addActionListener(this);
		
//----------------------------------------------------------------------------------------------		
//CARACTERISTICAS DA JANELA
		frame.setSize(700, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
//----------------------------------------------------------------------------------------------	
//METODO MAIN	
	public static void main(String[] args) {
		E_Tela_Calculo_Cimento comp = new E_Tela_Calculo_Cimento();
	}

//----------------------------------------------------------------------------------------------	
//EVENTOS DOS BOTOES
	public void actionPerformed(ActionEvent evento) {
// EVENTO DO BOTAO NOVO	
		if(evento.getSource()==BT_SAIR)
			frame.dispose();//destroi a janela
		
//----------------------------------------------------------------------------------------------		
// EVENTO DO BOTAO NOVO	
		if(evento.getSource()==BT_NOVO) {
			C_ALT_PAREDE.setText("");
			C_COMP_PAREDE.setText("");
			
			C_CIMENTO.setText("");
			C_AREIA.setText("");
			C_CAL.setText("");
			C_JUNTA.setText("");
			
			TXA_RESP.setText("");
		}
		
//----------------------------------------------------------------------------------------------		
// EVENTO DO BOTAO CALCULAR		
		if(evento.getSource()==BT_CALCULAR) {		
			double L_parede= Double.parseDouble(C_COMP_PAREDE.getText()),
					A_parede=  Double.parseDouble(C_ALT_PAREDE.getText());
			
			float A_oito=19, L_oito=9, c_oito = 19 ; 
			float A_seis=14, L_seis=9, c_seis = 24 ;
			float A_macico = (float) 5.5, L_macico = 9, c_macico = 19, AREA ;
			        
			AREA= (float) (L_parede*A_parede);
			
			
			
			
			float  P_CIMENTO = Float.parseFloat(C_CIMENTO.getText()),
					 P_AREIA =  Float.parseFloat(C_AREIA.getText()),
					   P_CAL =  Float.parseFloat(C_CAL.getText()) ;
			
			float JUNTA = Float.parseFloat(C_JUNTA.getText());
			
			double Tipo1, Tipo2, Tipo3, TIPO4;
			float Q_CIMENTO, Q_CAL, Q_AREIA=0, Q_TIJOLO;
			       
//----------------------------------------------------------------------------------------------		
// EVENTO SE O TIJOLO FOR DE 8 FUROS			
			if(CB_TIJOLO.getSelectedItem().equals("8 FUROS")) {
					Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
					Q_CAL =  ((P_AREIA/P_AREIA)*(P_CAL*670))/20;
						
						Tipo1 =   JUNTA*L_oito*((2*A_oito)+c_oito)*(1.07/((A_oito+1.5 )*(c_oito+1.5 )/10000 ))*AREA/1000000*1.05;// TIJOLO 8 FUROS
						Q_AREIA = (float) Tipo1;
						
					Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
					Q_CAL =  ((Q_AREIA/P_AREIA)*(P_CAL*670))/20;
					
					Q_TIJOLO = (float) (1.07/( (A_oito+1.5 )* (c_oito+1.5 )/10000 )*AREA);
					
					TXA_RESP.append("A QUANTIDADE DE CIMENTO NECESSARIO É: "+Q_CIMENTO+" SACO DE 50 Kg \n");
					TXA_RESP.append("A QUANTIDADE DE AREIA NECESSARIO É: "+Q_AREIA+" M³\n");
					TXA_RESP.append("A QUANTIDADE DE CAL NECESSARIO É: "+Q_CAL+" SACO DE 20 Kg \n");

		    }	
//----------------------------------------------------------------------------------------------		
// EVENTO SE O TIJOLO FOR DE 6 FUROS		
			if(CB_TIJOLO.getSelectedItem().equals("6 FUROS")) {
					Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
					Q_CAL =  ((P_AREIA/P_AREIA)*(P_CAL*670))/20;
					
						Tipo2 =   JUNTA*L_seis*((2*A_seis)+c_seis)*(1.07/((A_seis+1.5 )*(c_seis+1.5 )/10000 ))*AREA/1000000*1.05;  // TIJOLO 6 FUROS
						Q_AREIA = (float) Tipo2;
						
					Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
					Q_CAL =  ((Q_AREIA/P_AREIA)*(P_CAL*670))/20;
					
					Q_TIJOLO = (float) (1.07/( (A_seis+1.5 )* (c_seis+1.5 )/10000 )*AREA);
					

					TXA_RESP.append("A QUANTIDADE DE CIMENTO NECESSARIO É: "+Q_CIMENTO+" SACO DE 50 Kg \n");
					TXA_RESP.append("A QUANTIDADE DE AREIA NECESSARIO É: "+Q_AREIA+" M³\n");
					TXA_RESP.append("A QUANTIDADE DE CAL NECESSARIO É: "+Q_CAL+" SACO DE 20 Kg \n");
	
		   }	
//----------------------------------------------------------------------------------------------		
// EVENTO SE O TIJOLO FOR DE MACIÇO			
			if(CB_TIJOLO.getSelectedItem().equals("6 FUROS")) {
				Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
				Q_CAL =  ((P_AREIA/P_AREIA)*(P_CAL*670))/20;
				
					Tipo3 =   JUNTA*L_macico*((2*A_macico)+c_macico)*(1.07/((A_macico+1.5 )*(c_macico+1.5 )/10000 ))*AREA/1000000*1.05; // TIJOLO MACIÇO
					Q_AREIA = (float) Tipo3;
					
				Q_CIMENTO =  (Q_AREIA/P_AREIA)*1400/50; 
				Q_CAL =  ((Q_AREIA/P_AREIA)*(P_CAL*670))/20;
				
				Q_TIJOLO = (float) (1.07/( (A_macico+1.5 )* (c_macico+1.5 )/10000 )*AREA);
				
				TXA_RESP.append("A QUANTIDADE DE CIMENTO NECESSARIO É: "+Q_CIMENTO+" SACO DE 50 Kg \n");
				TXA_RESP.append("A QUANTIDADE DE AREIA NECESSARIO É: "+Q_AREIA+" M³\n");
				TXA_RESP.append("A QUANTIDADE DE CAL NECESSARIO É: "+Q_CAL+" SACO DE 20 Kg \n");

	}
}}}






