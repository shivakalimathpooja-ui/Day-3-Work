import java.util.HashSet;
    class Main2{
        public static void main(String[] args){
            HashSet<String> names=new HashSet<>();
            names.add("Pooja");
            names.add("Sam");
            names.add("Chitra");
            names.add("Megha");
            System.out.println(names);
            System.out.println(names.contains("Sam"));
            names.remove("Pooja");
            System.out.println(names);
            System.out.println(names.size());
            names.clear();
            System.out.println(names);
        }
    }
