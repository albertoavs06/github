package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.List;


import model.Contato;


public class JDBCContatoDAO implements ContatoDAO{

	Connection conexao;
	
	public JDBCContatoDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	@Override
	public void inserir(Contato contato) {
		String comando = "insert into Contato(nome, telefone, celular, dataNascimento, endereco, cidade, estado) " +
				"values (?,?,?,?,?,?,?)";
		
		PreparedStatement p;
		try {

			p= this.conexao.prepareStatement(comando);
			p.setString(1,contato.getNome());
			p.setString(2,contato.getTelefone());
			p.setString(3,contato.getCelular());
			p.setString(4,contato.getDataNascimento());
			p.setString(5,contato.getEndereco());
			p.setString(6,contato.getCidade());
			p.setString(7,contato.getEstado());

		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	
	@Override
	public List<Contato> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
