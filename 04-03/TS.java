import java.util.TreeSet;
class TS{
    public static void main(String[] args){
    TreeSet<String> names=new TreeSet<>();
    names.add("pooja");
    names.add("geeta");
    names.add("prajwal");
    names.add("gangadharayya");
    System.out.println(names);
    System.out.println(names.contains("pooja"));
    names.remove("pooja");
    System.out.println(names);
    System.out.println(names.size());
    names.clear();
    System.out.println(names);
}
}