// Sealed parent class
sealed abstract class Payment permits CardPayment, UpiPayment {

    public abstract void pay(double amount);
}

// Allowed child class
final class CardPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

// Allowed child class
non-sealed class UpiPayment extends Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// Further extension allowed because UpiPayment is non-sealed
class GooglePay extends UpiPayment {
}

public class SealedClass {

    public static void main(String[] args) {

        Payment p1 = new CardPayment();
        p1.pay(500);

        Payment p2 = new GooglePay();
        p2.pay(300);
    }
}

/*
    Sealed Class in Java:

- Introduced in Java 17.
- Used to restrict inheritance.
- Controls which classes can extend a class.

Why Sealed Class is Needed?

- To control class hierarchy.
- To improve security.
- To prevent misuse of inheritance.

Rules of Sealed Class:

- Child classes must be:
  final - Cannot be extended further.
  sealed - Again restricts its subclasses.
  non-sealed - Can be extended further.

Sealed Interface:

- Same concept as sealed class.
- Restricts which classes or interfaces can implement it.

Real-Life Use Cases:

- Payment systems
- User roles (Admin, User, Guest)
- Vehicle types
- Notification types

Sealed vs Abstract:

- Abstract → allows unlimited inheritance
- Sealed → restricted inheritance

Important Interview Points:

- Sealed classes give controlled inheritance.
- Improves maintainability.
- Works with pattern matching.
- Requires permits keyword.

One-Line Interview Answer:

- Sealed classes restrict which classes
  can extend or implement them in Java.

*/