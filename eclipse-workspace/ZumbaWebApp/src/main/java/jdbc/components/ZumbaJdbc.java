package jdbc.components;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import batchesandclass.Participant;
import exceptions.DataBaseDeleteException;
import exceptions.DataBaseInsertException;
import exceptions.DataBaseUpdateException;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ZumbaJdbc implements ZinterfaceDao {

    private JdbcTemplate jdbcTemplate;

    public ZumbaJdbc(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // RowMapper to map SQL result set to Participant POJO
    private static final RowMapper<Participant> PARTICIPANT_ROW_MAPPER = (rs, rowNum) -> new Participant(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("phone_number"),
            rs.getInt("age")
    );

    // CRUD operations
    public List<Participant> getAllParticipants() {
        String sql = "SELECT * FROM participants";
        return jdbcTemplate.query(sql, PARTICIPANT_ROW_MAPPER);
    }

    public Participant getParticipantById(int id) {
        String sql = "SELECT * FROM participants WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, PARTICIPANT_ROW_MAPPER, id);
    }

    public void insertParticipant(Participant participant) throws DataBaseInsertException {
        String sql = "INSERT INTO participants (name, email, phone_number, age) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, participant.getName(), participant.getEmial(), participant.getPhone(), participant.getAge());
    }

    public boolean updateParticipantDetails(Participant participant) throws DataBaseUpdateException {
        String sql = "UPDATE participants SET name = ?, email = ?, phone_number = ?, age = ? WHERE id = ?";
        int rowsAffected = jdbcTemplate.update(sql, participant.getName(), participant.getEmial(), participant.getPhone(), participant.getAge(), participant.getPid());
        return rowsAffected > 0;
    }

    public void removeParticipant(int id) throws DataBaseDeleteException {
        String sql = "DELETE FROM participants WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

	@Override
	public Participant getParticipantByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addParticipant(Participant participant) throws DataBaseInsertException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean updateParticipant(Participant aParticipant) throws DataBaseUpdateException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void trashParticipant(String name) throws DataBaseDeleteException {
		// TODO Auto-generated method stub
		
	}

    // Implement the remaining methods as needed
}
