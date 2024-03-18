/*Write a java program, how to implement serialization for a given object. Use required classes and process to complete the serialization. 
for example take Customer(id, name, contactNo and address) class, use should write the java code, how to serialize Customer object to JavaObject.txt file. */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe", "1234567890", "123 Main Street");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaObject.txt"))) {
            oos.writeObject(customer);
            System.out.println("Customer object serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
