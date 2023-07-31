package ex21jdbc.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQuery {
		
		//멤버변수
		Connection con;
		Statement stmt;
	//생성자
	public InsertQuery() {
		try {
			//드라이버로드
			Class.forName("oracle.jdbc.OracleDriver");
			//연결정보 기술
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "education";
			String pass = "1234";
			//DB연결
			con = DriverManager.getConnection(url, id, pass);
			System.out.println("오라클 DB 연결성공");
		}
		catch (Exception e) {
			System.out.println("연결실패");
		}
	}//end of InsertQuery
	private void close() {
		try {
			if(stmt!=null) stmt.close();
			if(con!=null)con.close();
			System.out.println("DB자원반납완료");
		} 
		catch (Exception e) {
			System.out.println("지원반납시 오류가 발생하였습니다.");
		}
	}//end of close
	private void execute() {
		try {
			stmt = con.createStatement();
			String sql = "INSERT INTO member VALUES "
					+ " ('test3', '3333', '테스터3', SYSDATE) ";
			int affected = stmt.executeUpdate(sql);
			System.out.println(affected + "행이 입력되었습니다.");
			close();
		} 
		catch (SQLException e) {
			System.out.println("쿼리실행에 문제가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InsertQuery iSQL = new InsertQuery();
		iSQL.execute();
	}//end of main	
}


























