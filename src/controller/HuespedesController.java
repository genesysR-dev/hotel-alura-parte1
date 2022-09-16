package controller;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.HospedeDAO;
import modelo.Hospede;
import principal.ConnectionFactory;



public class HuespedesController {
	 private HospedeDAO hospedeDAO;
	 
	 public HuespedesController() throws SQLException {
		 	ConnectionFactory con = new ConnectionFactory();
			Connection connection = con.estabeleConexao();
			this.hospedeDAO = new HospedeDAO(connection);
		}
	 
		public void guardar(Hospede hospedes) throws SQLException {
			this.hospedeDAO.salvarHospede(hospedes);
		}

}
