package me.a0ff.discerncolor.ui.squareBundle.normalMode;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.api.SquareFragmentBundle;
import me.a0ff.discerncolor.ui.widget.SquareView;

/**
 * Created by flicker on 16/11/21.
 */

public class FragmentNMc2 extends Fragment implements SquareFragmentBundle {

    private Map<String,SquareView> sfm = new HashMap<>();

    //测试用例
    private int seed = 21;

    private SquareView sq11;
    private SquareView sq12;
    private SquareView sq21;
    private SquareView sq22;

    public FragmentNMc2() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_square_c2, container, false);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initView();

        clickView();

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }


    @Override
    public void initView() {

        sq11 = (SquareView) getView().findViewById(R.id.c2_11);
        sq12 = (SquareView) getView().findViewById(R.id.c2_12);
        sq21 = (SquareView) getView().findViewById(R.id.c2_21);
        sq22 = (SquareView) getView().findViewById(R.id.c2_22);
        sfm.put("sq11",sq11);
        sfm.put("sq12",sq12);
        sfm.put("sq21",sq21);
        sfm.put("sq22",sq22);

    }


    @Override
    public void contrlView() {

    }

    @Override
    public void clickView() {

        sq11.setOnClickListener(new SquareViewClickListener());
        sq12.setOnClickListener(new SquareViewClickListener());
        sq21.setOnClickListener(new SquareViewClickListener());
        sq22.setOnClickListener(new SquareViewClickListener());
    }

    public int getId(String sg){
        int ret = 0;
        try {
            Field f = R.id.class.getField(sg);
            ret =  f.getInt(new android.R.id());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return ret;
    }

    private class SquareViewClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {

            if (v.getId() == getId("c2_11")){
                Toast.makeText(getContext(),"成功击中目标",Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(),"未击中目标",Toast.LENGTH_SHORT).show();
            }

        }
    }

}
