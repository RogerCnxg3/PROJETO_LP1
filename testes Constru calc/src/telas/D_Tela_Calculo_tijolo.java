package telas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class D_Tela_Calculo_tijolo implements ActionListener{
	
//DECLARA«√O DOS COMPONETES 
	JFrame frame = new JFrame("Calculo TIJOLO_2");
	JPanel P_NORTE = new JPanel();
		JPanel P_Titulo = new JPanel();
			JLabel TITULO = new JLabel("GASTO DE TIJOLOS PARA PAREDES:");
		
		JPanel P_Medidas = new JPanel();
				JLabel ALT_PAREDE = new JLabel("ALTURA:");       JTextField C_ALT_PAREDE = new JTextField(20);
				JLabel COMP_PAREDE = new JLabel("COMPRIMENTO:"); JTextField C_COMP_PAREDE = new JTextField(20);
		
		
	JPanel P_CENTRO = new JPanel();
		JPanel P_TIPO_TIJOLO = new JPanel();
		    JLabel Tipo_Tijolo = new JLabel("Tipo de Tijolo");
				JRadioButton OITO_FUROS = new JRadioButton("   8 FUROS      ");
				JRadioButton SEIS_FUROS = new JRadioButton("   6 FUROS      ");
				JRadioButton MACICO = new JRadioButton("   MACI«O      ");
				ButtonGroup GrupoRadio = new ButtonGroup();
		
		JPanel P_TEXTAREA = new JPanel();
				JTextArea TXA_RESP = new JTextArea(5, 40);
				
	
	JPanel P_BOTAO = new JPanel();
	
		JButton BT_CALCULAR = new JButton("  CALCULAR  ");
		JButton BT_NOVO = new JButton    ("NOVO CALCULO");
		JButton BT_SAIR = new JButton    ("    SAIR    ");
		
//----------------------------------------------------------------------------------------------	
//CONSTRUTOR
	public D_Tela_Calculo_tijolo() {
		
		frame.setLayout(new BorderLayout());
		P_NORTE.setBorder(new TitledBorder("P_NORTE"));
			P_Titulo.setBorder(new TitledBorder("P_TILULO"));
			P_Medidas.setBorder(new TitledBorder("P_MEDIDAS"));
		
		P_CENTRO.setBorder(new TitledBorder("P_CENTRO"));
			P_TIPO_TIJOLO.setBorder(new TitledBorder("P_TIPO DE TIJOLO"));
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
			P_CENTRO.add(P_TIPO_TIJOLO,BorderLayout.WEST);
				GridLayout grid = new GridLayout(4, 1);
				P_TIPO_TIJOLO.setLayout(grid);
				
				P_TIPO_TIJOLO.add(Tipo_Tijolo);  
				P_TIPO_TIJOLO.add(OITO_FUROS);     
				P_TIPO_TIJOLO.add(SEIS_FUROS);
				P_TIPO_TIJOLO.add(MACICO);    
				
				//Adicionando bot√µes de radio ao grupo
				GrupoRadio.add(OITO_FUROS);
				GrupoRadio.add(SEIS_FUROS);
				GrupoRadio.add(MACICO);
				
				  
//				TITULO.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 30));
				
				Tipo_Tijolo.setFont(new java.awt.Font("Arial Black", 1, 20));
	    		  OITO_FUROS.setFont(new java.awt.Font("Arial Black", 1, 15));
	    	      SEIS_FUROS.setFont(new java.awt.Font("Arial Black", 1, 15));
	    	          MACICO.setFont(new java.awt.Font("Arial Black", 1, 15));
				
			
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
	
	public static void main(String[] args) {
		D_Tela_Calculo_tijolo comp = new D_Tela_Calculo_tijolo();
	}

//####################################################################################
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==BT_SAIR)
			frame.dispose();//destroi a janela
		
		if(evento.getSource()==BT_NOVO) {
			C_ALT_PAREDE.setText("");
			C_COMP_PAREDE.setText("");
			TXA_RESP.setText("");
				
//			TestaLayouts novaJanela = new TestaLayouts();
//			frame.dispose();//destroi a janela
//			novaJanela.dialog.setModal(true);//define a janela dialog como modal
//			novaJanela.dialog.setVisible(true);//torna a janela vis√≠vel
		}

		
		
//#####################################################################################
		
		
// Calcula os tijolos		
		if(evento.getSource()==BT_CALCULAR) {		
			double L_parede= Double.parseDouble(C_COMP_PAREDE.getText()),
					A_parede=  Double.parseDouble(C_ALT_PAREDE.getText());
			
			float Tipo1, Tipo2, Tipo3;
			
				Tipo1 = (float) (0.19*0.19); // tijolo 8 furos
				Tipo2 = (float) (0.14*0.24); // tijolo 6 furos
				Tipo3 = (float) (0.09*0.19); // tijolo maciÁo			
	
			if(OITO_FUROS.isSelected()==true) {
				int quant_tijolo = (int) ((L_parede * A_parede)/Tipo1);
				TXA_RESP.setText("A QUANTIDADE DE TIJOLO 8 FUROS NECESSARIO …: "+(String.valueOf( quant_tijolo))+"\n");
				
			
			}	
				if(SEIS_FUROS.isSelected()) {
				int quant_tijolo = (int) ((L_parede * A_parede)/Tipo2);
				TXA_RESP.append("A QUANTIDADE DE TIJOLO 6 FUROS NECESSARIO …: "+quant_tijolo+"\n");
			}
			
			if(MACICO.isSelected()) {
				int quant_tijolo = (int) ((L_parede * A_parede)/Tipo3);
				TXA_RESP.append("A QUANTIDADE DE TIJOLO MACI«O NECESSARIO …: "+quant_tijolo+"\n");
			}
			
			
			
	}//fim dos calculos dos tijolos
	
	
	
	}}





