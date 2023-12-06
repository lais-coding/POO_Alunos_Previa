package control;


import java.time.LocalDate;
import java.util.List;

import javafx.beans.property.LongProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Aluno;



public class AlunoControl {

	
	InterfaceAlunoDAO dao = new InterfaceAlunoDAO();
	
	
	//Há conceitos do padrão de projeto Observer
	
	//Alterações são notificadas por qualquer lugar onde as propriedades podem ser observadas
	
	//LongProperty - Interface observável do tipo long (Permite visualizar a alteração nesse tipo de variável)
	private LongProperty idAluno = new SimpleLongProperty(0);
	

	//StringProperty - Interface observável do tipo String (Permite visualizar a alteração nesse tipo de variável)
	private StringProperty nomeAluno = new SimpleStringProperty("");
	private StringProperty rgAluno = new SimpleStringProperty("");
	private StringProperty emailAluno = new SimpleStringProperty("");
	private StringProperty foneAluno = new SimpleStringProperty("");
	
	//ObjectProperty<LocalDate> - Interface observável do tipo Data
	private ObjectProperty<LocalDate> dtNascimento = new SimpleObjectProperty<>(LocalDate.now());
	private ObjectProperty<LocalDate> dtEntrada = new SimpleObjectProperty<>(LocalDate.now());
	
	//ObservableList - Lista
	
	private ObservableList<Aluno> listaAlunos = FXCollections.observableArrayList();

	//Métodos
	
	
	public void cadastrarAluno() {
		Aluno aluno = new Aluno();
		aluno.setNomeAluno(nomeAluno.get());
		aluno.setRgAluno(rgAluno.get());
	   /* aluno.setDtNascimento(dtNascimento.get());
	    aluno.setDtEntrada(dtEntrada.get()); */
	    aluno.setEmailAluno(emailAluno.get());
	    aluno.setFoneAluno(foneAluno.get());
		
		//Salvar no banco através do DAO
		
		dao.salvar(aluno);
		
	}
	
	
	public void pesquisarAluno() throws Exception {
		List<Aluno> listaAlunos = dao.pesquisarAluno(nomeAluno.get());
		listaAlunos.clear();
		listaAlunos.addAll(listaAlunos);
		
	}
	
	
	
	
	
	
	public StringProperty nomeProperty() {
		return this.nomeAluno;
	}
	

	public StringProperty rgProperty() {
		return this.rgAluno;
	}
	
	public StringProperty emailProperty() {
		return this.emailAluno;
	}
	
	public StringProperty foneProperty() {
		return this.foneAluno;
	}

	
	public ObjectProperty<LocalDate> dtNascimentoProperty() {
		return this.dtNascimento;
	}
	

	public ObjectProperty<LocalDate> dtEntradaProperty() {
		return this.dtEntrada;
	}
	
	
	
	
	
	
}
