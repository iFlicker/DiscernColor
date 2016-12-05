package me.a0ff.discerncolor;

import android.app.Application;
import android.util.DisplayMetrics;

/**
 * Created with Android Studio.
 * User: Flicker
 * Date: 16/12/5
 * Time: 下午4:34
 */

public class DiscernColorApplication extends Application {
    private int screenWidth;


    public DiscernColorApplication(){

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    //暂停Dialog宽属性
    public int getScreeenWidth(){
        DisplayMetrics dm = getResources().getDisplayMetrics();
        return dm.widthPixels;
    }
}
