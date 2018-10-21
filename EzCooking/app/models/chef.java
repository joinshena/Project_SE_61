package models;

//import javax.persistence.Entity;
//import javax.persistence.Id;

@Entity
public class Chef {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String username;

    public String password;

    public String name;

    public String email;

    public String desc;

    public static final Finder<Long, Chef> find = new Finder<>(Chef.class);

}