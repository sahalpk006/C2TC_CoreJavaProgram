package daytwenty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSQLReadExample {
    public static void main(String[] args) {
        // Update with your real DB credentials
        String url = "jdbc:postgresql://localhost:5432/student";
        String user = "postgres";
        String password = "Sahalpk@123";

        try {
            Class.forName("org.postgresql.Driver"); // Load the driver

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL database!");

            Statement stmt = conn.createStatement();
            String query = "SELECT id, sname, age FROM student";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("id");
                String sname = rs.getString("sname");
                int age = rs.getInt("age");

                System.out.println(id + " | " + sname + " | " + age);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

