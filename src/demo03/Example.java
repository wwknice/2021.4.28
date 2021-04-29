package demo03;

public class Example {

        int i = 100;

        public void print(){
            System.out.println(50);
        }

        public static void main(String[] args){
            Example a = new A();
            System.out.println(a.i);
            a.print();
        }



}

 class A extends Example{
    int i = 200;

    public void print(){
        System.out.println(300);
    }
}
