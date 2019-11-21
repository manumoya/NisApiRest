package nisum.model;

public class Persona {

    private Integer id;
    private String name;
    private String lastName;
    private String address;
    private Integer phoneNumber;
    private String hairColour;

    public Persona(){
    }

    public Persona(Integer id, String name, String lastName, String address, Integer phoneNumber, String hairColour) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.hairColour = hairColour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHairColour() {
        return hairColour;
    }

    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }

}
