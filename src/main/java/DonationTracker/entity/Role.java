package DonationTracker.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "Role")
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "role_user_user_id_fk")
    )
    private User users;

    @Column(name="user_name")
    private String userName;


    @Column(name="role_name")
    private String roleName;

    /**
     * Instantiates a new Role.
     */
    public Role() {
    }

    /**
     * Instantiates a new Role.
     *
     * @param users      the user object
     * @param roleName  the role name
     * @param userName  the user name
     */
    public Role(User users, String roleName, String userName) {
        this.users = users;
        this.roleName = roleName;
        this.userName = userName;
    }

    /**
     * Gets role id.
     *
     * @return the role id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets role id.
     *
     * @param id the new id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return users;
    }

    /**
     * Sets user.
     *
     * @param user the user object
     */
    public void setUser(User user) {
        this.users = users;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets role name.
     *
     * @param roleName the role name
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", userName= '" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id == role.id &&
                Objects.equals(userName, role.userName) &&
                Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id,  roleName, userName);
    }
}
