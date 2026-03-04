import java.util.ArrayList;
class Product{
    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<String>();
        System.out.println("------Shopping Cart------");
        names.add("Laptop");
        names.add("Mouse");
        names.add("Keyboard");
        names.add("Monitor");
        names.add("Headphones");
        
        for(String name:names){
            System.out.println(name);
        }
        System.out.println("---------------------------");
    }
}