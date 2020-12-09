package src;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQL {
    public List listid = new ArrayList();
    public List listname = new ArrayList();
    public List listage = new ArrayList();
    public List listads = new ArrayList();
    public List listgrade = new ArrayList();
    public String name,age,ads,grade;


    public void execute() {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        String usr = "postgres";

        String psd = "032316xs";


        Connection conn = null;

        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            Statement st = conn.createStatement();
//Statement：适合只执行一次或极少执行的sql文。

//PreparedStatement：适合执行需要传参并且会多次执行的sql文，并且一定程度上防止了sql注入。

//CallableStatement：适合执行存储过程。

            ResultSet rs = st.executeQuery("select id, name, age, homeaddress, grade from student");

            while (rs.next()) {

                listid.add(rs.getString("id"));
                listname.add(rs.getString("name"));
                listage.add(rs.getString("age"));
                listads.add(rs.getString("homeaddress"));
                listgrade.add(rs.getString("grade"));


            }

            rs.close();

            st.close();

            conn.close();

        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }



    }
    public void insert(int id,String name,int age,String ads,int grade) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        String usr = "postgres";

        String psd = "032316xs";


        Connection conn = null;

        PreparedStatement preparedStatement = null;
        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            String sql = "INSERT INTO student(id,name,age,homeaddress,grade) values(?,?,?,?,?)";

            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, ads);
            preparedStatement.setInt(5, grade);

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        conn.close();
        preparedStatement.close();


    }

    public void check(int id) {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        String usr = "postgres";

        String psd = "032316xs";


        Connection conn = null;

        try {
            String sql = "select * from student where id = ?";

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            PreparedStatement pst = conn.prepareStatement(sql);
//Statement：适合只执行一次或极少执行的sql文。

//PreparedStatement：适合执行需要传参并且会多次执行的sql文，并且一定程度上防止了sql注入。

//CallableStatement：适合执行存储过程。
            pst.setInt(1,id);

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {

                name=rs.getString("name");
                age=rs.getString("age");
                ads=rs.getString("homeaddress");
                grade=rs.getString("grade");

            }

            rs.close();

            pst.close();

            conn.close();

        } catch (Exception e) {
            System.out.print(e);
            e.printStackTrace();

        }

    }

    public void delete(int id) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        String usr = "postgres";

        String psd = "032316xs";


        Connection conn = null;

        PreparedStatement preparedStatement = null;
        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            String sql = "delete from student where id = ?";

            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, id);


            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        conn.close();
        preparedStatement.close();


    }

    public void change(int id,String name,int age,String ads,int grade) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/postgres";

        String usr = "postgres";

        String psd = "032316xs";


        Connection conn = null;

        PreparedStatement preparedStatement = null;
        try {

            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection(url, usr, psd);

            String sql = "update student set name=?,age=?,homeaddress=?,grade=? where id=?";

            preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, ads);
            preparedStatement.setInt(4, grade);
            preparedStatement.setInt(5, id);

            preparedStatement.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        conn.close();
        preparedStatement.close();
    }
}
