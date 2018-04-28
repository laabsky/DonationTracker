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
 * Test class for ItemDao persistence class
 */
class ItemDaoTest {

    ItemDao dao;

    /**
     * Creates new object for each test
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new ItemDao();
    }

    /**
     * Verifies getting all items successfully
     */
    @Test
    void getAllItemsSuccess() {
        List<Item> items = dao.getAllItems();
        assertEquals(3, items.size());
    }


    /**
     * Verifies getting item by ID input successfully
     */
    @Test
    void getItemsByIdSuccess() {
        Item retrievedItem = dao.getItemById(2);
        assertNotNull(retrievedItem);
        assertEquals("Goodwill", retrievedItem.getCharity());
    }

    /**
     * Verify successful insert
     */
    @Test
    void insertSuccess() {

        UserDao userDao = new UserDao();
        User user = userDao.getUserById(1);
        String charity = "Salvation Army";
        Item newItem = new Item(user, "money", 30, charity, "2018-02-10");
        //Order newOrder = new Order(orderDescription, user);
        user.addItem(newItem);
        int id = dao.insert(newItem);
        assertNotEquals(0, id);
        Item insertedItem = dao.getItemById(id);
        //Order insertedOrder = dao.getById(id);
        assertNotNull(insertedItem);
        assertEquals(charity, insertedItem.getCharity());
        assertNotNull(insertedItem.getUsers());
        assertEquals("Joe", insertedItem.getUsers().getFirstName());
    }

    /**
     * Verify successful update of an item
     */
    @Test
    void updateSuccess() {
        String newDate = "2018-01-01";
        Item itemToUpdate = dao.getItemById(1);
        itemToUpdate.setDate(newDate);
        dao.saveOrUpdate(itemToUpdate);
        Item updatedItem = dao.getItemById(1);
        assertEquals(newDate, updatedItem.getDate());
    }

    /**
     * Verify successful delete of item
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getItemById(3));
        assertNull(dao.getItemById(3));
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Item> items = dao.getByPropertyEqual("charity", "Goodwill");
        assertEquals(2, items.size());
        assertEquals(2, items.get(0).getId());
    }

    /**
     * Verify successful get by property (like match)
     */
    @Test
    void getByPropertyLikeSuccess() {
        List<Item> items = dao.getByPropertyLike("date", "2018");
        assertEquals(3, items.size());
    }

    /**
     * Verifies a order is returned correctly based on id search
     */
    @Test
    void getByIdVerifyUserSuccess() {
        Item retrievedItem = dao.getItemById(1);
        assertNotNull(retrievedItem);
        assertEquals("March of Dimes", retrievedItem.getCharity());
        assertEquals("Joe", retrievedItem.getUsers().getFirstName());
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
