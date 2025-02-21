package com.acme.algorithms.recursion;

import java.util.*;

public class KFrequentElements {

    public static void main(String[] args) {
        //Input: nums = [1,1,1,2,2,3], k = 2
        //Output: [1,2]

        Integer[] array = {1, 1, 1, 2, 2, 3};
        Integer k = 2;

        List<Integer> l = Arrays.asList(array);

        Set<Integer> s = new HashSet<>(l);

        Map<Integer, Integer> map = new HashMap<>();

        Iterator<Integer> ite = s.iterator();

        while(ite.hasNext()) {

            Integer i = ite.next();
            map.put(i, 0);
        }

        System.out.println(map);

        // Input: nums = [1,1,1,2,2,3], k = 2
        for(int i = 0; i < array.length; i++) {

            if(map.containsKey(array[i])) {
                int r = map.get(array[i]);

                map.put(array[i], r + 1);
            }

        }

        System.out.println(map);

        Map<Integer, Integer> mapResult = new HashMap<>();

        // Remove the items greater than k
        map.entrySet().forEach(i -> {
                    if (map.get(i.getValue()) <= k) {
                        mapResult.put(i.getKey(), i.getValue());
                    }

                });

        System.out.println(mapResult);

    }
}
