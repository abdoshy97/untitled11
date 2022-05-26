import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Data {

public static void connection(){
    try {
        Connection   c = DriverManager.getConnection(
                "jdbc:mysql://localhost/abd?serverTimezone=UTC",
                "root",
                "abdfcb97"
        );
        Statement s=c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet r=s.executeQuery("SELECT * FROM abd.abdo; ");
        r.next();
      String str=  r.getString("name");
        System.out.println(str);
        System.out.println("OK!");
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}

}
