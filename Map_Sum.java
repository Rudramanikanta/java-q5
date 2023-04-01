import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Map_Sum{
    public static void main(String[] args) {
        List<Integer>Studen_1_Score=Arrays.asList(10,20,30,40);
        List<Integer>Studen_2_Score=Arrays.asList(10,20,30,4);
        Map<Integer,List<Integer>>Students=new HashMap<>();
        Students.put(1,Studen_1_Score);
        Students.put(2,Studen_2_Score);
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