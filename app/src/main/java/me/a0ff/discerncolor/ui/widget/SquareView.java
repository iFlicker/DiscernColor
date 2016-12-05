package me.a0ff.discerncolor.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.util.RandomColorBuilder;

/**
 * Created by flicker on 16/7/24.
 */
public class SquareView extends View {

    private int Ccolor;//主色
    private int Bcolor;//背景色
    private int maxNumOfGrid = 2;//横向最大格子数

    private Context context;

    private int w_view;
    private int h_view;
    private Paint mPaint;

    public SquareView(Context context) {
        this(context,null);
    }

    public SquareView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SquareView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,0);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public SquareView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.context = context;
        TypedArray a = context.getTheme().
                obtainStyledAttributes(attrs,R.styleable.SquareView,defStyleAttr,defStyleRes);

        Ccolor = a.getColor(R.styleable.SquareView_Ccolor,Color.BLACK);
        Bcolor = a.getColor(R.styleable.SquareView_Bcolor,Color.WHITE);
        maxNumOfGrid = a.getInteger(R.styleable.SquareView_maxNumOfGrid,0);

        a.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = 0, height = 0;
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        switch (widthMode){
            case MeasureSpec.AT_MOST:
                width = getScreen("w");
                break;
            case MeasureSpec.EXACTLY:
                width = widthSize;
                break;
            case MeasureSpec.UNSPECIFIED:
                width = widthSize;
                break;
        }
        switch (heightMode){
            case MeasureSpec.AT_MOST:
                height = getScreen("h");
                break;
            case MeasureSpec.EXACTLY:
                height = heightSize;
                break;
            case MeasureSpec.UNSPECIFIED:
                height = heightSize;
                break;
        }

        w_view = width;
        h_view = height;
        //设置SquareView宽高
        setMeasuredDimension(width/maxNumOfGrid,width/maxNumOfGrid);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Ccolor);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(3);
        canvas.drawColor(Bcolor);
        //细节化圆角矩形
        //TODO: 圆角参数搞定
        float tmp = 3.17647059F;
        int xtmp = (int)(w_view/2/maxNumOfGrid/tmp);
        //TODO: 目前间距为2,略为奇怪,待细调
        RectF r = new RectF( 2 , 2 , w_view/maxNumOfGrid - 2 , w_view/maxNumOfGrid - 2 );
        canvas.drawRoundRect(r,xtmp,xtmp,mPaint);

    }
    public void setCcolor(int Cc){
        Ccolor = Cc;
        Bcolor = Color.WHITE;
        invalidate();
    }
    public int getScreen(String c) {
        DisplayMetrics dm = getResources().getDisplayMetrics();
        if ( c.equals("w") ) {
            return (int) dm.widthPixels;
        } else if ( c.equals("h") ) {
            return (int) dm.heightPixels;
        }
        return 0;
    }
}
