package control;


import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.Aluno;

public class AlunoBoundary extends Application {
	
	
	 public static void main(String[] args) {
		 	launch(args);
	    }

	 
	 
	 //Configurações da tela
	 
	 
	
	 //Stage - Parte onde se localizam os componentes gráficos
	 private Stage stage;
	 
 
	 //TableView = tabela
	    TableView<Aluno> tabelaAluno = new TableView<>();
	    
	    
	    //TextField - campo de texto para entrada / exibição de texto
	    private TextField txtNomeAluno = new TextField();
	    private TextField txtRgAluno = new TextField();
	    private TextField txtDtNascimento = new TextField();
	    private TextField txtDtEntrada = new TextField();
	    private TextField txtEmailAluno = new TextField();
	    private TextField txtFoneAluno = new TextField();
	    private TextField txtPlanoVigente = new TextField();
	    
	   
	    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    
	    AlunoControl controle = new AlunoControl();
	    //Execução
	 
	@Override
	public void start(Stage stage) throws Exception {
		
		
		
		
		Pane panel = new Pane();
		Scene scene = new Scene(panel);
		
		stage.setTitle("MANUTENÇÃO DE ALUNOS");
		stage.setScene(scene);
		
		
		
		Tab tabAlunos = new Tab("Alunos");
		GridPane gridAlunos = new GridPane();
		
		//Ajustar altura e largura
		
		gridAlunos.setHgap(10); //Espaçamento horizontal
		gridAlunos.setVgap(15); //Espaçamento vertical
		
		Button btnSalvar = new Button("Salvar");
		Button btnPesquisar = new Button("Pesquisar");
		

		
		//Sintaxe: O label que desejo adicionar, índice da coluna, índice da linha
		
		gridAlunos.add(new Label("Nome do Aluno: "), 0, 0);
		gridAlunos.add(txtNomeAluno, 1, 0);
		
		gridAlunos.add(new Label("RG do Aluno: "), 0, 1);
		gridAlunos.add(txtRgAluno, 1, 1);
		
		gridAlunos.add(new Label("Data de nascimento: "), 0, 2);
		gridAlunos.add(txtDtNascimento, 1, 2);
		
		gridAlunos.add(new Label("Data de entrada: "), 0, 3);
		gridAlunos.add(txtDtEntrada, 1, 3);
		
		gridAlunos.add(new Label("E-mail: "), 0, 4);
		gridAlunos.add(txtEmailAluno, 1, 4);
		
		gridAlunos.add(new Label("Telefone: "), 0, 5);
		gridAlunos.add(txtFoneAluno, 1, 5);
		
		gridAlunos.add(new Label("Plano vigente: "), 0, 6);
		gridAlunos.add(txtPlanoVigente, 1, 6);

		
		gridAlunos.add(btnPesquisar, 5, 5);
		gridAlunos.add(btnSalvar, 6, 5);
		
		//Evento do botão Salvar
		btnSalvar.setOnAction(e -> controle.cadastrarAluno());
		btnPesquisar.setOnAction(e -> {
			try {
				controle.pesquisarAluno();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		
		
		bindingAlunos();
		
		
		
		panel.getChildren().add(gridAlunos);
		stage.show();
	}


	
	//Método onde faz a ligação entre os componentes da interface gráfica com o Control
		public void bindingAlunos() {
			
			Bindings.bindBidirectional(txtNomeAluno.textProperty(), controle.nomeProperty());
			Bindings.bindBidirectional(txtRgAluno.textProperty(), controle.rgProperty());
			Bindings.bindBidirectional(txtEmailAluno.textProperty(), controle.emailProperty());
			Bindings.bindBidirectional(txtFoneAluno.textProperty(), controle.foneProperty());

			
			//Aviso: Dificuldade em colocar data e plano
			
			
		}
	
	
	
    
}
