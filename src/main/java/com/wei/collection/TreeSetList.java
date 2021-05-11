package com.wei.collection;

import java.util.TreeSet;

public class TreeSetList {
    public static void main(String[] args) {
        TreeSet<String> aa = new TreeSet<>();
        System.out.println(aa.size());
        aa.add("Hank");
        aa.add("Eve");
        aa.add("Tom");
        System.out.println(aa.size());
        System.out.println(aa);//treeset沒有排序功能
        for(String a : aa){
            System.out.println(a);
        }
    }

/*        int[] nums = new int[5];
        nums[0] = 3;
//        nums[3] = "Hank";
//        nums[2] = true;
        ArrayList list = new ArrayList();
        list.add("Hank");
        list.add(123);
        list.add(true);
        Box1 box = new Box1();
        list.add(box);
        // Heterogeneous NG!?
        String name = (String)list.get(0);
        String kk = (String)list.get(1);
        //
        Box1 box1 = new Box1();
        Box2 box2 = new Box2();
        ArrayList<Box> boxes = new ArrayList<Box>();
        boxes.add(box1);
        boxes.add(box2);
        Box b = boxes.get(0);
*/

}
