import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Map_Sum{
    public static void main(String[] args) {
        List<Integer>st1=Arrays.asList(10,20,30,40);
        List<Integer>st2=Arrays.asList(10,20,30,4);
        Map<Integer,List<Integer>>Students=new HashMap<>();
        Students.put(1,st1);
        Students.put(2,st2);
        System.out.println(Students);
        Map<Integer,Integer>Stu_detail=new HashMap<>();

        for(Map.Entry<Integer,List<Integer>> one:Students.entrySet())
        {
            int sum=0;
            for(Integer Values:one.getValue())
            {
                sum=sum+Values;
            }
            System.out.println(sum);
            Stu_detail.put(one.getKey(),sum);
        }
        System.out.println(Stu_detail);
        



    }
}
