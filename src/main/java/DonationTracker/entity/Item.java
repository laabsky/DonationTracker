package DonationTracker.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

/**
 * A class to represent a user.
 *
 * @author justin laabs
 */
@Entity(name = "Item")
@Table(name = "itemSubmit")
public class Item {

    /**
     * Bidirectional @OneToMany
     The bidirectional @OneToMany association also requires a @ManyToOne association on the child side.
     Although the Domain Model exposes two sides to navigate this association, behind the scenes,
     the relational database has only one foreign key for this relationship.
     Every bidirectional association must have one owning side only (the child side),
     the other one being referred to as the inverse (or the mappedBy) side.
     Foreign key is on the child table (Order in this example)
     By default, the @ManyToOne association assumes that the parent-side entity identifier is to be used to join
     with the client-side entity Foreign Key column.
     However, when using a non-Primary Key association,
     the column description and foreign key should be used to instruct Hibernate
     which column should be used on the parent side to establish the many-to-one database relationship.
     Source: http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#associations-one-to-many
     */
    @ManyToOne
    private User users;

    @Column(name = "itemLookup_id")
    private int itemLookupId;

    @Column(name = "amount")
    private double amount;

    // Every Entity must have a unique identifier which is annotated @Id
    // Notice there is no @Column here as the column and instance variable name are the same
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @Column(name = "charity")
    private String charity;

    @Column(name = "date")
    private String date;


    /**
     * Instantiates a new Item.
     */
    public Item() {
    }

    /**
     * Instantiates a new Item donated using itemLookup.
     *
     * @param users          the user from the users table
     * @param itemLookupId   the itemLookup id from the itemLookup table (if applicable)
     * @param amount                      the value of the item
     * @param charity        the charity given the donation
     * @param date           the date of donation
     */
    public Item (User users, int itemLookupId, double amount, String charity, String date) {
        this.users = users;
        this.itemLookupId = itemLookupId;
        this.amount = amount;
        this.charity = charity;
        this.date = date;
    }

    /**
     * Instantiates a new Item from database retrieval.
     *
     * @param users           the user from the users table
     * @param itemLookupId   the itemLookup id from the itemLookup table (if applicable)
     * @param amount         the dollar amount of donation (if applicable)
     * @param id             the id
     * @param charity        the charity given the donation
     * @param date           the date of donation
     */
    public Item (User users, int itemLookupId, String charity, String date, double amount, int id) {
        this.users = users;
        this.itemLookupId = itemLookupId;
        this.charity = charity;
        this.date = date;
        this.id = id;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Item{" +
                "user='" + users + '\'' +
                ", itemLookupId='" + itemLookupId + '\'' +
                ", charity='" + charity + '\'' +
                ", date='" + date + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUsers() {
        return users;
    }

    /**
     * Sets user.
     *
     * @param users the user the users table
     */
    public void setUsers(User users) {
        this.users = users;
    }

    /**
     * Gets itemLookupId.
     *
     * @return the itemLookupId
     */
    public int getItemLookupId() {
        return itemLookupId;
    }

    /**
     * Sets itemLookupId.
     *
     * @param itemLookupId the id from the iteLookup table
     */
    public void setItemLookupId(int itemLookupId) {
        this.itemLookupId = itemLookupId;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the donation amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets id.
     *
     * @return the Item id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the Item ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets charity.
     *
     * @return the charity name
     */
    public String getCharity() {
        return charity;
    }

    /**
     * Sets charity.
     *
     * @param charity the charity name
     */
    public void setCharity(String charity) {
        this.charity = charity;
    }

    /**
     * Gets donation date.
     *
     * @return the donation date
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the last name
     */
    public void setDate(String date) {
        this.date = date;
    }
}

