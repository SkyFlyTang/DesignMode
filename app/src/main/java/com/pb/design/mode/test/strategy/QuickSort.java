package com.pb.design.mode.test.strategy;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skytang on 2017/4/21.
 */

public class QuickSort implements ISort {
    @Override
    public void Sort(ArrayList<Integer> lists) {
        Log.i("skyt", "使用快速排序算法进行排序");
    }
}
