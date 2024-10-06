package different;

import demo.AccessModifiersDemo;

public class SubclassInDifferentPackage extends AccessModifiersDemo {
    public static void main(String[] args) {
        SubclassInDifferentPackage obj = new SubclassInDifferentPackage();

        // Accessing public members
        System.out.println(obj.publicVar);
        obj.publicMethod();

        // Accessing protected members
        System.out.println(obj.protectedVar);
        obj.protectedMethod();

        // Accessing default members (Not accessible)
        // System.out.println(obj.defaultVar); // Error
        // obj.defaultMethod(); // Error

        // Accessing private members (Not accessible)
        // System.out.println(obj.privateVar); // Error
        // obj.privateMethod(); // Error
    }
}
