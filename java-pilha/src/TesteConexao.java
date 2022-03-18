
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão");
		}
		
		//---------------------------------------------------
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//			con.close();//con.fecha();
//		} catch(IllegalStateException e) {
//			System.out.println("Deu erro na conexão");
//			con.close();//con.fecha();
//		} finally {
//			System.out.println("finally");
//			if (con != null) {
//				con.close();//con.fecha();
//			}
//		}
	}

}
