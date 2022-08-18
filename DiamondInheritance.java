interface First{

     default void display() {
        System.out.println("Display method of first.");       
    }
}

interface Second{

      default void display() {
        System.out.println("Display method of second.");
    }
}

public class DiamondInheritance implements First,Second{
    public void display(){
        First.super.display();
    }
    // This code will show how multiple inheritance works.
    public static void main(String[] args) {
        DiamondInheritance diamondInheritance = new DiamondInheritance();
        diamondInheritance.display();
    }
    
}
