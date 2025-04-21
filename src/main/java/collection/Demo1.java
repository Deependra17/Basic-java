package collection;

import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
//        obj.learnCollection();
//        obj.learnList();
//        obj.learnSet();
        obj.learnMap();
    }

    public void learnCollection() {
//        Collection<Integer> num = new ArrayList();
        Collection<Integer> num = new TreeSet<>();
        num.add(5);
        num.add(6);
        num.add(9);
        num.add(3);
//        for (int i : num) {
//            System.out.println(i * 2);
//        }
        Iterator<Integer> values = num.iterator(); //sort value in ascending order
        while (values.hasNext())
            System.out.println(values.next());
    }

    public void learnList() {
        List<Integer> num = new ArrayList();
        num.add(5);
        num.add(6);
        num.add(9);
        num.add(3);
//        System.out.println(num.indexOf(3));
//        System.out.println(num.get(0));
        System.out.println(num);
    }

    public void learnSet() {
//        Set<Integer> nums = new HashSet<>();
        Set<Integer> nums = new TreeSet();
        nums.add(5);
        nums.add(6);
        nums.add(9);
        nums.add(5);
        for (int n : nums) {
            System.out.println(n);
        }
    }

    public void learnMap() {
        Map<String, Integer> student = new HashMap<>();
//        Map<String, Integer> student = new Hashtable<>();
        student.put("Deepen", 25);
        student.put("Samip", 24);
        student.put("Amrit", 23);
        student.put("krischal", 23);
        student.put("Deepen", 28);

        System.out.println(student.keySet());
        System.out.println(student.values());
        for (String key : student.keySet()) {
            System.out.println(key + ": " + student.get(key));
        }
    }
}
