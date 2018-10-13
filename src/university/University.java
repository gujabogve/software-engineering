package university;

public class University {
    private String name, address, rector;

    public String getRector() {
        return rector;
    }

    public void setRector(String rector) {
        this.rector = rector;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University() {

        Lector lector = new Lector();

        lector.setFirstName("Guja");
        lector.setLastName("Bogveradze");

    }
}
