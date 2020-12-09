package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Mysql {

    private List list_id = new ArrayList();
    private List list_name = new ArrayList();
    private List list_bookurl = new ArrayList();
    private List list_imageurl = new ArrayList();
    private List list_down = new ArrayList();


    public Mysql() {
    }

    public void search(String name) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usr = "postgres";
        String psd = "032316xs";
        Connection conn = null;

        try {
            String sql = "select * from Bookstore where name = ?";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usr, psd);
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);

            ResultSet rs = pst.executeQuery();

            while (rs.next()){
                this.list_id.add(rs.getString("id"));
                this.list_name.add(rs.getString("name"));
                this.list_bookurl.add(rs.getString("bookurl"));
                this.list_imageurl.add(rs.getString("imageurl"));
            }



            rs.close();
            pst.close();
            conn.close();
        } catch (Exception var9) {
            System.out.print(var9);
            var9.printStackTrace();
        }


    }

    public List getList_down(String id) {
        String url = "jdbc:postgresql://192.168.0.104:5432/postgres";
        String usr = "postgres";
        String psd = "032316xs";
        Connection conn = null;

        try {
            String sql = "select * from Bookstore where id = ?";
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, usr, psd);
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);

            ResultSet rs = pst.executeQuery();

            while (rs.next())
            {
                this.list_down.add(rs.getString("id"));
                this.list_down.add(rs.getString("name"));
                this.list_down.add(rs.getString("bookurl"));
                this.list_down.add(rs.getString("imageurl"));
            }



            rs.close();
            pst.close();
            conn.close();
        } catch (Exception var9) {
            System.out.print(var9);
            var9.printStackTrace();
        }
        return this.list_down;

    }

    public List getList_id(){
        return this.list_id;
    }

    public List getList_name(){
        return this.list_name;
    }

    public List getList_bookurl(){
        return this.list_bookurl;
    }

    public List getList_imageurl(){
        return this.list_imageurl;
    }
}
