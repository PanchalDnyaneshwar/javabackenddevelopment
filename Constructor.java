
class Human {
    private String name;
    private int age;

    // constructor
    public Human (String nm, int ag)
    {
        this.name = nm;
        this.age = ag;
    }

    // setter

    public void setName (String nm)
    {
        this.name = nm;
    }
    
    public void setAge (int ag)
    {
       this.age = ag;
    }

    // getter

    public int getAge()
    {
        return this.age;
    }

    public String getName ()
    {
        return this.name;
    }
}


public class Constructor {
    
    public static void main(String[] args) {
        
        Human h1 = new Human("Dnyaneshwar", 24);
        System.out.println(h1.getName());
        System.out.println(h1.getAge());
    }
}
