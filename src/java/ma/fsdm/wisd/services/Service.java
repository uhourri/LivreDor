package ma.fsdm.wisd.services;

import ma.fsdm.wisd.model.Appreciation;
import ma.fsdm.wisd.model.SingletonConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author UNES
 */
public class Service implements IService {

    private final Connection connection;

    public Service() {
        connection = SingletonConnection.getConnection();
    }

    @Override
    public boolean ajouterAppreciation(Appreciation app) {
        try {
            String query = "INSERT INTO appreciation(auteur, email, contenu) VALUES(?, ?, ?)";
            int result;
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, app.getAuteur());
                statement.setString(2, app.getEmail());
                statement.setString(3, app.getContenu());
                result = statement.executeUpdate();
            }
            
            return result > 0;
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public ArrayList<Appreciation> recupererAppreciations() {
        ArrayList<Appreciation> appreciations = new ArrayList<>();
        try {
            String query = "SELECT * FROM appreciation ORDER BY date DESC";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                ResultSet result = statement.executeQuery();
                while (result.next()) {
                    Appreciation appreciation = new Appreciation();
                    appreciation.setId(result.getInt("id"));
                    appreciation.setAuteur(result.getString("auteur"));
                    appreciation.setEmail(result.getString("email"));
                    appreciation.setContenu(result.getString("contenu"));
                    appreciation.setDate(result.getString("date"));
                    appreciations.add(appreciation);
                }
            }
        } catch (SQLException e) {
        }
        return appreciations;
    }

}
