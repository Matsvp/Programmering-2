package oblig_4;
public class Role {
    private String roleFirstName;
    private String roleLastName;
    private Person actor;  

    // Konstruktør
    public Role(String roleFirstName, String roleLastName, Person actor) {
        this.roleFirstName = roleFirstName;
        this.roleLastName = roleLastName;
        this.actor = actor;
    }

    // Getter for roleFirstName
    public String getRoleFirstName() {
        return roleFirstName;
    }

    // Setter for roleFirstName
    public void setRoleFirstName(String roleFirstName) {
        this.roleFirstName = roleFirstName;
    }

    // Getter for roleLastName
    public String getRoleLastName() {
        return roleLastName;
    }

    // Setter for roleLastName
    public void setRoleLastName(String roleLastName) {
        this.roleLastName = roleLastName;
    }

    // Getter for actor
    public Person getActor() {
        return actor;
    }

    // Setter for actor
    public void setActor(Person actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return String.format("Rolle: %s %s, spilles av %s",
                roleFirstName, roleLastName, actor.getFullName());
    }
}

