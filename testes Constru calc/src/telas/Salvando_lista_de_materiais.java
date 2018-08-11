package telas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Salvando_lista_de_materiais {

	String nome;
	String cpf;
	String rg;
	String fone;
// NOME
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
// CPF	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
// RG
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
// FONE
		public String getFone() {
			return fone;
		}
		
		public void setFone(String fone) {
			this.fone = fone;
		}
		
		public String salvar() {
			
			try {
				FileWriter fw =new FileWriter("Cadastro.txt");
				PrintWriter pw = new PrintWriter(fw);
				pw.println("Nome: "+this.nome);
				pw.println("CPf: "+this.cpf);
				pw.println("RG: "+this.rg);
				pw.println("Telefone: "+this.fone);
				pw.flush();
				pw.close();
				fw.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			return null;
		}
		
	
}
