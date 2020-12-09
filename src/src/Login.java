package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Login {
    public List listname = new ArrayList();
    public List listpass = new ArrayList();

    public Login() {
    }

    public Boolean check(int id, String pass) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usr = "postgres";
        String psd = "032316xs";
        Connection conn = null;

        try {
            String sql = "select id,password from student where id = ? and password = ?";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usr, psd);
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,id);
            pst.setString(2,pass);
            ResultSet rs = pst.executeQuery();

            while(rs.next()) {
                this.listname.add(rs.getString("id"));
                this.listpass.add(rs.getString("password"));
            }

            rs.close();
            pst.close();
            conn.close();
        } catch (Exception var10) {
            System.out.print(var10);
            var10.printStackTrace();
        }

        return !this.listname.isEmpty() && !this.listpass.isEmpty() ? true : false;
    }
}
