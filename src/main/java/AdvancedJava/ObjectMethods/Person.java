package AdvancedJava.ObjectMethods;

public class Person {
    private final String name;
    private final String email;

    public Person(final String name, final String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        final Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return email != null ? email.equals(person.email) : person.email == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

//    @Override
//    public Person clone() throws CloneNotSupportedException{
//        return (Person) super.clone();
//    }
}
