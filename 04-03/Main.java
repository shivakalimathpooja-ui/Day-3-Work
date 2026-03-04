import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Pooja");
        list.add("Sam");
        list.add("Viju");
        list.add(2,"Chitra");
        System.out.println(list);
        System.out.println(list.get(2));
    }
}