package com.example.tzj;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;

public class jieguo extends AppCompatActivity {
    private TextView getBMI;
    private TextView getTizhilv;
    private TextView getJRL;
    private TextView getTSFL;
    private TextView getDX;
    private TextView getGZ;
    private TextView getSUM;
    private TextView getSG;
    private TextView getTZ;
    private TextView xgetSG;
    private TextView xgetTZ;
    private TextView xgetBMI;
    private TextView xgetTZL;
    private TextView xgetJRL;
    private TextView xgetSFL;
    private TextView xgetGZ;
    private TextView xgetDX;
    private TextView xgetPJ;
    private TextView P1x;
    private TextView P2x;
    private TextView P3x;
    private TextView P4x;
    private TextView P5x;
    private String P1;
    private String P2;
    private String P3;
    private String P4;
    private String P5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jieguo);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar !=null){
            actionBar.hide();
        }
        getBMI = (TextView)findViewById(R.id.text_view012);
        getTizhilv = (TextView)findViewById(R.id.text_view2);
        getJRL = (TextView)findViewById(R.id.text_view8);
        getTSFL = (TextView)findViewById(R.id.text_view5);
        getDX = (TextView)findViewById(R.id.text_view14);
        getGZ = (TextView)findViewById(R.id.text_view11);
        getSUM = (TextView)findViewById(R.id.text_view0001);
        getSG = (TextView)findViewById(R.id.text_view002);
        getTZ = (TextView)findViewById(R.id.text_view022);
        xgetSG = (TextView)findViewById(R.id.text_view003);
        xgetTZ = (TextView)findViewById(R.id.text_view023);
        xgetBMI = (TextView)findViewById(R.id.text_view013);
        xgetTZL = (TextView)findViewById(R.id.text_view3);
        xgetJRL = (TextView)findViewById(R.id.text_view9);
        xgetSFL = (TextView)findViewById(R.id.text_view6);
        xgetGZ = (TextView)findViewById(R.id.text_view12);
        xgetDX = (TextView)findViewById(R.id.text_view15);
        xgetPJ = (TextView)findViewById(R.id.text_view0002);



        Bundle bundle = getIntent().getExtras();
        double a = bundle.getDouble("BMI");
        double b = bundle.getDouble("TZL");
        double c = bundle.getDouble("JRL");
        double d = bundle.getDouble("TS");
        double e = bundle.getDouble("DX");
        double f = bundle.getDouble("GZ");
        double h = bundle.getDouble("SG");
        double i = bundle.getDouble("TZ");
        int zhishu = bundle.getInt("ZS");


        //评价
        int BMIdefen = 1;
        int TZLdefen = 1;
        int JRLdefen = 1;
        int SFLdefen = 1;
        int GZdefen = 1;
        int DXdefen = 1;
        //男

        if(zhishu==1)
        {
            double biaozhun = (h*100-80)*0.7;
            if(h*100<160)
                xgetSG.setText("偏低");
            else
                xgetSG.setText("标准");


            if(biaozhun*0.9<=i&&biaozhun*1.1>=i)
                xgetTZ.setText("正常");
            else
                if(biaozhun*0.8<i&&biaozhun*0.9>i)
                xgetTZ.setText("偏轻");
                else
                    if(i>biaozhun*1.1&&i<biaozhun*1.2)
                        xgetTZ.setText("偏重");
                    else
                        if(i<=biaozhun*0.8)
                            xgetTZ.setText("营养不良");
                        else
                            if(i>=biaozhun*1.2)
                            xgetTZ.setText("肥胖");



            if(a>=10&&a<=18.5)
            {
                BMIdefen = 75;
                xgetBMI.setText("过轻");
            }
            else
            if(18.5<a&&a<=24)
            {
                BMIdefen = 100;
                xgetBMI.setText("正常");
            }
            else
            if(24<a&&a<=28)
            {
                BMIdefen = 80;
                xgetBMI.setText("超重");
            }
            else
            if(28<a&&a<=35)
            {
                BMIdefen = 60;
                xgetBMI.setText("肥胖");
            }
            else
                xgetBMI.setText("超出范围");


            if(0.08<b/100&&b/100<=0.15)
            {
                TZLdefen = 70;
                xgetTZL.setText("过瘦");
            }
            else
                if(0.15<b/100&&b/100<=0.25)
                {
                    TZLdefen = 100;
                    xgetTZL.setText("正常");
                }
                else
                    if(0.25<b/100&&b<=0.35/100)
                    {
                        TZLdefen = 70;
                        xgetTZL.setText("超重");
                    }
                    else
                        xgetTZL.setText("超出范围");


            if(c<=0.6)
            {
                JRLdefen = 60;
                xgetJRL.setText("偏低");
            }
            else
                if(0.6<c&&c<=0.65)
                {
                    JRLdefen = 80;
                    xgetJRL.setText("正常");
                }
                else
                    if(0.6<c&&c<=0.7)
                    {
                        JRLdefen = 100;
                        xgetJRL.setText("优秀");
                    }
                    else
                        xgetJRL.setText("超出范围");



            if(e<1300)
            {
                DXdefen = 70;
                xgetDX.setText("偏低");
            }
            else
                if(1300<=e&&e<=1900)
                {
                    DXdefen = 100;
                    xgetDX.setText("正常");
                }
                else
                {
                    DXdefen = 70;
                    xgetDX.setText("偏高");
                }
        }

        //女
        if(zhishu==0)
        {
            double biaozhun = (h*100-70)*0.6;
            if(h*100<150)
                xgetSG.setText("偏低");
            else
                xgetSG.setText("标准");
            if(biaozhun*0.9<=i&&biaozhun*1.1>=i)
                xgetTZ.setText("正常");
            else
            if(biaozhun*0.8<i&&biaozhun*0.9>i)
                xgetTZ.setText("偏轻");
            else
            if(i>biaozhun*1.1&&i<biaozhun*1.2)
                xgetTZ.setText("偏重");
            else
            if(i<=biaozhun*0.8)
                xgetTZ.setText("营养不良");
            else
            if(i>=biaozhun*1.2)
                xgetTZ.setText("肥胖");



            if(a>=10&&a<=18.5)
            {
                BMIdefen = 75;
                xgetBMI.setText("过轻");
            }
            else
            if(18.5<a&&a<=24)
            {
                BMIdefen = 100;
                xgetBMI.setText("正常");
            }
            else
            if(24<a&&a<=28)
            {
                BMIdefen = 80;
                xgetBMI.setText("超重");
            }
            else
            if(28<a&&a<=35)
            {
                BMIdefen = 60;
                xgetBMI.setText("肥胖");
            }
            else
                xgetBMI.setText("超出范围");



            if(0.1<b/100&&b/100<=0.2)
            {
                TZLdefen = 70;
                xgetTZL.setText("过瘦");
            }
            else
            if(0.2<b/100&&b/100<=0.3)
            {
                TZLdefen = 100;
                xgetTZL.setText("正常");
            }
            else
            if(0.3<b/100&&b/100<=0.45)
            {
                TZLdefen = 70;
                xgetTZL.setText("超重");
            }
            else
                xgetTZL.setText("超出范围");


            if(c<=0.55)
            {
                JRLdefen = 60;
                xgetJRL.setText("偏低");
            }
            else
            if(0.55<c&&c<=0.6)
            {
                JRLdefen = 80;
                xgetJRL.setText("正常");
            }
            else
            if(0.6<c&&c<=0.65)
            {
                JRLdefen = 100;
                xgetJRL.setText("优秀");
            }
            else
                xgetJRL.setText("超出范围");



            if(e<1100)
            {
                DXdefen = 70;
                xgetDX.setText("偏低");
            }
            else
            if(1100<=e&&e<=1500)
            {
                DXdefen = 100;
                xgetDX.setText("正常");
            }
            else
            {
                DXdefen = 70;
                xgetDX.setText("偏高");
            }
        }



        if(d<0.7)
        {
            SFLdefen = 70;
            xgetSFL.setText("偏低");
        }
        else
            if(0.7<=d&&d<=0.8)
            {
                SFLdefen = 100;
                xgetSFL.setText("正常");
            }
            else
                if(d>0.8)
                {
                    SFLdefen = 70;
                    xgetSFL.setText("偏高");
                }



                if(f<-4)
                {
                    GZdefen = 50;
                    xgetGZ.setText("风险高");
                }
                else
                    if(-4<=f&&f<=-1)
                    {
                        GZdefen = 70;
                        xgetGZ.setText("中度风险");
                    }
                    else
                        if(f>-1)
                        {
                            GZdefen = 100;
                            xgetGZ.setText("风险低");
                        }

        double SUM = 0;
        SUM = BMIdefen*0.5+JRLdefen*0.1+SFLdefen*0.1+TZLdefen*0.1+GZdefen*0.1+DXdefen*0.1;
        if(SUM<=100&&SUM>=85)
            xgetPJ.setText("优秀");
        else
            if (SUM<85&&SUM>=70)
                xgetPJ.setText("良好");
            else
                if(SUM<70)
                    xgetPJ.setText("较差");


        double aa = a;
        BigDecimal aaa = new BigDecimal(aa);
        double aaaa = aaa.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getBMI.setText(""+aaaa);

        double bb = b;
        BigDecimal bbb = new BigDecimal(bb);
        double bbbb = bbb.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getTizhilv.setText(""+bbbb+"%");


        double cc = c*100;
        BigDecimal ccc = new BigDecimal(cc);
        double cccc = ccc.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getJRL.setText(""+cccc+"%");

        double dd = d*100;
        BigDecimal ddd = new BigDecimal(dd);
        double dddd = ddd.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getTSFL.setText(""+dddd+"%");


        double ee = e;
        BigDecimal eee = new BigDecimal(ee);
        double eeee = eee.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getDX.setText(""+eeee);


        double ff = f;
        BigDecimal fff = new BigDecimal(ff);
        double ffff = fff.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getGZ.setText(""+ffff);

        double SS = SUM;
        BigDecimal SSS = new BigDecimal(SS);
        double SSSS = SSS.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getSUM.setText(""+SSSS+"分");

        double hh = h;
        BigDecimal hhh = new BigDecimal(hh);
        double hhhh = hhh.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getSG.setText(""+hhhh+"m");

        double ii = i;
        BigDecimal iii = new BigDecimal(ii);
        double iiii = iii.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        getTZ.setText(""+iiii+"kg");


        P1x = (TextView)findViewById(R.id.text_view013);
        P2x = (TextView)findViewById(R.id.text_view6);
        P3x = (TextView)findViewById(R.id.text_view9);
        P4x = (TextView)findViewById(R.id.text_view12);
        P5x = (TextView)findViewById(R.id.text_view15);
        P1 = P1x.getText().toString();
        P2 = P2x.getText().toString();
        P3 = P3x.getText().toString();
        P4 = P4x.getText().toString();
        P5 = P5x.getText().toString();



        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(jieguo.this,report.class);
                Bundle bundle = new Bundle();
                bundle.putString("P1x",P1);
                bundle.putString("P2x",P2);
                bundle.putString("P3x",P3);
                bundle.putString("P4x",P4);
                bundle.putString("P5x",P5);
                intent1.putExtras(bundle);
                startActivity(intent1);
            }
        });

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(jieguo.this,data.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
