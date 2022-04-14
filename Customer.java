import java.util.Date;

public class Customer {
    public int id;
    public String firstname;
    public String lastname;
    public String dateOfBirth;
    public String nationalId;

    public Customer(int id, String firstname, String lastname, String dateOfBirth,String nationalId){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.nationalId = nationalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        lastname = lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        dateOfBirth = dateOfBirth;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        nationalId = nationalId;
    }

}
