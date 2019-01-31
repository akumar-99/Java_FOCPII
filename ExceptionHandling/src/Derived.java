import java.lang.*;
class Base {
    Base() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}

class Derived extends Base {
    Derived() {
       super();
       //Error exception caught
    }
    public static void main(String[] args) {
        try {
            Derived d = new Derived();
        }
        catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        catch(RuntimeException re){}
    }
}