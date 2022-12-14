package br.senai.sp.jandira.model;

public class Medico {


	private String nome;
	private Especialidade[] especialidade;
	private String telefone;
	private String email;
	private String crm;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade[] getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCRM() {
		return crm;
	}

	public void setCRM(String crm) {
		this.crm = crm;
	}

}
