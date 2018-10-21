package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String types;

    public String name;

    public int time;

    public String desc;

    public Long idchef;

    public static final Finder<Long, Menu> find = new Finder<>(Menu.class);

}
