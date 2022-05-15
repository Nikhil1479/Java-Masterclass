public class Sport {
    public Sport() {
        System.out.println("Sport Constructor Invoked");
    }

    public void favouriteSports(){
        System.out.println("Favourite sport method called");
    }
}

class Person1 extends Sport{
    public Person1(){
        super();
        System.out.println("Person1 Constructor Invoked");
    }

    public void favouriteSport(){
        super.favouriteSports();
        System.out.println("Person1 Favourite Sport");
    }
}
class Person2{
    public static void main(String[] args) {
    Person1 obj = new Person1();
        obj.favouriteSports();
    }
}