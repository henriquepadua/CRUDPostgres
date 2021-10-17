public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Casa casa = new Casa(11, "varias", "tres","3");
		if(dao.inserirUsuario(casa) == true){
			System.out.println("Inserção com sucesso -> " + casa.toString());
		}
		

		//Atualizar casa
		casa.setCamas("novas camas");
		dao.atualizarCasa(casa);
		casa.setQuartos("novos Quartos");
		dao.atualizarCasa(casa);
		casa.setBanheiros("novos Banheiros");
		dao.atualizarCasa(casa);
		casa.setObjectos("nova Objectos");
		dao.atualizarCasa(casa);

		
		//Excluir casa
		dao.excluirCasa(casa.getObjectos());
		
		//Mostrar casa
		casa = dao.getCasa();
		System.out.println("==== Mostrar casa === ");		
		for(int i = 0; i < casa.length; i++) {
			System.out.println(casa[i].toString());
		}
		
		dao.close();
	}
}