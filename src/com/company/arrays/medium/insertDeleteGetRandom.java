package com.company.arrays.medium;

import java.util.List;
import java.util.Random;

public class insertDeleteGetRandom {

    List<Integer> list;
    public insertDeleteGetRandom(List<Integer> nums) {
        list = nums;
    }

    public boolean insert(int val) {
        //because if it's a set check if that value already exists
        if(list.contains(val)) {
            return false;
        } else {
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        if(list.contains(val)) {
            list.remove(val);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int rand = new Random().nextInt(list.size());
        return list.get(rand);
    }
}
