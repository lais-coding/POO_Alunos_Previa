package model;

import java.sql.Date;
import java.time.LocalDate;

public class Aluno {


	
	private int idAluno;
	private String nomeAluno;
	private String rgAluno;
	private Date dtNascAluno;
	private Date dtEntrada;
	private String emailAluno;
	private String foneAluno;
	private Plano planoContratado;
	

	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getRgAluno() {
		return rgAluno;
	}
	public void setRgAluno(String rgAluno) {
		this.rgAluno = rgAluno;
	}
	public Date getdtNascAluno() {
		return dtNascAluno;
	}
	public void setDtNascimento(Date localDate) {
		this.dtNascAluno = localDate;
	}
	public Date getDtEntrada() {
		return dtEntrada;
	}
	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	public String getEmailAluno() {
		return emailAluno;
	}
	public void setEmailAluno(String emailAluno) {
		this.emailAluno = emailAluno;
	}
	public String getFoneAluno() {
		return foneAluno;
	}
	public void setFoneAluno(String foneAluno) {
		this.foneAluno = foneAluno;
	}
	public Plano getPlanoContratado() {
		return planoContratado;
	}
	public void setPlanoContratado(Plano planoContratado) {
		this.planoContratado = planoContratado;
	}
	
	
	
	
	
}
