package DonationTracker.persistence;

import DonationTracker.entity.Item;
import DonationTracker.entity.User;
import DonationTracker.test.Database;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for UserDao persistence class
 */
class UserDaoTest {

    UserDao dao;

    /**
     * Creates new object for each test
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new UserDao();
    }

    /**
     * Verifies getting all users successfully
     */
    @Test
    void getAllUsersSuccess() {
        List<User> users = dao.getAllUsers();
        assertEquals(7, users.size());
    }

    /**
     * Verifies getting users by ID input successfully
     */
    @Test
    void getUsersByIdSuccess() {
        User retrievedUser = dao.getUserById(2);
        assertNotNull(retrievedUser);
        assertEquals("fhensen", retrievedUser.getUserName());
    }

    /**
     * Verify successful insert of a user
     */
    @Test
    void insertSuccess() {

        User newUser = new User("Test", "Tester", "test1", "password1", "test@gmail.com");
        int id = dao.insert(newUser);
        assertNotEquals(0,id);
        User insertedUser = dao.getUserById(id);
        assertEquals(newUser, insertedUser);

    }

    /**
     * Verify successful update of a user
     */
    @Test
    void updateSuccess() {
        String newEmail = "kmack12@gmail.com";
        User userToUpdate = dao.getUserById(4);
        userToUpdate.setEmail(newEmail);
        dao.saveOrUpdate(userToUpdate);
        User updatedUser = dao.getUserById(4);
        assertEquals(userToUpdate, updatedUser);
    }

    /**
     * Verify successful delete of user
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getUserById(6));
        assertNull(dao.getUserById(6));
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<User> users = dao.getByPropertyEqual("lastName", "Curry");
        assertEquals(1, users.size());
        assertEquals(3, users.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<User> users = dao.getByPropertyLike("lastName", "c");
        assertEquals(3, users.size());
    }

    /**
     * Verify successful insert of a user and an order
     */
    @Test
    void insertWithItemSuccess() {

        double amount = 100.00;
        String charity = "Boyscouts of America";
        String date = "2018-01-31";
        User newUser = new User("Fred", "Flintstone", "fflintstone", "password1", "flinstone2@gmail.com");
        Item item = new Item( newUser, "Money", amount, charity, date);
        newUser.addItem(item);
        int id = dao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = dao.getUserById(id);
        assertNotNull(insertedUser);
        assertEquals(newUser, insertedUser);
        assertEquals(1, insertedUser.getItems().size());
    }

    /**
     * Cleans up database
     */
    @AfterAll
    public static void tearDown() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }
}