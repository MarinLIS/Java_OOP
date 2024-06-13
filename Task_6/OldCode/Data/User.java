package HomeTask_OOP.Task_6.OldCode.Data;

import java.time.LocalDate;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate dateOfBirth;

    public User(String firstName, String lastName, String middleName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", middleName='" + middleName + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getLastName() != null ? !getLastName().equals(user.getLastName()) :
                user.getLastName() != null) {
            return false;
        }
        if (getMiddleName() != null ? !getMiddleName().equals(user.getMiddleName()) :
                user.getMiddleName() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}