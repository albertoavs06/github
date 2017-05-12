package dao;

import java.util.List;

import model.Contato;

public interface ContatoDAO {
	public void inserir(Contato contato);
	public List<Contato> listarTodos(); 
}
