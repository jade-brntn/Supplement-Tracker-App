
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReportGenerator {

    public void generateEffectivenessReport() {
        String sql = "SELECT name, COUNT(symptom) as relief FROM supplement_use JOIN symptoms ON supplement_use.id = symptoms.supplement_id WHERE symptom = 'relief' GROUP BY name";
        try (Connection conn = DbConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getString("name") + " shows relief in " + rs.getInt("relief") + " cases.");
            }
        } catch (SQLException e) {
            System.out.println("Error generating report: " + e.getMessage());
        }
    }
}
