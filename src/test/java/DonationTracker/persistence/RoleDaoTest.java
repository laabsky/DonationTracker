package DonationTracker.persistence;

import DonationTracker.entity.Item;
import DonationTracker.entity.Role;
import DonationTracker.entity.User;
import DonationTracker.test.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for ItemDao persistence class
 */
class RoleDaoTest {

    RoleDao dao;

    /**
     * Creates new object for each test
     */
    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
        dao = new RoleDao();
    }

    /**
     * Verifies getting all roles successfully
     */
    @Test
    void getAllRolesSuccess() {
        List<Role> roles = dao.getAllRoles();
        assertEquals(3, roles.size());
    }


    /**
     * Verifies getting Role by ID input successfully
     */
    @Test
    void getRolesByIdSuccess() {
        Role retrievedRole = dao.getRoleById(2);
        assertNotNull(retrievedRole);
        assertEquals("admin", retrievedRole.getRoleName());
    }

    /**
     * Verify successful insert
     */
    @Test
    void insertSuccess() {

        UserDao userDao = new UserDao();
        User user = userDao.getUserById(1);
        String roleName = "user";
        Role newRole = new Role(user, roleName, user.getUserName());
        user.addRole(newRole);
        int id = dao.insert(newRole);
        assertNotEquals(0, id);
        Role insertedRole = dao.getRoleById(id);
        assertNotNull(insertedRole);
        assertEquals(roleName, insertedRole.getRoleName());
        assertNotNull(insertedRole.getUser());
        assertEquals("Joe", insertedRole.getUser().getFirstName());
    }

    /**
     * Verify successful update of an role
     */
    @Test
    void updateSuccess() {
        String newRole = "user";
        Role roleToUpdate = dao.getRoleById(1);
        roleToUpdate.setRoleName(newRole);
        dao.saveOrUpdate(roleToUpdate);
        Role updatedRole = dao.getRoleById(1);
        assertEquals(newRole, updatedRole.getRoleName());
    }

    /**
     * Verify successful delete of role
     */
    @Test
    void deleteSuccess() {
        dao.delete(dao.getRoleById(1));
        assertNull(dao.getRoleById(1));
    }

    /**
     * Verify successful get by property (equal match)
     */
    @Test
    void getByPropertyEqualSuccess() {
        List<Role> roles = dao.getByPropertyEqual("roleName", "user");
        assertEquals(1, roles.size());
        assertEquals(3, roles.get(0).getId());
    }

    /**
     * Verifies a order is returned correctly based on id search
     */
    @Test
    void getByIdVerifyUserSuccess() {
        Role retrievedRole = dao.getRoleById(1);
        assertNotNull(retrievedRole);
        assertEquals("admin", retrievedRole.getRoleName());
        assertEquals("Joe", retrievedRole.getUser().getFirstName());
    }
}
