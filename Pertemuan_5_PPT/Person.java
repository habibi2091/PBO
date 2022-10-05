public class Person {
    String fname = "Habibi";
    String lname = "Ardaffenzy";
    int age = 20;

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println("Name: "+ myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
