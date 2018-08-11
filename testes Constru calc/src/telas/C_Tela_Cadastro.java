package telas;
//TESTE
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class C_Tela_Cadastro extends JFrame implements ActionListener{
	
	 JPanel PanelSul, panelNOrte, PanelCentro   ;
	 JButton salvar, editar, Novo, Sair_cadastro;
//########################################################	
	 	JLabel nome;             JTextField campoNome;
		JLabel rg;               JTextField campoRG;
		JLabel cpf;              JTextField campoCPF;
		JLabel nascimento;       JTextField campoNascimento;
		JLabel telefone;         JTextField campoTelefone;
		JLabel email;            JTextField campoEmail;
		JLabel endereco;         JTextField campoEndereco;
		JLabel numero;           JTextField campoNumero;
		JLabel bairro;           JTextField campoBairro;
		JLabel complemento;      JTextField campoComplemento;
		JLabel cidade;           JTextField campoCidade;
		JLabel estado;           JTextField campoEstado;
		JLabel cep;              JTextField campoCep;
	
	public static void main(String[] args) {// metodo MAIN
		C_Tela_Cadastro t_Inicial = new C_Tela_Cadastro();

	}

	public void actionPerformed(ActionEvent e) { //eventos dos botoes
// salva os usuarios		
		if(e.getSource()==salvar) {
//					
// ARMAZENA OS USUARIO
		G_Usuario u = new G_Usuario();
		for(int i=0; i< F_Dados.vetUsuario.length;i++) {
			if (F_Dados.vetUsuario[i]==null) {
				F_Dados.vetUsuario[i] = u;
				
				campoNome.setText("");
				campoRG.setText("");
				campoCPF.setText("");
				campoNascimento.setText("");
				campoTelefone.setText("");
				campoEmail.setText("");
				campoEndereco.setText("");
				campoNumero.setText("");
				campoBairro.setText("");
				campoComplemento.setText("");
				campoCidade.setText("");
				campoEstado.setText("");
				campoCep.setText("");
				
				JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso ", "Msn", 1);
		if (i ==F_Dados.vetUsuario.length-1)
				JOptionPane.showMessageDialog(null, "Limite Excedido ");
				
			break;
			}
		}
	}
		
//#############################################################################################		
			if(e.getSource()==editar)
				try {
					java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.youtube.com/playlist?list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw"));
				} catch (IOException | URISyntaxException e1) {
					
					e1.printStackTrace();
				}
//#########################################################################################			
			if(e.getSource()==Sair_cadastro){
					B_Tela_Principal T_C = new B_Tela_Principal();
					this.dispose();		
				}
}
	
// COMEÇA O CONSTRUTOR
	public C_Tela_Cadastro() {
	//CONFIGURAÇÃO DA JANELA TITULO TAMANHO
//##########################################################################################	
		       setLayout(new BorderLayout());   // DEFINI  LAYOUT BorderLayout
		   
			   setTitle("Loguin");
		       setSize(700, 500);  //      (largura x Altura)   
		       setResizable(false);  // fixa o redicionamento da janela
		       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // fecha quando aperta o X sair

//######################################################################################		       
		    //dados pessoais
		       nome = new JLabel("      Nome Completo:  ");
				campoNome = new JTextField(50);
				
				rg = new JLabel("                              RG:  ");
				campoRG = new JTextField(22);
				
				cpf = new JLabel("       CPF:  ");
				campoCPF = new JTextField(22);
				
				nascimento = new JLabel("Data de nascimento:");
				campoNascimento = new JTextField(22);
				
				telefone = new JLabel("Telefone:");
				campoTelefone = new JTextField(22);
				
				email = new JLabel("                        E-mail:  ");
				campoEmail = new JTextField(50);
				
//#################################################################################	
			//dados complementares
				endereco = new JLabel("                  Endereço:  ");
				campoEndereco = new JTextField(50);
				
				numero = new JLabel("                               Nº:  ");
				campoNumero = new JTextField(10);
				
				bairro = new JLabel("                  Bairro:  ");
				campoBairro = new JTextField(30);
				
				complemento = new JLabel("         Complemento:  ");
				campoComplemento = new JTextField(30);
				
				cep = new JLabel("    Cep:  ");
				campoCep = new JTextField(15);
				
				cidade = new JLabel("                       Cidade:  ");
				campoCidade = new JTextField(22);
				
				estado = new JLabel("  Estado:  ");
				campoEstado = new JTextField(22);
				
		       
		       //ADICIONA O COMPONENTES NA JANELA
//##########################################################################################		
				panelNOrte = new JPanel();
				panelNOrte.setLayout(new FlowLayout());
				
				JLabel tilulo = new JLabel("CADASTRO DE CLIENTE");
				panelNOrte.add(tilulo);
								
				this.add(panelNOrte,BorderLayout.NORTH);

//############################################################################################						
				
				PanelCentro = new JPanel();
				PanelCentro.setBorder(new TitledBorder("Painel centro"));

				BoxLayout box = new BoxLayout(PanelCentro, BoxLayout.X_AXIS);
				
				PanelCentro.add(nome);          PanelCentro.add(campoNome);
				PanelCentro.add(rg); 			PanelCentro.add(campoRG);
				PanelCentro.add(cpf);        	PanelCentro.add(campoCPF); 
				PanelCentro.add(nascimento);  	PanelCentro.add(campoNascimento);
				PanelCentro.add(telefone);      PanelCentro.add(campoTelefone);
				PanelCentro.add(email); 		PanelCentro.add(campoEmail);
				PanelCentro.add(endereco);      PanelCentro.add(campoEndereco);
				PanelCentro.add(numero);        PanelCentro.add(campoNumero);
				PanelCentro.add(bairro);        PanelCentro.add(campoBairro);
				PanelCentro.add(complemento);   PanelCentro.add(campoComplemento);
				PanelCentro.add(cep);           PanelCentro.add(campoCep);
				PanelCentro.add(cidade);        PanelCentro.add(campoCidade);
				PanelCentro.add(estado);        PanelCentro.add(campoEstado);

				this.add(PanelCentro,BorderLayout.CENTER);		
//###########################################################################################		
				PanelSul = new JPanel();
				PanelSul.setBorder(new TitledBorder("Painel sul"));
				PanelSul.setLayout(new FlowLayout());
				
					salvar  = new JButton("salvar");  // CRIA O BOTÃƒO
					editar = new JButton("editar");  // CRIA O BOTÃƒO
			     	Novo = new JButton("Novo");  // CRIA O BOTÃƒO
			     	Sair_cadastro = new JButton("Sair cadastro");  // CRIA O BOTÃƒO
		     	
		     //CONFIGURAÇÃO DO BOTÃO
//###########################################################################################		
		     	PanelSul.add(salvar);                  // ADICIONA
			     	salvar.setBounds(50, 300, 100, 40);// DEFINE POSIÃ‡AO E TAMANHO
			     	salvar.addActionListener(this);  // AÇÃO DO BOTÃO QUE VAI SER TRATADO ATRAVES DA PROPRIA CLASS
		     	
			    PanelSul.add(editar);                  // ADICIONA
			     	editar.setBounds(250, 300, 100, 40);// DEFINE POSIÃ‡AO E TAMANHO
			        editar.addActionListener(this);
		     		
			    PanelSul.add(Sair_cadastro);                  // ADICIONA
			       	Sair_cadastro.setBounds(450, 300, 100, 40);// DEFINE POSIÃ‡AO E TAMANHO
			       	Sair_cadastro.addActionListener(this);
		       		
		       	this.add(PanelSul,BorderLayout.SOUTH);	
		       	
		       	setVisible(true);            // visibilidade da janela
				setLocationRelativeTo(null); // faz fica centralizada quando aparecer A PRIMEIRA VEZ
		   	  
	

	}// fim public Tela_inicio() 
				

	
}//  fim public class Tela_Cadastro extends JFrame implements ActionListener	
	
//https://www.youtube.com/watch?v=S-ld-KxGbbM&index=43&list=PLtchvIBq_CRTAwq_xmHdITro_5vbyOvVw		
