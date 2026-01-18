class Laptop {

    String model;
    int price;

    // Converts object into readable string
    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    // Generates hash value for object
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    // Compares content of two objects
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Laptop other = (Laptop) obj;

        if (model == null) {
            if (other.model != null) return false;
        } else if (!model.equals(other.model)) return false;

        if (price != other.price) return false;

        return true;
    }
}

public class ObjectClass {

    public static void main(String[] args) {

        Laptop obj1 = new Laptop();
        obj1.model = "HP Victus";
        obj1.price = 4524;

        Laptop obj2 = new Laptop();
        obj2.model = "HP Victus";
        obj2.price = 4524;

        System.out.println(obj1.toString());   // calls toString()
        System.out.println(obj1.equals(obj2)); // true
    }
}


/*
    Object Class in Java:

- Object class is the parent class of all classes.
- Every class in Java implicitly extends Object class.

Common Methods of Object Class:

- toString()
- equals()
- hashCode()
- getClass()

toString():

- Converts object into string format.
- Called automatically when object is printed.
- Default output is className@hashCode.
- We override it for readable output.

equals():

- Used to compare two objects.
- Default equals() compares reference.
- We override equals() to compare content.

hashCode():

- Returns integer hash value of object.
- Used in hashing-based collections.
- If equals() is overridden, hashCode() must also be overridden.

Why override equals() and hashCode()?

- To compare object data, not memory address.
- Required for HashMap, HashSet, etc.

Important Interview Points:

- Object is the superclass of all classes.
- equals() compares reference by default.
- toString() gives object representation.
- equals() and hashCode() must follow contract.

One-Line Interview Answer:

- Object class is the root class of Java from which all classes are inherited.

*/