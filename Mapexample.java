package collection;
import java.util.*;
public class Mapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<String,Integer> course=new HashMap();
        course.put("java", 50000);
        course.put("python", 9000);
        course.put("spring", 809600);
        course.put("ruby", 20000);
        course.put("ruby", 60000);//duplicate key not allowed
        System.out.println(course);
        System.out.println("java course_Fees="+course.get("java"));
        System.out.println("____foreach_______");
        course.forEach((e1,e2)->
        //course.forEach((Key,Value)->
        {
        	System.out.println(e1+">"+e2);
        });
        
        
	}

}
