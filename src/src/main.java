package src;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

public class main {
    public static void main(String[] arg) {
        Mysql sql = new Mysql();

        sql.search("斗罗大陆");

        System.out.print(sql.getList_id());

        List list = sql.getList_down("0001");
        System.out.print(list);

    }
}
