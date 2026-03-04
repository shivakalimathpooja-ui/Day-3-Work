import java.util.ArrayList;
class Student{
    public static void main(String[] args){
        ArrayList<Integer> marks=new ArrayList<Integer>();
        marks.add(45);
        marks.add(89);
        marks.add(35);
        marks.add(90);
        marks.add(85);
        for(int mark:marks){
        System.out.println(mark);
        }
        int sum=0;
        for(int mark:marks){
            sum=sum+mark;
        }
        double average=(double) sum/marks.size();
        System.out.println("Average marks:"+average);
    }
}