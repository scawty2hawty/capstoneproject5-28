package menuitems;

import java.util.List;

public interface InterfaceForMenu {

    public interface menuitems {

        // Get all ThisIsPojo
        public List<ThisIsPojo> getAllThisIsPojo();

        // Get a specific ThisIsPojo by name
        public ThisIsPojo getThisIsPojoByName(String name);

        // Add a new ThisIsPojo
        public void addThisIsPojo(ThisIsPojo pojo) throws DataBaseInsertException;

        // Update a specific ThisIsPojo
        public boolean updateThisIsPojo(ThisIsPojo aPojo) throws DataBaseUpdateException;

        // Delete a specific ThisIsPojo
        public void deleteThisIsPojo(String name) throws DataBaseDeleteException;
    }
}

