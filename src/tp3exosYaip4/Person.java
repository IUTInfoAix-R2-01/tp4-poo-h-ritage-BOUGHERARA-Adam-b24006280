package tp3exosYaip4;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return String.format("Person[name=%s,address=%s]", this.name, this.address);
    }

    public static void main(String[] args) {
        Person p1 = new Person("John", "Paris");
        Person p2 = new Person("Paul", "Lyon");
        Person p3 = new Person("George", "Marseille");

        System.out.println(p1);
        System.out.println(p2); 
        System.out.println(p3);

        p1.setAddress("Lille");
        System.out.println("Adresse mise à jour pour p1: " + p1.getAddress());
    }
}
