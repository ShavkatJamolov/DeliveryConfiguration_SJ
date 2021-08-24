//import sun.reflect.generics.tree.Tree;

import java.util.*;

public class DataPractice {

    public static void main (String[] args){

        ArrayList <String> arr1=new ArrayList<>();
        arr1.add("NPD");
        arr1.add("Boston");
       arr1.add("New York");

       System.out.println(arr1);

      arr1.remove("NPD");
        System.out.println(arr1);

        System.out.println("======================");


        LinkedList<String> arr2=new LinkedList<>();
        arr2.add("pqm");
        arr2.add("java");
        arr2.add("tea");

        System.out.println(arr2);
        arr2.remove(1);
        System.out.println(arr2);

        System.out.println("======================");

        //SET EXAMPLES:

        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,9,9,9,9));
        System.out.println("HashSet : "+s1);

        System.out.println("=============================");

        Map<String, Integer> map1 =new HashMap<>();//random
        Map<String, Integer> map2 =new TreeMap<>();//always sorted
        Map<String,Integer> map3 =new LinkedHashMap<>(); //keeps the insertion order as it is
        Map<String,Integer> map4 =new Hashtable<>(); //thread safe

        System.out.println("==============================");

        Map<String, Double> employees=new LinkedHashMap<>();
        employees.put("John",200.00);
        employees.put("Tony",300.00);
        employees.put("Maria",400.00);
        System.out.println(employees);







    }


}
