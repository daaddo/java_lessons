package it.cascella.jsons.test3_enum;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Via Roma", "Roma", "RM", "00100");
        Telephone telephone = new Telephone("Samsung", "123456789");
        Telephone telephone2 = new Telephone("Apple", "987654321");
        List<Telephone> telephones = Arrays.asList(new Telephone("Samsung", "123456789"), new Telephone("Apple", "987654321"));
        Person p = new Person("Mario", "Rossi", 30, Gender.MALE, telephones, address);
        try {
            String json = DataConverter.toJson(p);
            System.out.println(json);
            System.out.println("------------------");
            System.out.println(DataConverter.prettyPrint(json));
            System.out.println("------------------");
            /*String json2 = "{\"name\":null,\"surname\":\"MARK\",\"age\":20}";
            String telephonejson2 = "{\"brand\":\"Samsung\",\"number\":\"123456789\"}";
            Class<Person> clazz = Person.class;
            Class<Telephone> clazz2 = Telephone.class;
            Telephone p2 = DataConverter.fromJson(telephonejson2, clazz2);
            System.out.println(p2.getBrand());
            System.out.println(p2.getNumber());*/
            String jSonAddress = "{\"street\":\"Via Roma\",\"citta\":\"Roma\",\"state\":\"RM\",\"zip\":\"00100\"}";
            Address address2 = DataConverter.fromJson(jSonAddress, Address.class);
            System.out.println("Street = " + address2.getStreet() );
            System.out.println("City = " + address2.getCity() );
            System.out.println("state = " + address2.getState() );
            System.out.println("ZipCode = " + address2.getZip() );
            System.out.println("------------------");
            String jSonPerson = "{\"name\":\"Mario\",\"surname\":\"Rossi\",\"age\":30,\"gender\":\"Maschio\",\"telephones\":[{\"brand\":\"Samsung\",\"number\":\"123456789\"},{\"brand\":\"Apple\",\"number\":\"987654321\"}],\"address\":{\"street\":\"Via Roma\",\"citta\":\"Roma\",\"state\":\"RM\",\"zip\":\"00100\"}}";
            Person person2 = DataConverter.fromJson(jSonPerson, Person.class);
            System.out.println("Name = " + person2.getName() );
            System.out.println("Surname = " + person2.getSurname() );
            System.out.println("Age = " + person2.getAge() );
            System.out.println("Gender = " + person2.getGender() );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
