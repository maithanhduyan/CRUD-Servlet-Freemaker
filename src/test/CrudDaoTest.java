package test;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.crudservletfreemaker.dao.CrudDao;
import com.crudservletfreemaker.model.User;
import com.crudservletfreemaker.util.DBUtility;

class CrudDaoTest {

	@Test
	void testAddUser() {
		User user = new User();
		user.setFirstName("Anmts" + System.currentTimeMillis());
		user.setLastName("Last name " + System.nanoTime());
		user.setEmail("Email" + System.nanoTime());
		
		CrudDao crudDao = new CrudDao();
		crudDao.addUser(user);
		
	}
	
	@Test
	void testConnection() {
		try {
			// TODO Test JDBC Connection
			String connectionString = DBUtility.getConnection().getSchema().toString();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
