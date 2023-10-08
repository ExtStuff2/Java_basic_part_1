import java.util.ArrayList;
import java.util.List;

public class HW_3 {
    public static void main(String[] args) {
        //Task_3_1
        String flowersName = "Roses";
        int flowersNumber = 101;
        System.out.println( "1 ->> " + flowersName + " 2 ->> " + Integer.toString(flowersNumber));
        int a = 15, b = 10; System.out.println( "Sum ->> " + Integer.toString(a+b));
        int c = a+b; System.out.println("Result (c) ->> " + Integer.toString(c));

        List<Integer> list = new ArrayList<Integer>(); list.add(1); list.add(2); list.add(3);
        int d = list.get(0), e = list.get(1), f =  list.get(2); System.out.println("Sum of d, e ,f ->> " + Integer.toString(d + e + f));

        list.add(0,1); list.add(1,1); list.add(2,1);list.add(3,1);
        int g = list.get(0), h = list.get(1), i =  list.get(2), j =  list.get(3); System.out.println("Sum of g,h,i,j ->> " + Integer.toString(g + h + i + j));
    }
}
