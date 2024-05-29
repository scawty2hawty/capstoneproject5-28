package jdbc.components;

import java.util.List;
import batchesandclass.Participant;
import exceptions.DataBaseDeleteException;
import exceptions.DataBaseInsertException;
import exceptions.DataBaseUpdateException;

public interface ZinterfaceDao {
    // Get all participants
    List<Participant> getAllParticipants();

    // Get a specific participant by name
    Participant getParticipantByName(String name);

    // Add a new participant
    void addParticipant(Participant participant) throws DataBaseInsertException;

    // Update a specific participant
    boolean updateParticipant(Participant aParticipant) throws DataBaseUpdateException;

    // Delete a specific participant
    void trashParticipant(String name) throws DataBaseDeleteException;
}
