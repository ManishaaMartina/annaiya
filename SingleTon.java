public class SingleTon{
    int a=999;
    
    static SingleTon sc = new SingleTon();
    
    private SingleTon(){}

    static SingleTon getObject(){
        return sc;
    }

    void printSomeX(){
        System.out.println("SomeX");
    }
}