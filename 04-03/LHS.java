import java.util.LinkedHashSet;
    class LHS{
        public static void main(String[] args){
            LinkedHashSet<String> names=new LinkedHashSet<>();
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
