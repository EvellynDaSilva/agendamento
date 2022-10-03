package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
    
        private  static int contador =99; 
        private  Integer codigo;
	private String nome;
	private String descricao;
	
	//Contrutores de classe
	
		public Especialidade(String nome) {
			this.nome = nome;
                        this.contador++;
                        this.codigo = contador;
		}
		
		public Especialidade(String nome, String descricao) {
			this.nome = nome;
			this.descricao = descricao;
                        this.contador++;
			
		}
		public Especialidade( ) {
                    this.contador++;
                    this.codigo = contador;
			
		}
                // Métodos de acesso aos atribudos
                
                public int getContador(){
                    return contador;
                }
                
                public
		//public Espacialidade() {//Consrtutor Default / Padão
		//}
	
	//Métodos de acesso aos atributos
        public int getContador
                        
	public void setNome(String nome) {
		
		if (nome.length()>= 3) {
		this.nome = nome;
		}else {
			JOptionPane.showMessageDialog(null,  nome + " Não é uma nome válido/n deve ter pelo menos 3 LETRAS!!");
		}
	}
	
	public String getNome() {
		return nome;
	}
		
	//Métodos de acesso aos atributos
	public void setDescricao(String descricao) {
		 if(descricao.length()>= 10) {
			 this.descricao = descricao;
		 }else {
			 JOptionPane.showMessageDialog(null, descricao +  " A descricao deve conter pelo menos 10 LETRAS!");
		 }
	}
	 public String getDescricao() {
		 return descricao;
	 }

}
