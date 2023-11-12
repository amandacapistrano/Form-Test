package TESTE;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.DadosForm;


public class TestDadosForm {
	private DadosForm teste1 = null;
	
	public TestDadosForm() {
		listar();
		System.out.println("\n======================\n");
		insert();
		System.out.println("\n======================\n");
		teste1.setIdUser("1");
		/*teste1.delete();*/
		System.out.println("\n======================\n");
		listar();
	}
	
	
	private void listar() {
		this.teste1 = new DadosForm();
		ResultSet rs = teste1.listAll();
		try {
			while ( rs.next() ) {
				String out = "";
				out +=  "\t" +rs.getString("idUser");
				out +=  "\t" +rs.getString("nome");
				out +=  "\t" +rs.getString("email");
				out +=  "\t" +rs.getString("celular");
				out +=  "\t" +rs.getString("genero");
				out +=  "\t" +rs.getString("nascimento");
				out +=  "\t" +rs.getString("pais");
				out +=  "\t" +rs.getString("peso");
				out +=  "\t" +rs.getString("altura");
				out +=  "\t" +rs.getString("imc");
				out +=  "\t" +rs.getString("situacao");
				System.out.println(out);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void insert() {
		this.teste1 = new DadosForm("nome", "email@email.com", "123456987", "01-02-1999" ,"femini", "Brasil", "peso", "altura", "imc", "status");
		this.teste1.save();
	}
	
	public static void main(String[] args) {
		new TestDadosForm();
	}

}
