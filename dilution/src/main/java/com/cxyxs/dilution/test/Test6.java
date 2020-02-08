package com.cxyxs.dilution.test;

import com.cxyxs.dilution.util.InsertSortUtils;

import java.util.Arrays;

/**
 * Description： 【算法与结构】- 插入排序
 * 转发请注明来源  程序猿学社 - https://ithub.blog.csdn.net/
 * Author: 程序猿学社
 * Date:  2020/2/8 19:36
 * Modified By:
 */
public class Test6 {
    public static void main(String[] args) {
        //插入排序测试方法
        insertSort();
    }
    /**
     * 插入排序测试方法
     */
    public static void insertSort() {
        int[] insertSorts = {60, 71, 49, 11, 24, 3, 66};
        int[] ints = InsertSortUtils.insertSort(insertSorts);
        System.out.println("排序后的数组为：" + Arrays.toString(ints));
    }
}
