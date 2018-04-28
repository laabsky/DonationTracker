package DonationTracker.persistence;

import DonationTracker.entity.Item;
import DonationTracker.entity.Role;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;
import java.util.List;

public class RoleDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets all roles
     *
     * @return A list of all roles
     */
    public List<Role> getAllRoles() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery(Role.class);
        Root<Role> root = query.from(Role.class);
        List<Role> roles = session.createQuery(query).getResultList();
        session.close();
        return roles;
    }

    /**
     * Gets role using id search input
     *
     * @return An role matching criteria
     */
    public Role getRoleById(int id) {
        Session session = sessionFactory.openSession();
        Role role = session.get(Role.class, id);
        session.close();
        return role;
    }

    /**
     * update Role
     * @param role  Role to be inserted or updated
     */
    public void saveOrUpdate(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(role);
        transaction.commit();
        session.close();
    }

    /**
     * insert Role
     * @param role  Role to be inserted or updated
     */
    public int insert(Role role) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(role);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete an role
     * @param role Role to be deleted
     */
    public void delete(Role role) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(role);
        transaction.commit();
        session.close();
    }

    /**
     * Get role by property (exact match)
     * sample usage: getByPropertyEqual("role_name", "user")
     */
    public List<Role> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for role with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Role> query = builder.createQuery( Role.class );
        Root<Role> root = query.from( Role.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Role> roles = session.createQuery( query ).getResultList();

        session.close();
        return roles;
    }


}

