package domain;

import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mc_user")
public class User extends Model {

    @Id
    public long id;
    @Column
    public String name;

    public User() {
    }

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
