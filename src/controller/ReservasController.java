package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import modelo.Reserva;
import principal.ConnectionFactory;
import dao.ReservaDAO;

public class ReservasController {
 private ReservaDAO reservaDAO;
 
 public ReservasController() throws SQLException {
	 	ConnectionFactory con = new ConnectionFactory();
		Connection connection = con.estabeleConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}
 
	public void salvar(Reserva reserva) throws SQLException {
		this.reservaDAO.salvarReserva(reserva);
	}			
}
