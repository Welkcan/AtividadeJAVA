package model;

public class pessoa {
	private String nome;
	private String end;
	private String bairro;
	private long cep;
	private String cidade;
	private String estado;
	
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	
	public void setEnd (String end) {
		this.end = end;
	}
	
	public String getEnd() {
		return end;
	}
	
	
	
	public void setBairro (String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	
	
	public void setCidade (String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	
	public void setEstado (String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setCep (long cep) {
		this.cep = cep;
	}
	
	public long getCep() {
		return cep;
	}
	
	

}
