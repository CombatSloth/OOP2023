public class Person {
    String name;
    String lastName;
    int age;

    // kontruktor
    public Person(String name, String lastName, int age){
    this.name = name;
    this.lastName = lastName;
    this.age = age;
    }

    //toString() metod
    public String toString(){
        return "Person[Age= " + age + ", Name= " + name + ", Lastname=" + lastName+ "]";
    }
}
