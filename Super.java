
class A{
    public A(){
        System.out.println("Chandu ke chacha");
    }
    public A(int a){
        System.out.println("Chachi ko chutni chatai"+a);
    }
    
}
class B extends A
{
    public B(){
        System.out.println("Chin dapak dum dum");
    }
    public B(int a){
        super();
        System.out.println("looool"+a);
    }
}
public class Super {
    public static void main(String[] args) {
        B obj = new B(1);
    }
}

