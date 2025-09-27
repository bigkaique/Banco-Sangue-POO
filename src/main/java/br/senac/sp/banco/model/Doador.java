package br.senac.sp.banco.model;

import java.util.Calendar;

public class Doador {
	private int id;
	private String nome;
	private Genero genero;
	private String cpf;
	private TipoSanguineo tipoSanguineo;
	private String endereco;
	private double peso;
	private boolean tatuado;
	private double altura;
	private Calendar nascimento;
	private Calendar ultimaDoacao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}
	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isTatuado() {
		return tatuado;
	}
	public void setTatuado(boolean tatuado) {
		this.tatuado = tatuado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public Calendar getUltimaDoacao() {
		return ultimaDoacao;
	}
	public void setUltimaDoacao(Calendar ultimaDoacao) {
		this.ultimaDoacao = ultimaDoacao;
	}
	
	
}
