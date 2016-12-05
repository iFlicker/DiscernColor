package me.a0ff.discerncolor.ui.squareBundle.normalMode;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import me.a0ff.discerncolor.R;
import me.a0ff.discerncolor.api.SquareFragmentBundle;
import me.a0ff.discerncolor.ui.widget.SquareView;
import me.a0ff.discerncolor.util.RandomColorBuilder;

/**
 * Created by flicker on 16/11/21.
 */

public class FragmentNMc6 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c6_11) SquareView sq11;
    @BindView(R.id.c6_12) SquareView sq12;
    @BindView(R.id.c6_13) SquareView sq13;
    @BindView(R.id.c6_14) SquareView sq14;
    @BindView(R.id.c6_15) SquareView sq15;
    @BindView(R.id.c6_16) SquareView sq16;
    @BindView(R.id.c6_21) SquareView sq21;
    @BindView(R.id.c6_22) SquareView sq22;
    @BindView(R.id.c6_23) SquareView sq23;
    @BindView(R.id.c6_24) SquareView sq24;
    @BindView(R.id.c6_25) SquareView sq25;
    @BindView(R.id.c6_26) SquareView sq26;
    @BindView(R.id.c6_31) SquareView sq31;
    @BindView(R.id.c6_32) SquareView sq32;
    @BindView(R.id.c6_33) SquareView sq33;
    @BindView(R.id.c6_34) SquareView sq34;
    @BindView(R.id.c6_35) SquareView sq35;
    @BindView(R.id.c6_36) SquareView sq36;
    @BindView(R.id.c6_41) SquareView sq41;
    @BindView(R.id.c6_42) SquareView sq42;
    @BindView(R.id.c6_43) SquareView sq43;
    @BindView(R.id.c6_44) SquareView sq44;
    @BindView(R.id.c6_45) SquareView sq45;
    @BindView(R.id.c6_46) SquareView sq46;
    @BindView(R.id.c6_51) SquareView sq51;
    @BindView(R.id.c6_52) SquareView sq52;
    @BindView(R.id.c6_53) SquareView sq53;
    @BindView(R.id.c6_54) SquareView sq54;
    @BindView(R.id.c6_55) SquareView sq55;
    @BindView(R.id.c6_56) SquareView sq56;
    @BindView(R.id.c6_61) SquareView sq61;
    @BindView(R.id.c6_62) SquareView sq62;
    @BindView(R.id.c6_63) SquareView sq63;
    @BindView(R.id.c6_64) SquareView sq64;
    @BindView(R.id.c6_65) SquareView sq65;
    @BindView(R.id.c6_66) SquareView sq66;

    Unbinder unbinder;
    private Map<String, SquareView> sfm = new HashMap<>();
    private RandomColorBuilder rcb = new RandomColorBuilder();

    private final String current = "c6_";
    private int baseint = 6;      //6*6
    private String target;        //随机目标tmp

    public FragmentNMc6() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_square_c6, container, false);
        ButterKnife.bind(this, view);
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        contrlView();
        clickView();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @Override
    public void initView() {
        sfm.put("sq11", sq11);
        sfm.put("sq12", sq12);
        sfm.put("sq13", sq13);
        sfm.put("sq14", sq14);
        sfm.put("sq15", sq15);
        sfm.put("sq16", sq16);
        sfm.put("sq21", sq21);
        sfm.put("sq22", sq22);
        sfm.put("sq23", sq23);
        sfm.put("sq24", sq24);
        sfm.put("sq25", sq25);
        sfm.put("sq26", sq26);
        sfm.put("sq31", sq31);
        sfm.put("sq32", sq32);
        sfm.put("sq33", sq33);
        sfm.put("sq34", sq34);
        sfm.put("sq35", sq35);
        sfm.put("sq36", sq36);
        sfm.put("sq41", sq41);
        sfm.put("sq42", sq42);
        sfm.put("sq43", sq43);
        sfm.put("sq44", sq44);
        sfm.put("sq45", sq45);
        sfm.put("sq46", sq46);
        sfm.put("sq51", sq51);
        sfm.put("sq52", sq52);
        sfm.put("sq53", sq53);
        sfm.put("sq54", sq54);
        sfm.put("sq55", sq55);
        sfm.put("sq56", sq56);
        sfm.put("sq61", sq61);
        sfm.put("sq62", sq62);
        sfm.put("sq63", sq63);
        sfm.put("sq64", sq64);
        sfm.put("sq65", sq65);
        sfm.put("sq66", sq66);

    }

    @Override
    public void contrlView() {
        String[] tmp = rcb.getRandomColor(10);  //色差
        target = rcb.getRandomTarget(baseint);

        for (Map.Entry<String, SquareView> entry : sfm.entrySet())
            entry.getValue().setCcolor(Color.parseColor(tmp[0]));

        sfm.get("sq" + target).setCcolor(Color.parseColor(tmp[1]));
    }

    @Override
    public void clickView() {
        for (Map.Entry<String, SquareView> entry : sfm.entrySet())
            entry.getValue().setOnClickListener(new FragmentNMc6.SquareViewClickListener());
    }

    @Override
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
                Toast.makeText(getContext(), "成功击中目标", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "未击中目标", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
