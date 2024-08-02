public class this_getset {
    public static void main(String[] args) {
        Human h1 = new Human();
        Human h = new Human(12,"kunal");
        System.out.println("My name is "+h.getName()+"My age is "+h.getAge());
        System.out.println("My name is "+h1.getName()+"My age is "+h1.getAge());

    }
}
   /**
 * Human
 */
 class Human {

    private int age;
    private String name;

    public Human(){
        age = 12;
        name = "Johnny";
    }
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    } 
}