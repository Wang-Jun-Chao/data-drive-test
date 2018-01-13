package wjc.ddt.testbean;

import java.io.Serializable;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2018-01-13 07:11
 * Blog: http://blog.csdn.net/derrantcm
 * Github: https://github.com/wang-jun-chao
 * All Rights Reserved !!!
 */
public class Person implements Serializable {
    private long id;
    private String firstName;
    private String lastName;
    private List<Address> addresses;

    public Person() {
    }

    public Person(long id, String firstName, String lastName, List<Address> addresses) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
