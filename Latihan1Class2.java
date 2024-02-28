public class Latihan1Class2 {
    private String name;
    private String address;
    private String contactNumber;

    public Latihan1Class2(String name, String address, String contactNumber) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public void displayInfo() {
        System.out.println("Customer Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
    }
}
