package com.cxyxs.dilution.test;

import com.cxyxs.dilution.util.DilutionUtils;
import com.cxyxs.dilution.util.InsertSortUtils;

import java.util.Arrays;

/**
 * Description：【算法与结构】- 稀释数组
 * 转发请注明来源  程序猿学社 - https://ithub.blog.csdn.net/
 * Author: 程序猿学社
 * Date:  2020/2/3 21:57
 * Modified By:
 */
public class Test5 {
    public static void main(String[] args) {
        //稀疏数组
        testSparse();
    }

    /**
     * 测试稀疏数组
     */
    public static void testSparse() {
        //创建一个9*9的二维数组 0 无效棋子  1白子 2黑子
        int[][] lists = new int[9][9];
        lists[1][3] = 1;
        lists[2][3] = 2;
        lists[5][4] = 2;
        lists[6][4] = 1;
        System.out.println("-----------打印初始化的二维数组----------");
        DilutionUtils.printArray(lists);
        System.out.println();

        System.out.println("------------把二维数组转为稀疏数组---------");
        int[][] sparseArray = DilutionUtils.getSparseArray(lists);
        DilutionUtils.printArray(sparseArray);
        System.out.println();

        System.out.println("------------稀疏数组持久化到磁盘---------");
        String path = "D:\\ftp\\a\\1.txt";
        DilutionUtils.sparseToFile(sparseArray, path);
        System.out.println();

        System.out.println("-----------从磁盘中转换成稀疏数据--------");
        int[][] fileToSparse = DilutionUtils.fileToSparse(path);
        DilutionUtils.printArray(fileToSparse);
        System.out.println();

        System.out.println("-----------把稀疏数据转为二维数组--------");
        int[][] sparseToArray = DilutionUtils.sparseToArray(fileToSparse);
        DilutionUtils.printArray(sparseToArray);
        System.out.println();
    }
}
