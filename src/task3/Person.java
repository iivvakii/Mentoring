package task3;

public class Person{
    private String name;
    private String birthdayDate;
    private String city;

    public Person(String name, String birthdayDate, String city) {
        this.name = name;
        this.birthdayDate = birthdayDate;
        this.city = city;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    @Override
    public String toString() {
        return  "Name='" + name + '\'' +
                ", Birthday date='" + birthdayDate + '\'' +
                ", City='" + city + '\'';
    }

}
