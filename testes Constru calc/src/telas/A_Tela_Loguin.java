package telas;
//TESTE
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import telas.B_Tela_Principal;

public class A_Tela_Loguin extends JFrame implements ActionListener{
	JFrame frame = new JFrame();//declaração dos componentes
	JPanel P_Titulo,P_Campos,P_Botoes;    // conteines
	JLabel Loguin,Usuario,Senha;      // palavras
	JButton Logar, Cancelar, Sair;    //Botoes
	JTextField Campo_Usuario, Campo_Senha ;
	JPasswordField CampoSenha;
	
	//construtor
//#####################################	
	public A_Tela_Loguin() {
		
		frame.setTitle("Loguin");
		frame.setSize(400,300);
		setResizable(false);  // fixa o redicionamento da janela
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		
		Loguin = new JLabel("     CalcuLAR    ");
		                    
		Usuario = new JLabel("      Usuario          ");
		Campo_Usuario = new JTextField(25);
		
		Senha = new JLabel("        Senha          ");
//		Campo_Senha = new JTextField(25);
		CampoSenha = new JPasswordField(25);
		
//############################################################		
		P_Titulo = new JPanel();
		FlowLayout flow = new FlowLayout();
		P_Titulo.setLayout(flow);//Mudando gerenciador de layout
		
		//Alterando a fonte do texto.
				Font f = new Font("Digital Desolation Plus", 1, 40);
				Loguin.setFont(f);
				P_Titulo.add(Loguin);
	
//##############################################################		
		
		P_Campos = new JPanel();
//				
		P_Campos.add(Usuario);
		P_Campos.add(Campo_Usuario);
		
		P_Campos.add(Senha);
		//P_Campos.add(Campo_Senha);
		P_Campos.add(CampoSenha);
//##############################################################		
		Font f2 = new Font("Digital Desolation Plus", 1, 20);
		Usuario.setFont(f2);
		Senha.setFont(f2);
	
//##############################################################		
		P_Botoes = new JPanel();
		P_Botoes.setBorder(new TitledBorder("Painel botao"));
				
				Logar    = new JButton("Logar");  // CRIA O BOTÃO
				Cancelar = new JButton("Cancelar");  // CRIA O BOTÃO
			 	Sair     = new JButton("Sair");  // CRIA O BOTÃO
		
     	P_Botoes.add(Logar);                  // ADICIONA
       	Logar.setBounds(450, 300, 100, 40);// DEFINE POSIÇAO E TAMANHO
	    Logar.addActionListener(this);
      	
       	P_Botoes.add(Sair);                  // ADICIONA
       	Sair.setBounds(450, 300, 100, 40);// DEFINE POSIÇAO E TAMANHO
        Sair.addActionListener(this);
       	
       	
		//adicionando os paineis ao frame
		frame.add(P_Titulo,BorderLayout.NORTH);
		frame.add(P_Campos,BorderLayout.CENTER);
		frame.add(P_Botoes,BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		A_Tela_Loguin T_I = new A_Tela_Loguin();
	}
	
	public void actionPerformed(ActionEvent e) { //eventos dos botoes
		
		if(e.getSource()==Logar){
			
			if((Campo_Usuario.getText().equals("")) && (CampoSenha.getText().equals(""))){
				B_Tela_Principal T_C = new B_Tela_Principal();
			
				frame.dispose();
				
			}
			
			else{
				JOptionPane.showMessageDialog(null, "Login e/ou Senha Incorretos","Tente Novamente",1);
			    	
			    }
		}
	
	
		if(e.getSource()==Sair)
			System.exit(0);
	
	}
	}
//http://www.mapadaobra.com.br/negocios/saiba-como-fazer-o-calculo-de-material-de-construcao/
//https://prezi.com/t-xgdhhfnr2i/calculo-de-cimento-reboco-chapisco/