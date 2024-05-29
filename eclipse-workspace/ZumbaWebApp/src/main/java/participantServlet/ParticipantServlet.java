package participantServlet;

import batchesandclass.Participant; // Import the Participant class

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ParticipantServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Database credentials
    private static final String USERNAME = "yourUsername";
    private static final String PASSWORD = "yourPassword";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/yourDatabaseName";

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Participant> participants = getParticipantSchedule();
        // You can then set this list as an attribute and forward it to a JSP page for display
        request.setAttribute("participants", participants);
        request.getRequestDispatcher("/zumbaSchedule.jsp").forward(request, response);
    }

    private List<Participant> getParticipantSchedule() {
        List<Participant> participants = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM ZumbaSchedule")) {

            while (rs.next()) {
                // Assuming you have a Participant class with appropriate fields and a constructor
                Participant participant = new Participant(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("instructor"),
                        rs.getTimestamp("schedule_time")
                );
                participants.add(participant);
            }
        } catch (SQLException e) {
            // Handle exceptions
            e.printStackTrace();
        }
        return participants;
    }

    // Other methods...
}
