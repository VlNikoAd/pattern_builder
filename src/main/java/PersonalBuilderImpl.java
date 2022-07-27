public class PersonalBuilderImpl implements PersonBuilder {

    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        if (age >= 0 && age < 100)
            person.age = age;
        else
            throw new IllegalArgumentException("Check human age!");
        return this;
    }

    @Override
    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (person.name == null ||
                person.surname == null ||
                !person.hasAge() ||
                !person.hasAddress())

            throw new IllegalStateException("Check human info, something empty!");
        return person;
    }
}
