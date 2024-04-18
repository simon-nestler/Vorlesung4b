public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Max Mustermann", new Datum(1, 1, 2000));
        person.getMutter().getMutter().setMutter(new Person("Eva"));

        System.out.println(person);

        Person mutter = person.getMutter();
        Person zwischenmutter = new Person("Zwischenmutter");
        person.setMutter(zwischenmutter);
        zwischenmutter.setMutter(mutter);

        System.out.println(person);

    }
}
