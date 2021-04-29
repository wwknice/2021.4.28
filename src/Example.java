public class Example {
   String s = "Outer";
    public static void main(String[] args) {
        S2 s2 = new S2();
        s2.display();

    }
}

class  S1{
    String s = "S1";
    void display(){
        System.out.println(s);
    }
}
class  S2 extends S1{
    String s = "S2";
}