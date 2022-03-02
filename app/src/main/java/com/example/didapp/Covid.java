package com.example.didapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Covid extends Fragment {

    private View view;
    private TextView firstCntView;
    private TextView secondCntView;
    private TextView firstCnt1View;
    private TextView secondCnt1View;
    private TextView updateView;
    private TextView clearView;
    private TextView deathView;
    private TextView defCntView;
    private TextView incDecView;
    private TextView seoul1View;
    private TextView seoul2View;
    private TextView seoul3View;
    private TextView geom1View;
    private TextView geom2View;
    private TextView geom3View;
    private TextView jeju1View;
    private TextView jeju2View;
    private TextView jeju3View;
    private TextView gyeongnam1View;
    private TextView gyeongnam2View;
    private TextView gyeongnam3View;
    private TextView gyeongbuk1View;
    private TextView gyeongbuk2View;
    private TextView gyeongbuk3View;
    private TextView jeonnam1View;
    private TextView jeonnam2View;
    private TextView jeonnam3View;
    private TextView jeonbuk1View;
    private TextView jeonbuk2View;
    private TextView jeonbuk3View;
    private TextView chungnam1View;
    private TextView chungnam2View;
    private TextView chungnam3View;
    private TextView chungbuk1View;
    private TextView chungbuk2View;
    private TextView chungbuk3View;
    private TextView gangwon1View;
    private TextView gangwon2View;
    private TextView gangwon3View;
    private TextView gyeonggi1View;
    private TextView gyeonggi2View;
    private TextView gyeonggi3View;
    private TextView sejong1View;
    private TextView sejong2View;
    private TextView sejong3View;
    private TextView ulsan1View;
    private TextView ulsan2View;
    private TextView ulsan3View;
    private TextView daejeon1View;
    private TextView daejeon2View;
    private TextView daejeon3View;
    private TextView daegu1View;
    private TextView daegu2View;
    private TextView daegu3View;
    private TextView incheon1View;
    private TextView incheon2View;
    private TextView incheon3View;
    private TextView gwangju1View;
    private TextView gwangju2View;
    private TextView gwangju3View;
    private TextView busan1View;
    private TextView busan2View;
    private TextView busan3View;

    private String firstCnt;
    private String secondCnt;
    private String firstCnt1;
    private String secondCnt1;
    private String update;
    private String clear;
    private String death;
    private String defCnt;
    private String incDec;
    private String seoul1;
    private String seoul2;
    private String seoul3;
    private String busan1;
    private String busan2;
    private String busan3;
    private String gwangju1;
    private String gwangju2;
    private String gwangju3;
    private String daejeon1;
    private String daejeon2;
    private String daejeon3;
    private String incheon1;
    private String incheon2;
    private String incheon3;
    private String gyeonggi1;
    private String gyeonggi2;
    private String gyeonggi3;
    private String daegu1;
    private String daegu2;
    private String daegu3;
    private String ulsan1;
    private String ulsan2;
    private String ulsan3;
    private String sejong1;
    private String sejong2;
    private String sejong3;
    private String gangwon1;
    private String gangwon2;
    private String gangwon3;
    private String chungbuk1;
    private String chungbuk2;
    private String chungbuk3;
    private String chungnam1;
    private String chungnam2;
    private String chungnam3;
    private String jeonbuk1;
    private String jeonbuk2;
    private String jeonbuk3;
    private String jeonnam1;
    private String jeonnam2;
    private String jeonnam3;
    private String gyeongbuk1;
    private String gyeongbuk2;
    private String gyeongbuk3;
    private String gyeongnam1;
    private String gyeongnam2;
    private String gyeongnam3;
    private String jeju1;
    private String jeju2;
    private String jeju3;
    private String geom1;
    private String geom2;
    private String geom3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.covid, container, false);

        firstCntView = view.findViewById(R.id.firstCnt);
        secondCntView = view.findViewById(R.id.secondCnt);
        firstCnt1View = view.findViewById(R.id.firstCnt1);
        secondCnt1View = view.findViewById(R.id.secondCnt1);
        updateView = view.findViewById(R.id.update);
        clearView = view.findViewById(R.id.clear);
        deathView = view.findViewById(R.id.death);
        defCntView = view.findViewById(R.id.defCnt);
        incDecView = view.findViewById(R.id.incDec);
        seoul1View = view.findViewById(R.id.seoul1);
        seoul2View = view.findViewById(R.id.seoul2);
        seoul3View = view.findViewById(R.id.seoul3);
        busan1View = view.findViewById(R.id.busan1);
        busan2View = view.findViewById(R.id.busan2);
        busan3View = view.findViewById(R.id.busan3);
        daegu1View = view.findViewById(R.id.daegu1);
        daegu2View = view.findViewById(R.id.daegu2);
        daegu3View = view.findViewById(R.id.daegu3);
        daejeon1View = view.findViewById(R.id.daejeon1);
        daejeon2View = view.findViewById(R.id.daejeon2);
        daejeon3View = view.findViewById(R.id.daejeon3);
        gwangju1View = view.findViewById(R.id.gwangju1);
        gwangju2View = view.findViewById(R.id.gwangju2);
        gwangju3View = view.findViewById(R.id.gwangju3);
        ulsan1View = view.findViewById(R.id.ulsan1);
        ulsan2View = view.findViewById(R.id.ulsan2);
        ulsan3View = view.findViewById(R.id.ulsan3);
        sejong1View = view.findViewById(R.id.sejong1);
        sejong2View = view.findViewById(R.id.sejong2);
        sejong3View = view.findViewById(R.id.sejong3);
        gyeonggi1View = view.findViewById(R.id.gyeonggi1);
        gyeonggi2View = view.findViewById(R.id.gyeonggi2);
        gyeonggi3View = view.findViewById(R.id.gyeonggi3);
        gangwon1View = view.findViewById(R.id.gangwon1);
        gangwon2View = view.findViewById(R.id.gangwon2);
        gangwon3View = view.findViewById(R.id.gangwon3);
        chungbuk1View = view.findViewById(R.id.chungbuk1);
        chungbuk2View = view.findViewById(R.id.chungbuk2);
        chungbuk3View = view.findViewById(R.id.chungbuk3);
        chungnam1View = view.findViewById(R.id.chungnam1);
        chungnam2View = view.findViewById(R.id.chungnam2);
        chungnam3View = view.findViewById(R.id.chungnam3);
        jeonbuk1View = view.findViewById(R.id.jeonbuk1);
        jeonbuk2View = view.findViewById(R.id.jeonbuk2);
        jeonbuk3View = view.findViewById(R.id.jeonbuk3);
        jeonnam1View = view.findViewById(R.id.jeonnam1);
        jeonnam2View = view.findViewById(R.id.jeonnam2);
        jeonnam3View = view.findViewById(R.id.jeonnam3);
        gyeongbuk1View = view.findViewById(R.id.gyeongbuk1);
        gyeongbuk2View = view.findViewById(R.id.gyeongbuk2);
        gyeongbuk3View = view.findViewById(R.id.gyeongbuk3);
        gyeongnam1View = view.findViewById(R.id.gyeongnam1);
        gyeongnam2View = view.findViewById(R.id.gyeongnam2);
        gyeongnam3View = view.findViewById(R.id.gyeongnam3);
        incheon1View = view.findViewById(R.id.incheon1);
        incheon2View = view.findViewById(R.id.incheon2);
        incheon3View = view.findViewById(R.id.incheon3);
        jeju1View = view.findViewById(R.id.jeju1);
        jeju2View = view.findViewById(R.id.jeju2);
        jeju3View = view.findViewById(R.id.jeju3);
        geom1View = view.findViewById(R.id.geom1);
        geom2View = view.findViewById(R.id.geom2);
        geom3View = view.findViewById(R.id.geom3);



        if (getArguments() != null) {
            firstCnt = getArguments().getString("FRAG3_FCNT");
            secondCnt = getArguments().getString("FRAG3_SCNT");
            firstCnt1 = getArguments().getString("FRAG3_FCNT1");
            secondCnt1 = getArguments().getString("FRAG3_SCNT1");
            update = getArguments().getString("FRAG3_UPDATE");
            clear = getArguments().getString("FRAG3_CLEAR");
            death = getArguments().getString("FRAG3_DEATH");
            defCnt = getArguments().getString("FRAG3_DEFCNT");
            incDec = getArguments().getString("FRAG3_INCDEC");
            seoul1 = getArguments().getString("FRAG3_SEOUL1");
            seoul2 = "▲" + getArguments().getString("FRAG3_SEOUL2");
            seoul3 = getArguments().getString("FRAG3_SEOUL3");
            jeju1 = getArguments().getString("FRAG3_jeju1");
            jeju2 = "▲" + getArguments().getString("FRAG3_jeju2");
            jeju3 = getArguments().getString("FRAG3_jeju3");
            incheon1 = getArguments().getString("FRAG3_incheon1");
            incheon2 = "▲" + getArguments().getString("FRAG3_incheon2");
            incheon3 = getArguments().getString("FRAG3_incheon3");
            gyeongnam1 = getArguments().getString("FRAG3_gyeongnam1");
            gyeongnam2 = "▲" + getArguments().getString("FRAG3_gyeongnam2");
            gyeongnam3 = getArguments().getString("FRAG3_gyeongnam3");
            gyeongbuk1 = getArguments().getString("FRAG3_gyeongbuk1");
            gyeongbuk2 = "▲" + getArguments().getString("FRAG3_gyeongbuk2");
            gyeongbuk3 = getArguments().getString("FRAG3_gyeongbuk3");
            jeonnam1 = getArguments().getString("FRAG3_jeonnam1");
            jeonnam2 = "▲" + getArguments().getString("FRAG3_jeonnam2");
            jeonnam3 = getArguments().getString("FRAG3_jeonnam3");
            jeonbuk1 = getArguments().getString("FRAG3_jeonbuk1");
            jeonbuk2 = "▲" + getArguments().getString("FRAG3_jeonbuk2");
            jeonbuk3 = getArguments().getString("FRAG3_jeonbuk3");
            chungbuk1 = getArguments().getString("FRAG3_chungbuk1");
            chungbuk2 = "▲" + getArguments().getString("FRAG3_chungbuk2");
            chungbuk3 = getArguments().getString("FRAG3_chungbuk3");
            chungnam1 = getArguments().getString("FRAG3_chungnam1");
            chungnam2 = "▲" + getArguments().getString("FRAG3_chungnam2");
            chungnam3 = getArguments().getString("FRAG3_chungnam3");
            gangwon1 = getArguments().getString("FRAG3_gangwon1");
            gangwon2 = "▲" + getArguments().getString("FRAG3_gangwon2");
            gangwon3 = getArguments().getString("FRAG3_gangwon3");
            gyeonggi1 = getArguments().getString("FRAG3_gyeonggi1");
            gyeonggi2 = "▲" + getArguments().getString("FRAG3_gyeonggi2");
            gyeonggi3 = getArguments().getString("FRAG3_gyeonggi3");
            sejong1 = getArguments().getString("FRAG3_sejong1");
            sejong2 = "▲" + getArguments().getString("FRAG3_sejong2");
            sejong3 = getArguments().getString("FRAG3_sejong3");
            ulsan1 = getArguments().getString("FRAG3_ulsan1");
            ulsan2 = "▲" + getArguments().getString("FRAG3_ulsan2");
            ulsan3 = getArguments().getString("FRAG3_ulsan3");
            daejeon1 = getArguments().getString("FRAG3_daejeon1");
            daejeon2 = "▲" + getArguments().getString("FRAG3_daejeon2");
            daejeon3 = getArguments().getString("FRAG3_daejeon3");
            daegu1 = getArguments().getString("FRAG3_daegu1");
            daegu2 = "▲" + getArguments().getString("FRAG3_daegu2");
            daegu3 = getArguments().getString("FRAG3_daegu3");
            gwangju1 = getArguments().getString("FRAG3_gwangju1");
            gwangju2 = "▲" + getArguments().getString("FRAG3_gwangju2");
            gwangju3 = getArguments().getString("FRAG3_gwangju3");
            busan1 = getArguments().getString("FRAG3_busan1");
            busan2 = "▲" + getArguments().getString("FRAG3_busan2");
            busan3 = getArguments().getString("FRAG3_busan3");
            geom1 = getArguments().getString("FRAG3_geom1");
            geom2 = "▲" + getArguments().getString("FRAG3_geom2");
            geom3 = getArguments().getString("FRAG3_geom3");


            firstCntView.setText(firstCnt);
            secondCntView.setText(secondCnt);
            firstCnt1View.setText(firstCnt1);
            secondCnt1View.setText(secondCnt1);
            updateView.setText(update);
            clearView.setText(clear);
            deathView.setText(death);
            defCntView.setText(defCnt);
            incDecView.setText(incDec);
            seoul1View.setText(seoul1);
            seoul2View.setText(seoul2);
            seoul3View.setText(seoul3);
            busan1View.setText(busan1);
            busan2View.setText(busan2);
            busan3View.setText(busan3);
            gwangju1View.setText(gwangju1);
            gwangju2View.setText(gwangju2);
            gwangju3View.setText(gwangju3);
            daegu1View.setText(daegu1);
            daegu2View.setText(daegu2);
            daegu3View.setText(daegu3);
            daejeon1View.setText(daejeon1);
            daejeon2View.setText(daejeon2);
            daejeon3View.setText(daejeon3);
            ulsan1View.setText(ulsan1);
            ulsan2View.setText(ulsan2);
            ulsan3View.setText(ulsan3);
            sejong1View.setText(sejong1);
            sejong2View.setText(sejong2);
            sejong3View.setText(sejong3);
            gyeonggi1View.setText(gyeonggi1);
            gyeonggi2View.setText(gyeonggi2);
            gyeonggi3View.setText(gyeonggi3);
            gangwon1View.setText(gangwon1);
            gangwon2View.setText(gangwon2);
            gangwon3View.setText(gangwon3);
            chungbuk1View.setText(chungbuk1);
            chungbuk2View.setText(chungbuk2);
            chungbuk3View.setText(chungbuk3);
            chungnam1View.setText(chungnam1);
            chungnam2View.setText(chungnam2);
            chungnam3View.setText(chungnam3);
            jeonnam1View.setText(jeonnam1);
            jeonnam2View.setText(jeonnam2);
            jeonnam3View.setText(jeonnam3);
            jeonbuk1View.setText(jeonbuk1);
            jeonbuk2View.setText(jeonbuk2);
            jeonbuk3View.setText(jeonbuk3);
            gyeongbuk1View.setText(gyeongbuk1);
            gyeongbuk2View.setText(gyeongbuk2);
            gyeongbuk3View.setText(gyeongbuk3);
            gyeongnam1View.setText(gyeongnam1);
            gyeongnam2View.setText(gyeongnam2);
            gyeongnam3View.setText(gyeongnam3);
            jeju1View.setText(jeju1);
            jeju2View.setText(jeju2);
            jeju3View.setText(jeju3);
            incheon1View.setText(incheon1);
            incheon2View.setText(incheon2);
            incheon3View.setText(incheon3);
            geom1View.setText(geom1);
            geom2View.setText(geom2);
            geom3View.setText(geom3);

        }

        return view;
    }
}