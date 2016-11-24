package me.a0ff.discerncolor.util;

/**
 * Created with Android Studio.
 * User: Flicker
 * Date: 16/11/24
 * Time: 下午10:42
 */

import java.util.Random;

/**
 * 生成随机颜色附色差
 * 生成2x2~9x9随机目标
 */

public class RandomColorBuilder {

    RandomColorBuilder(){
        initArray();
    }

    private Random rm = new Random();
    private static final int minC = 30;
    private static final int maxC = 240;
    private int[] c2 ;
    private int[] c3 ;
    private int[] c4 ;
    private int[] c5 ;
    private int[] c6 ;
    private int[] c7 ;
    private int[] c8 ;
    private int[] c9 ;

    //生成2x2~9x9随机目标,参数为2~9
    public String getRandomTarget(int i){
        int target = 0;
        switch (i){
            case 2:
                target = c2[rm.nextInt(i*i-1)];
                break;
            case 3:
                target = c3[rm.nextInt(i*i-1)];
                break;
            case 4:
                target = c4[rm.nextInt(i*i-1)];
                break;
            case 5:
                target = c5[rm.nextInt(i*i-1)];
                break;
            case 6:
                target = c6[rm.nextInt(i*i-1)];
                break;
            case 7:
                target = c7[rm.nextInt(i*i-1)];
                break;
            case 8:
                target = c8[rm.nextInt(i*i-1)];
                break;
            case 9:
                target = c9[rm.nextInt(i*i-1)];
                break;
            default:
                break;
        }
        return String.valueOf(target);
    }

    //生成随机颜色数组,参数为色差大小
    public String[] getRandomColor(int i){
        String tar[] = new String[2];


        return tar;
    }

    //--------------------------------------------------------------------------------------------//

    //初始化坐标数组
    private void initArray(){
        c2 = meI(buI(1,2) , buI(2,2));
        c3 = meI(meI(buI(1,3) , buI(2,3) ) , buI(3,3) );
        c4 = meI(meI(meI(buI(1,4) , buI(2,4) ) ,buI(3,4) ) , buI(4,4) );
        c5 = meI(meI(meI(meI(buI(1,5) , buI(2,5)), buI(3,5)) , buI(4,5)) , buI(5,5));
        c6 = meI(meI(meI(meI(meI(buI(1,6) , buI(2,6)) , buI(3,6)) , buI(4,6)) , buI(5,6)) , buI(6,6));
        c7 = meI(meI(meI(meI(meI(meI(buI(1,7) , buI(2,7)) , buI(3,7)) , buI(4,7)) , buI(5,7)) , buI(6,7)) , buI(7,7));
        c8 = meI(meI(meI(meI(meI(meI(meI(buI(1,8) , buI(2,8)) , buI(3,8)) , buI(4,8)) , buI(5,8)) , buI(6,8)) , buI(7,8)) , buI(8,8));
        c9 = meI(meI(meI(meI(meI(meI(meI(meI(buI(1,9) , buI(2,9)) , buI(3,9)) , buI(4,9)) , buI(5,9)) , buI(6,9)) , buI(7,9)) , buI(8,9)) , buI(9,9));
    }

    //生成十位a固定,个位1到b的数组
    private int[] buI (int a, int b) {
        int[] cur = new int[b];
        int start =  Integer.parseInt(String.valueOf(a)+"1");
        for (int i = 0; i < b; i++) {
            cur[i] = start++;
        }
        return cur;
    }

    //数组相加
    private int[] meI (int[] a, int[] b) {
        int[] c= new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
    //--------------------------------------------------------------------------------------------//

}
