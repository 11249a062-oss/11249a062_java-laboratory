public class variablesdemo {
    int instancevar=10;
    static String staticvar="I am static";
    public void showvariables()
    {
        int localvar=5;
        System.out.println("Instance variable:"+instancevar);
        System.out.println("Static variable:"+staticvar);
        System.out.println("Local variable:"+localvar);
    }
    public static void main(String[]args)
    {
        variablesdemo obj1=new variablesdemo();
        obj1.showvariables();
        System.out.println("accessing static variable via classes:"+variablesdemo.staticvar);
    }
}