package HunderedDays_BootCamp.Day_1_to_10.Day_4.Project;

import java.util.Set;

public class Users {

    private String name;
    private Set<String> role;
    private Boolean active;

    public Users(String name, Set<String> role, Boolean active) {
        this.name = name;
        this.role = role;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRole() {
        return role;
    }

    public Boolean getActive() {
        return active;
    }
}
