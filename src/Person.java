public abstract class Person {
    String FirstName;
    String LastName;
    public Person(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    }
    public String ToString(){
        return this.FirstName + " " + this.LastName;
    }
}
