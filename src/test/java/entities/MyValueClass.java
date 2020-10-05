package entities;

public class MyValueClass {

    private final String name;
    private final String password;
    private final String email;
    private final String country;
    private final String number;

    public MyValueClass(String name, String password, String email, String country, String number){
        this.name = name;
        this.password = password;
        this.email = email;
        this.country = country;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "MyValueClass{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
