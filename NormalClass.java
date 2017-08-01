public class NormalClass{
    public static void main(String... a){
        SingleTon st = SingleTon.getObject();
        System.out.println(st.a);
        st.a=9090;
        System.out.println(st.a);
        st.printSomeX();
        
        SingleTon st2 = SingleTon.getObject();
        st2.printSomeX();
        System.out.println(st.a);
    }
}