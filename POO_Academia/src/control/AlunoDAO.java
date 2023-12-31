package control;

import java.util.List;

import model.Aluno;

public interface AlunoDAO {

	public void salvar(Aluno aluno);
	List<Aluno> listarAlunos() throws Exception;
	List<Aluno> pesquisarAluno(String nomeAluno) throws Exception;
	
}