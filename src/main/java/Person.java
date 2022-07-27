public class Person {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (!hasAddress()) this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonalBuilderImpl()
                .setSurname(this.surname)
                .setAge(18)
                .setAddress(this.address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
