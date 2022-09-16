package principal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;

import dao.HospedeDAO;
import dao.ReservaDAO;

public class TesteConnection {

	public static void main(String[] args) throws SQLException {
		
		//Hospede hos = new Hospede("Mafer", "Santos", Date.valueOf("2001-11-23") , "Brasil", "123456789");
		//Reserva res = new Reserva(Date.valueOf("2022-10-02"), Date.valueOf("2022-10-11"), 85, "Credito");
		
		ConnectionFactory con = new ConnectionFactory();
		Connection connection = con.estabeleConexao();
		
//		HospedeDAO hospedeDao = new HospedeDAO(connection);
		//System.out.println(hospedeDao.listarHospedePorNome("Brenda"));
		
		ReservaDAO reservaDao = new ReservaDAO(connection);
		//reservaDao.salvarReserva(res);
		System.out.println(reservaDao.listarReservas());
		
		//System.out.println(hos.toString());
		//System.out.println(res.toString());
		
		connection.close();
		System.out.println("Fechando connection");
	}
}
