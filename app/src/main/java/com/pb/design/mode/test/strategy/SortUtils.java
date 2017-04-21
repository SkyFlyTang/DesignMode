package com.pb.design.mode.test.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skytang on 2017/4/21.
 */

public class SortUtils {
    ISort mISort;

    public SortUtils(ISort iSort) {
        mISort = iSort;

    }

    public void setmISort(ISort mISort) {
        this.mISort = mISort;
    }

    public void Sort(ArrayList<Integer> lists) {
        mISort.Sort(lists);
    }
}
