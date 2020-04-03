import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class SelectEmployeeSample {
	public static void main(String[] args) {
		EmployeeDAO empDAO = new EmployeeDAO();
		List<Employee> empList = empDAO.findAll();

		for (Employee emp : empList) {
			System.out.println("ID:" + emp.getId());
			System.out.println("名前:" + emp.getName());
			System.out.println("年齢:" + emp.getAge() + "\n");
		}
//		Connection conn = null;
//        String url = "jdbc:mysql://localhost:3306/example";
//        String user = "root";
//        String password = "";
//
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//            System.out.println("ドライバがありません" + e.getMessage());
//        }
//
//        try {
//			conn = DriverManager.getConnection(url, user, password);
//			String sql = "SELECT ID, NAME, AGE FROM EMPLOYEE";
//			PreparedStatement pStmt = conn.prepareStatement(sql);
//			ResultSet rs = pStmt.executeQuery();
//			while (rs.next()) {
//				String id = rs.getString("ID");
//				String name = rs.getString("NAME");
//				int age = rs.getInt("AGE");
//
//				System.out.println("ID:" + id);
//				System.out.println("名前:" + name);
//				System.out.println("年齢:" + age + "\n");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}
}
