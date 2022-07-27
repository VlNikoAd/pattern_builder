public class Main {

    public static void main(String[] args) {

        Person mom = new PersonalBuilderImpl()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(46)
                .setAddress("Lenina")
                .build();
        mom.happyBirthday();

        Person child = mom.newChildBuilder()
                .setName("Vlad")
                .build();
        child.happyBirthday();

        System.out.println("У " + mom + " есть сын, " + child);
    }
}
