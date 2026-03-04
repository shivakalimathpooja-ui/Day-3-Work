import java.util.ArrayList;
class Main1{
    public static void main(String[] args){
        ArrayList<String>names=new ArrayList<>();
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice");
        names.add(3,"Pooja");

        System.out.println(names);
        System.out.println(names.get(1));
        names.set(3,"Megha");
        names.remove(2);
        System.out.println(names);
        System.out.println(names.size());
        names.clear();
        System.out.println(names);
    }
}