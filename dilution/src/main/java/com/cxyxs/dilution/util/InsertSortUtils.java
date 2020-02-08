package com.cxyxs.dilution.util;

import java.util.Arrays;

/**
 * Description：转发请注明来源  程序猿学社 - https://ithub.blog.csdn.net/
 * Author: 程序猿学社
 * Date:  2020/2/8 18:38
 * Modified By:
 */
public class InsertSortUtils {
    public  static  int[] insertSort(int[] insertSorts){
        //60,71,49,11,24,3,66
        System.out.println("排序的数组："+Arrays.toString(insertSorts));
        System.out.println();
        for (int i = 1; i < insertSorts.length ; i++) {
            System.out.println("待插入的值:"+insertSorts[i]);
            System.out.println("待排序之前的数组："+ Arrays.toString(insertSorts));
            for (int j = i; j > 0; j--) {
                if(insertSorts[j]<insertSorts[j-1]){
                    System.out.println("比较的值："+ insertSorts[j]+"和"+insertSorts[j-1]+","+insertSorts[j]+"大，交换位置");
                    changeValue(j,j-1,insertSorts);
                }else{
                    System.out.println("比较的值："+ insertSorts[j]+"和"+insertSorts[j-1]+","+insertSorts[j]+"大，保持不变");
                    break;
                }
            }
            System.out.println("第"+i+"轮:"+"排序后的数组为："+Arrays.toString(insertSorts));
            System.out.println();
        }
        return insertSorts;
    };

    /**
     * 交换两个值
     * @param before
     * @param after
     * @param insertSorts
     */
    public static  void changeValue(int before,int after,int[] insertSorts){
        int temp=insertSorts[before];
        insertSorts[before]=insertSorts[after];
        insertSorts[after]=temp;
    }
}
