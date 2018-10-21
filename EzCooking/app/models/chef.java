import javax.persistence.Id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}