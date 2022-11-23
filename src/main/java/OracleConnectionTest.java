import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnectionTest {
	public static void main(String[] args) {
		Connection conn = null;
		String url = "r2dbc:oracle:thin:@10.203.7.43:1538:DEVSFCDB"; //localhost대신 ip주소가 들어갈수도
		String id = "DEVSSGWC";
		String pw = "devssgwc2111!";
		try {
			// 3. JDBC 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 4. 접속
			// - Connection 객체 생성 + 접속 작업.
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println(conn.isClosed()?"접속종료":"접속중");// 접속중(false), 접속종료(true)

			// 5. SQL

			// 6. 접속종료
			conn.close();
			System.out.println(conn.isClosed()?"접속종료":"접속중");// 접속중(false), 접속종료(true)

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
