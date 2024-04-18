public class Person {
    private String name;
    private Datum geburtstag;
    private Person mutter;

    public Person(String name, Datum geburtstag) {
        this.name = name;
        this.geburtstag = geburtstag;

        if (this.name.length() < 30) {
            this.mutter = new Person("Mutter von " + name,
                    new Datum(geburtstag.getTag(), geburtstag.getMonat(), geburtstag.getJahr() - 30));
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name + ",\n Geburtstag: " + geburtstag + "\n  und Mutter: " + mutter + "\n \n";
    }

    public Person getMutter() {
        return mutter;
    }

    public void setMutter(Person mutter) {
        this.mutter = mutter;
    }
}
