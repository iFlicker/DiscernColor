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

public class FragmentNMc9 extends Fragment implements SquareFragmentBundle {

    @BindView(R.id.c9_11) SquareView sq11;
    @BindView(R.id.c9_12) SquareView sq12;
    @BindView(R.id.c9_13) SquareView sq13;
    @BindView(R.id.c9_14) SquareView sq14;
    @BindView(R.id.c9_15) SquareView sq15;
    @BindView(R.id.c9_16) SquareView sq16;
    @BindView(R.id.c9_17) SquareView sq17;
    @BindView(R.id.c9_18) SquareView sq18;
    @BindView(R.id.c9_19) SquareView sq19;
    @BindView(R.id.c9_21) SquareView sq21;
    @BindView(R.id.c9_22) SquareView sq22;
    @BindView(R.id.c9_23) SquareView sq23;
    @BindView(R.id.c9_24) SquareView sq24;
    @BindView(R.id.c9_25) SquareView sq25;
    @BindView(R.id.c9_26) SquareView sq26;
    @BindView(R.id.c9_27) SquareView sq27;
    @BindView(R.id.c9_28) SquareView sq28;
    @BindView(R.id.c9_29) SquareView sq29;
    @BindView(R.id.c9_31) SquareView sq31;
    @BindView(R.id.c9_32) SquareView sq32;
    @BindView(R.id.c9_33) SquareView sq33;
    @BindView(R.id.c9_34) SquareView sq34;
    @BindView(R.id.c9_35) SquareView sq35;
    @BindView(R.id.c9_36) SquareView sq36;
    @BindView(R.id.c9_37) SquareView sq37;
    @BindView(R.id.c9_38) SquareView sq38;
    @BindView(R.id.c9_39) SquareView sq39;
    @BindView(R.id.c9_41) SquareView sq41;
    @BindView(R.id.c9_42) SquareView sq42;
    @BindView(R.id.c9_43) SquareView sq43;
    @BindView(R.id.c9_44) SquareView sq44;
    @BindView(R.id.c9_45) SquareView sq45;
    @BindView(R.id.c9_46) SquareView sq46;
    @BindView(R.id.c9_47) SquareView sq47;
    @BindView(R.id.c9_48) SquareView sq48;
    @BindView(R.id.c9_49) SquareView sq49;
    @BindView(R.id.c9_51) SquareView sq51;
    @BindView(R.id.c9_52) SquareView sq52;
    @BindView(R.id.c9_53) SquareView sq53;
    @BindView(R.id.c9_54) SquareView sq54;
    @BindView(R.id.c9_55) SquareView sq55;
    @BindView(R.id.c9_56) SquareView sq56;
    @BindView(R.id.c9_57) SquareView sq57;
    @BindView(R.id.c9_58) SquareView sq58;
    @BindView(R.id.c9_59) SquareView sq59;
    @BindView(R.id.c9_61) SquareView sq61;
    @BindView(R.id.c9_62) SquareView sq62;
    @BindView(R.id.c9_63) SquareView sq63;
    @BindView(R.id.c9_64) SquareView sq64;
    @BindView(R.id.c9_65) SquareView sq65;
    @BindView(R.id.c9_66) SquareView sq66;
    @BindView(R.id.c9_67) SquareView sq67;
    @BindView(R.id.c9_68) SquareView sq68;
    @BindView(R.id.c9_69) SquareView sq69;
    @BindView(R.id.c9_71) SquareView sq71;
    @BindView(R.id.c9_72) SquareView sq72;
    @BindView(R.id.c9_73) SquareView sq73;
    @BindView(R.id.c9_74) SquareView sq74;
    @BindView(R.id.c9_75) SquareView sq75;
    @BindView(R.id.c9_76) SquareView sq76;
    @BindView(R.id.c9_77) SquareView sq77;
    @BindView(R.id.c9_78) SquareView sq78;
    @BindView(R.id.c9_79) SquareView sq79;
    @BindView(R.id.c9_81) SquareView sq81;
    @BindView(R.id.c9_82) SquareView sq82;
    @BindView(R.id.c9_83) SquareView sq83;
    @BindView(R.id.c9_84) SquareView sq84;
    @BindView(R.id.c9_85) SquareView sq85;
    @BindView(R.id.c9_86) SquareView sq86;
    @BindView(R.id.c9_87) SquareView sq87;
    @BindView(R.id.c9_88) SquareView sq88;
    @BindView(R.id.c9_89) SquareView sq89;
    @BindView(R.id.c9_91) SquareView sq91;
    @BindView(R.id.c9_92) SquareView sq92;
    @BindView(R.id.c9_93) SquareView sq93;
    @BindView(R.id.c9_94) SquareView sq94;
    @BindView(R.id.c9_95) SquareView sq95;
    @BindView(R.id.c9_96) SquareView sq96;
    @BindView(R.id.c9_97) SquareView sq97;
    @BindView(R.id.c9_98) SquareView sq98;
    @BindView(R.id.c9_99) SquareView sq99;

    Unbinder unbinder;
    private Map<String, SquareView> sfm = new HashMap<>();
    private RandomColorBuilder rcb = new RandomColorBuilder();

    private final String current = "c9_";
    private int baseint = 9;      //9*9
    private String target;        //随机目标tmp

    public FragmentNMc9() {
        super();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_square_c9, container, false);
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
        sfm.put("sq17", sq17);
        sfm.put("sq18", sq18);
        sfm.put("sq19", sq19);
        sfm.put("sq21", sq21);
        sfm.put("sq22", sq22);
        sfm.put("sq23", sq23);
        sfm.put("sq24", sq24);
        sfm.put("sq25", sq25);
        sfm.put("sq26", sq26);
        sfm.put("sq27", sq27);
        sfm.put("sq28", sq28);
        sfm.put("sq29", sq29);
        sfm.put("sq31", sq31);
        sfm.put("sq32", sq32);
        sfm.put("sq33", sq33);
        sfm.put("sq34", sq34);
        sfm.put("sq35", sq35);
        sfm.put("sq36", sq36);
        sfm.put("sq37", sq37);
        sfm.put("sq38", sq38);
        sfm.put("sq39", sq39);
        sfm.put("sq41", sq41);
        sfm.put("sq42", sq42);
        sfm.put("sq43", sq43);
        sfm.put("sq44", sq44);
        sfm.put("sq45", sq45);
        sfm.put("sq46", sq46);
        sfm.put("sq47", sq47);
        sfm.put("sq48", sq48);
        sfm.put("sq49", sq49);
        sfm.put("sq51", sq51);
        sfm.put("sq52", sq52);
        sfm.put("sq53", sq53);
        sfm.put("sq54", sq54);
        sfm.put("sq55", sq55);
        sfm.put("sq56", sq56);
        sfm.put("sq57", sq57);
        sfm.put("sq58", sq58);
        sfm.put("sq59", sq59);
        sfm.put("sq61", sq61);
        sfm.put("sq62", sq62);
        sfm.put("sq63", sq63);
        sfm.put("sq64", sq64);
        sfm.put("sq65", sq65);
        sfm.put("sq66", sq66);
        sfm.put("sq67", sq67);
        sfm.put("sq68", sq68);
        sfm.put("sq69", sq69);
        sfm.put("sq71", sq71);
        sfm.put("sq72", sq72);
        sfm.put("sq73", sq73);
        sfm.put("sq74", sq74);
        sfm.put("sq75", sq75);
        sfm.put("sq76", sq76);
        sfm.put("sq77", sq77);
        sfm.put("sq78", sq78);
        sfm.put("sq79", sq79);
        sfm.put("sq81", sq81);
        sfm.put("sq82", sq82);
        sfm.put("sq83", sq83);
        sfm.put("sq84", sq84);
        sfm.put("sq85", sq85);
        sfm.put("sq86", sq86);
        sfm.put("sq87", sq87);
        sfm.put("sq88", sq88);
        sfm.put("sq89", sq89);
        sfm.put("sq91", sq91);
        sfm.put("sq92", sq92);
        sfm.put("sq93", sq93);
        sfm.put("sq94", sq94);
        sfm.put("sq95", sq95);
        sfm.put("sq96", sq96);
        sfm.put("sq97", sq97);
        sfm.put("sq98", sq98);
        sfm.put("sq99", sq99);
    }

    @Override
    public void contrlView() {
        String[] tmp = rcb.getRandomColor(3);  //色差
        target = rcb.getRandomTarget(baseint);

        for (Map.Entry<String, SquareView> entry : sfm.entrySet())
            entry.getValue().setCcolor(Color.parseColor(tmp[0]));

        sfm.get("sq" + target).setCcolor(Color.parseColor(tmp[1]));
    }

    @Override
    public void clickView() {
        for (Map.Entry<String, SquareView> entry : sfm.entrySet())
            entry.getValue().setOnClickListener(new FragmentNMc9.SquareViewClickListener());

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
