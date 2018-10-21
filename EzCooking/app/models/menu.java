package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu{
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String types;

    public String name;

    public int time;

    public String desc;

    public static final Finder<Long, Menu> find = new Finder<>(Menu.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
