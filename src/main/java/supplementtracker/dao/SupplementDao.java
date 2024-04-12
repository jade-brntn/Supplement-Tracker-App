
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SupplementDao {

    public void addSupplement(Supplement supplement) {
        String sql = "INSERT INTO supplements(name, type, dosage) VALUES(?,?,?)";
        try (Connection conn = DbConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, supplement.getName());
            pstmt.setString(2, supplement.getType());
            pstmt.setInt(3, supplement.getDosage());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error adding supplement: " + e.getMessage());
        }
    }
}
