public class Person{

    //attributes
    private String firstName;
    private String lastName;
    private int age;

    //constructors
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public Person(Person other){
        this(other.firstName, other.lastName, other.age);
    }

    public Person(){
        this.firstName = "No first name";
        this.lastName = "No last name";
        this.age = 0;
    }

    //getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lasttName;
    }
    public int getAge(){
        return this.age;
    }

    //setters
    public void setFirstName(String fn){
        this.firstName = fn;
    }
    public void setLastName(String ln){
        this.lastName = ln;
    }
    public void setAge(int a){
        this.age = a;
    }

}