package demo;

public class AccessModifiersDemopackage {
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        // Accessing public members
        System.out.println(obj.publicVar);
        obj.publicMethod();

        // Accessing private members (Not accessible)
        // System.out.println(obj.privateVar); // Error
        // obj.privateMethod(); // Error

        // Accessing protected members
        System.out.println(obj.protectedVar);
        obj.protectedMethod();

        // Accessing default members
        System.out.println(obj.defaultVar);
        obj.defaultMethod();
    }
}
