package ua.anton.data;

/**
 * Created by Alex on 06.07.2015.
 */
public class User extends UserDatabase {
    public static int count = 0;
    public int id;
    public String login;
    public String firstName;
    public String email;

    //public String lastName;
    //public String middleName;
    //public Integer age;


    public static int getNextId() {
        return count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //public String getLastName() {
    //     return lastName;
    //}

    //public void setLastName(String lastName) {
    // this.lastName = lastName;
    //}

    //public String getMiddleName() {
    //  return middleName;
    // }

    // public void setMiddleName(String middleName) {
    //   this.middleName = middleName;
    // }

    //public Integer getAge() {
    //    return age;
    // }

    //public void setAge(Integer age) {
    //   this.age = age;
    //}
}