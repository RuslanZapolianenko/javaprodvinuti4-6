package package2;

public class B extends A{

    public void myMethodB(int myInt) {
        System.out.println("myMethodB "  + myInt);
    }

    @Override
    public void myMethodA(String myStr){
        String aB = myStr + " "  + myStr + " " + myStr;
    }
}
