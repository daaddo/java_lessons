package it.cascella.jsons.test1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Peppe", "Peppe", 2);
        try {
            String json = DataConverter.toJson(p);
            System.out.println(json);
            System.out.println("------------------");
            System.out.println(DataConverter.prettyPrint(json));
            System.out.println("------------------");
            String json2 = "{\"name\":null,\"surname\":\"MARK\",\"age\":20}";
            String telephonejson2 = "{\"brand\":\"Samsung\",\"number\":\"123456789\"}";
            Class<Person> clazz = Person.class;
            Class<Telephone> clazz2 = Telephone.class;
            Telephone p2 = DataConverter.fromJson(telephonejson2, clazz2);
            System.out.println(p2.getBrand());
            System.out.println(p2.getNumber());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
