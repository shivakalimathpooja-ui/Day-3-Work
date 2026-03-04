import java.util.LinkedList;
class Java{
    public static void main(String[] args){
        LinkedList<String>names=new LinkedList<String>();
        names.addFirst("Pooja");
        names.addLast("Shivakalimath");
        names.addFirst("Ms");
        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        names.removeFirst();
        System.out.println(names);
        names.removeLast();
        System.out.println(names);
    }
}