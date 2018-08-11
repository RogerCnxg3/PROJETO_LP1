package telas;
//TESTE
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import telas.C_Tela_Cadastro;
import telas.D_Tela_Calculo_tijolo;

public class B_Tela_Principal extends JFrame implements ActionListener{
	JPanel PanelNorte,  PanelCentro , P_Botoes  ;
	JMenuBar barra = new JMenuBar(); //BARRA DE MENU DA JANELA
	
	// MENU USUARIO
//PRIMEIRO MENU
	JMenu M_Usuario = new JMenu("Usuario");
		JMenuItem MI_Cadastro = new JMenuItem("Cadastro");
		JMenuItem MI_Pesquisa = new JMenuItem("Pesquisa");
	
	
	//MENU CONFIGURAÇÃO
	JMenu M_Material = new JMenu("Material");
	JMenuItem MI_Tijolo = new JMenuItem("Calculo Tijolo");
	JMenuItem MI_Cimento = new JMenuItem("Calculo Cimento");
		
	//MENU SISTEMA
	JMenu MenuSistema = new JMenu("Sistema");
	JMenuItem MenuItemSair = new JMenuItem("Sair");

	JLabel constru_calc ;
	JLabel IMAGEM = new JLabel(new ImageIcon("src//imagem//CALCULAR 200X200.png"));
	JLabel DESCRIÇÃO = new JLabel("Este programa e para auxiliar pessoas que não tem muito conhecimento em construçao,");
	JLabel DESCRIÇÃO2 = new JLabel(" pois ajudara a basear alguns materiais");
	
	JLabel CIMENTO = new JLabel(new ImageIcon("src//imagem//cimento2.png"));
	JLabel AREIA = new JLabel(new ImageIcon("src//imagem//Areia.png"));
	JLabel CAL = new JLabel(new ImageIcon("src//imagem//CAL.png"));
	
	
	JButton Escola;
	
	public B_Tela_Principal(){
		PanelCentro = new JPanel();
		FlowLayout flow = new FlowLayout();
		PanelCentro.setLayout(flow);//Mudando gerenciador de layout
		
		PanelCentro.add(IMAGEM);
		PanelCentro.add(DESCRIÇÃO);
		PanelCentro.add(DESCRIÇÃO2);
		
		PanelCentro.add(CIMENTO);
//		PanelCentro.add(AREIA);
//		PanelCentro.add(CAL);

//##############################################################		
		P_Botoes = new JPanel();
		P_Botoes.setBorder(new TitledBorder("Painel botao"));
				
				JButton Escola    = new JButton("www.escolaengenharia.com.br");  // CRIA O BOTÃƒO
				JButton Cancelar = new JButton("Cancelar");  // CRIA O BOTÃƒO
				JButton Sair     = new JButton("Sair");  // CRIA O BOTÃƒO
		
     	P_Botoes.add(Escola);                  // ADICIONA
       	Escola.setBounds(450, 300, 100, 40);// DEFINE POSIÃ‡AO E TAMANHO
	    Escola.addActionListener(this);
      	
       	P_Botoes.add(Sair);                  // ADICIONA
       	Sair.setBounds(450, 300, 100, 40);// DEFINE POSIÃ‡AO E TAMANHO
        Sair.addActionListener(this);
       	
       	
		//adicionando os paineis ao frame

		this.add(PanelCentro,BorderLayout.CENTER);
		this.add(P_Botoes,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		
		
//###################################		
		this.add(barra,BorderLayout.PAGE_START);

//MENU USUARIO
		barra.add(M_Usuario);
//ADD OS SUBS MENUS DO MENU USUARIO
		M_Usuario.add(MI_Cadastro); 
			MI_Cadastro.addActionListener(this);//abre a tela cadastro
		
		M_Usuario.add(MI_Pesquisa);
			MI_Pesquisa.addActionListener(this);//ABRE A TELA DE PASQUISA
		
		
//MENU Material
		barra.add(M_Material);
		
		M_Material.add(MI_Tijolo);
			MI_Tijolo.addActionListener(this);
		
		M_Material.add(MI_Cimento);
			MI_Cimento.addActionListener(this);
		
//MENU SISTEMA
		barra.add(MenuSistema);
		MenuSistema.add(MenuItemSair);
		
		// CONFIGURAÇÃO TELA
		
 
		this.setTitle("Janela Principal");
		this.setBounds(0,0, 700, 500);  
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==MI_Cadastro){
			setCadastroUsuario(new C_Tela_Cadastro());
			this.dispose();
		}
		
		if(e.getSource()==MI_Pesquisa){
//			setI_PesquisaUsuario  (new I_PesquisaUsuario());
			this.dispose();
		}
		
//#####################################################################		
		
		if(e.getSource()==MI_Tijolo){
			setTelaTijolo(new D_Tela_Calculo_tijolo());
			this.dispose();
			}
		
		if(e.getSource()==MI_Cimento){
			setTelaCIMENTO(new E_Tela_Calculo_Cimento());
			this.dispose();
			}
	
		if(e.getSource()==Escola){
			try {
				java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.escolaengenharia.com.br/calculo-da-quantidade-de-tijolos/" ) );
			} catch (IOException | URISyntaxException e1) {
				
				e1.printStackTrace();
			}
			this.dispose();
			}
	}
	
	
	//http://www.mapadaobra.com.br/negocios/saiba-como-fazer-o-calculo-de-material-de-construcao/

//	private void setI_PesquisaUsuario(I_PesquisaUsuario i_PesquisaUsuario) {
//		return;
//		
//	}
	
	private void setTelaTijolo(D_Tela_Calculo_tijolo d_Tela_Calculo_tijolo) {
		return;
		
	}
	
	private void setTelaCIMENTO(E_Tela_Calculo_Cimento e_Tela_Calculo_Cimento) {
		return;
		
	}

	public void setCadastroUsuario(C_Tela_Cadastro tela_Cadastro) {
		return;
		
	}

	
	
}
