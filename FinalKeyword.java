class Calc {

    // final method
    final void show() {
        System.out.println("In Calc show by Dnyaneshwar");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// Uncommenting below will cause error if class is final
// final class Calc { }

// class AdvCalc extends Calc { }  ❌ if Calc is final

class AdvCalc extends Calc {

    // Cannot override final method
    // public void show() { } ❌
}

public class FinalKeyword {

    public static void main(String[] args) {

        // final variable
        final double pie = 3.14;
        // pie = 41.454; ❌ not allowed

        System.out.println(pie);

        AdvCalc cal = new AdvCalc();
        cal.add(12, 78);
        cal.show();
    }
}

/*
    final Keyword in Java:

- final is used to restrict modification.
- Used with variable, method, and class.

final Variable:

- Value cannot be changed.
- Makes variable constant.

Example:
final double pie = 3.14;

final Method:

- Method cannot be overridden.
- Used to prevent method modification.

Example:
final void show()

final Class:

- Class cannot be inherited.
- Used to stop inheritance.

Example:
final class Calc

Why use final?

- Provides security.
- Prevents unwanted modification.
- Improves code safety.

Important Interview Points:

- final variable → constant
- final method → no overriding
- final class → no inheritance
- final keyword improves security

One-Line Interview Answer:

- final keyword is used to restrict inheritance,
  overriding, and value modification.


*/