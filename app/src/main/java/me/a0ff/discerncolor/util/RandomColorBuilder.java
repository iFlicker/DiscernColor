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

    public RandomColorBuilder(){
        initArray();
    }

    private Random rm = new Random();
    private static final int minC = 30;
    private static final int maxC = 225;
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
                target = c2[rm.nextInt(i*i)];
                break;
            case 3:
                target = c3[rm.nextInt(i*i)];
                break;
            case 4:
                target = c4[rm.nextInt(i*i)];
                break;
            case 5:
                target = c5[rm.nextInt(i*i)];
                break;
            case 6:
                target = c6[rm.nextInt(i*i)];
                break;
            case 7:
                target = c7[rm.nextInt(i*i)];
                break;
            case 8:
                target = c8[rm.nextInt(i*i)];
                break;
            case 9:
                target = c9[rm.nextInt(i*i)];
                break;
            default:
                break;
        }
        return String.valueOf(target);
    }

    //TODO:色差目前为三位分开浮动,预按需加参,两级难度调节
    //生成随机颜色数组,参数为色差大小(建议5/10/15/20/25)
    public String[] getRandomColor(int i){
        String tar[] = new String[2];
        int ih[] = new int[3];

        //生成 #(30~225)(30~225)(30~225) 随机颜色(10进制)
        ih[0] = rm.nextInt(maxC-minC+1)+minC;
        ih[1] = rm.nextInt(maxC-minC+1)+minC;
        ih[2] = rm.nextInt(maxC-minC+1)+minC;

        //生成众色 类#ffffff
        tar[0] = "#"
                + toHexStringP(ih[0])
                + toHexStringP(ih[1])
                + toHexStringP(ih[2]);

        //生成独色 ,三位随机增减i
        ih[0] = brP(ih[0],i);
        ih[1] = brP(ih[1],i);
        ih[2] = brP(ih[2],i);
        tar[1] = "#"
                + toHexStringP(ih[0])
                + toHexStringP(ih[1])
                + toHexStringP(ih[2]);

        return tar;
    }
    //转十六进制一位前自动补零
    private String toHexStringP(int i){
        String tmmp = String.valueOf(Integer.toHexString(i));
        if (tmmp.length()==1)
            tmmp = "0" + tmmp;
        return tmmp;
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

    //三位随机增减,n为传入数值 i为增减值
    private int brP(int n, int i){
        if (rm.nextInt(2)==0){
            n = n + i;
        }else {
            n = n - i;
        }
        return n;
    }
    //--------------------------------------------------------------------------------------------//

}
