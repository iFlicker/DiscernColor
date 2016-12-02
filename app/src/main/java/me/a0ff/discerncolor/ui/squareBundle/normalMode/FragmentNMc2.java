package me.a0ff.discerncolor.ui.squareBundle.normalMode;

import android.app.Fragment;
import android.graphics.Color;
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

import butterknife.BindView;
import butterknife.ButterKnife;
import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.api.SquareFragmentBundle;
import me.a0ff.discerncolor.ui.widget.SquareView;
import me.a0ff.discerncolor.util.RandomColorBuilder;

/**
 * Created by flicker on 16/11/21.
 */

public class FragmentNMc2 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c2_11)
    SquareView sq11;
    @BindView(R.id.c2_12)
    SquareView sq12;
    @BindView(R.id.c2_21)
    SquareView sq21;
    @BindView(R.id.c2_22)
    SquareView sq22;

    private Map<String, SquareView> sfm = new HashMap<>();
    private RandomColorBuilder rcb = new RandomColorBuilder();

    private final String current = "c2_";
    private int baseint = 2;      //2*2
    private String target;        //随机目标tmp

//    private SquareView sq11;
//    private SquareView sq12;
//    private SquareView sq21;
//    private SquareView sq22;

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
        ButterKnife.bind(this, view);   // 这儿 这儿 在这儿
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        initView();
        contrlView();
        clickView();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void initView() {

//        sq11 = (SquareView) getView().findViewById(R.id.c2_11);
//        sq12 = (SquareView) getView().findViewById(R.id.c2_12);
//        sq21 = (SquareView) getView().findViewById(R.id.c2_21);
//        sq22 = (SquareView) getView().findViewById(R.id.c2_22);

        sfm.put("sq11", sq11);
        sfm.put("sq12", sq12);
        sfm.put("sq21", sq21);
        sfm.put("sq22", sq22);
    }


    @Override
    public void contrlView() {
        // 妥了
        String[] tmp = rcb.getRandomColor(25);  //色差
        target = rcb.getRandomTarget(baseint);
        Log.i("Colorr",tmp[0]);
        Log.i("Colorr",tmp[1]);
        for (Map.Entry<String, SquareView> entry : sfm.entrySet()) {
            entry.getValue().setCcolor(Color.parseColor(tmp[0]));
        }
        sfm.get("sq" + target).setCcolor(Color.parseColor(tmp[1]));

    }

    @Override
    public void clickView() {

        for (Map.Entry<String, SquareView> entry : sfm.entrySet()) {
            entry.getValue().setOnClickListener(new SquareViewClickListener());
        }
    }

    public int getId(String sg) {
        int ret = 0;
        try {
            Field f = R.id.class.getField(sg);
            ret = f.getInt(new android.R.id());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return ret;
    }

    private class SquareViewClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {

            if (v.getId() == getId(current + target)) {
                Toast.makeText(getContext(), "成功击中目标aaaaaaaaaaa", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "未击中目标", Toast.LENGTH_SHORT).show();
            }

        }
    }

}
