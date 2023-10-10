import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world");
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/satd_replace_db",
                "me",
                "goma");
        //init database //TODO I just need to rewrite the existing SATD DB, so I don't have to create a new DB?
        
        int a =0;
        int b =0;
        calc(a,b);
    }

    private static int calc(int a, int b) {
        a = b+1;
        return a;

    }
}
