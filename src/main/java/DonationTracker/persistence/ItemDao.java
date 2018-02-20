package DonationTracker.persistence;

import DonationTracker.entity.Item;
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

public class ItemDao {
    private final Logger logger = LogManager.getLogger(this.getClass());
    SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();

    /**
     * Gets all items
     *
     * @return A list of all items
     */
    public List<Item> getAllItems() {
        Session session = sessionFactory.openSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Item> query = builder.createQuery(Item.class);
        Root<Item> root = query.from(Item.class);
        List<Item> items = session.createQuery(query).getResultList();
        session.close();
        return items;
    }

    /**
     * Gets item using id search input
     *
     * @return An item matching criteria
     */
    public Item getItemById(int id) {
        Session session = sessionFactory.openSession();
        Item item = session.get(Item.class, id);
        session.close();
        return item;
    }

    /**
     * update item
     * @param item  Item to be inserted or updated
     */
    public void saveOrUpdate(Item item) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(item);
        transaction.commit();
        session.close();
    }

    /**
     * insert Item
     * @param item  Item to be inserted or updated
     */
    public int insert(Item item) {
        int id = 0;
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        id = (int)session.save(item);
        transaction.commit();
        session.close();
        return id;
    }

    /**
     * Delete an item
     * @param item Item to be deleted
     */
    public void delete(Item item) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(item);
        transaction.commit();
        session.close();
    }

    /**
     * Get item by property (exact match)
     * sample usage: getByPropertyEqual("charity", "Goodwill")
     */
    public List<Item> getByPropertyEqual(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for item with " + propertyName + " = " + value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Item> query = builder.createQuery( Item.class );
        Root<Item> root = query.from( Item.class );
        query.select(root).where(builder.equal(root.get(propertyName), value));
        List<Item> items = session.createQuery( query ).getResultList();

        session.close();
        return items;
    }

    /**
     * Get items by property (like)
     * sample usage: getByPropertyLike("charity", "G")
     */
    public List<Item> getByPropertyLike(String propertyName, String value) {
        Session session = sessionFactory.openSession();

        logger.debug("Searching for user with {} = {}",  propertyName, value);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Item> query = builder.createQuery( Item.class );
        Root<Item> root = query.from( Item.class );
        Expression<String> propertyPath = root.get(propertyName);

        query.where(builder.like(propertyPath, "%" + value + "%"));

        List<Item> items = session.createQuery( query ).getResultList();
        session.close();
        return items;
    }

}

