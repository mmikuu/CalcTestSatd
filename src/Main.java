import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/satd_replace_db",
                "me",
                "goma");
        //init database
        //Fixme //TODO
        int a =0;
        int b =0;
        calc(a,b);
        //TODO new function added
        //TODO new function added

        // FIXME
    }

    private static int calc(int a, int b) {
        /* TODO
        * bug 10
        * //TODO change name
         */

        a = b+1;
        return a;
        /* TODO
         * bug 10
         * //TODO change name
         */

    }
}
