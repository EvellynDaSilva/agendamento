package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descricao;
	
	//Métodos de acesso aos atributos
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
			 JOptionPane.showMessageDialog(null,  " A descricao deve conter pelo menos 10 LETRAS!");
		 }
	}
	 public String getDescricao() {
		 return descricao;
	 }

}
