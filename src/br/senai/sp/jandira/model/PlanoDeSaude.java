package br.senai.sp.jandira.model;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class PlanoDeSaude {

	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	
	//Métodos de acesso aos atributos
	public void setOperadora(String operadora) {
		
			this.operadora = operadora;
	} {
			JOptionPane.showMessageDialog(null, "operadora");
			}
	
		public String getOperadora() {
			return operadora;
		}
	
}
