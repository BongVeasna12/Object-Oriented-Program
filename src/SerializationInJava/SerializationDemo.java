package SerializationInJava;
import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID =  1L;
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        try {
            // Serialize the Person object to a file
            Person person = new Person("John Doe",  30);
            // class is used to serialize objects! to write the primitive data from OutputStream!
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person);
            oos.close();
            fos.close();
            System.out.println("Person object has been serialized.");
            // Deserialize the Person object from a file.
            // class is used to de-serialize obj read primitive data from InputStream!
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person deserializedPerson = (Person) ois.readObject();
            ois.close();
            fis.close();

            System.out.println("Person object has been deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
