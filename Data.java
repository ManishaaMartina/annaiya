public class Data{
    private int phNo,age;
    private double height;
    private String name;

    Data setPhone(int temp){
        phNo = temp;
        return this;
    }
    Data setAge(int temp){
        age = temp;
        return this;
    }
    Data setHeight(double temp){
        height = temp;
        return this;
    }
    Data setName(String temp){
        name = temp;
        return this;
    }

    public String toString(){
        return "\nName - "+name+"\nAge - "+age+"\nPhone - "+phNo+"\nHeight - "+height;
    }

    void printThis(){
        System.out.println(this);
    }
}