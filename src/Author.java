public class Author {
    String firstName;
    String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        return toString().equals(((Author) other).toString());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName + " " + lastName);
    }
}
