package com.example.tzj;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class data extends AppCompatActivity {
    private EditText etvalue1;
    private EditText etvalue2;
    private EditText etvalue3;
    private EditText etvalue4;
    private double value1;
    private double value2;
    private String value3;
    private double value4;
    private double result;
    private double result2;
    private double result3;
    private double result4;
    private double result5;
    private double result6;


    private int zhishu;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar !=null){
            actionBar.hide();
        }
        Button button = (Button) findViewById(R.id.button);



        etvalue1 = (EditText)findViewById(R.id.edit_text1);
        etvalue2 = (EditText)findViewById(R.id.edit_text2);
        etvalue3 = (EditText)findViewById(R.id.edit_text3);
        etvalue4 = (EditText)findViewById(R.id.edit_text4);



        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void  onClick(View v){





                value1 = Double.parseDouble(etvalue1.getText().toString());
                value2 = Double.parseDouble(etvalue2.getText().toString());
                value3 = etvalue3.getText().toString();
                value4 = Double.parseDouble(etvalue4.getText().toString());
                result = value1/(value2*value2);





                if ("男".equals(value3))
                    zhishu = 1;
                else
                    zhishu = 0;
                result2 = 1.2*result+0.23*value4-5.4-10.8*zhishu;
                if(zhishu==1)
                    result3 = 78/(2*value1);
                else
                    result3 = 56/(2*value1);
                if(zhishu==1)
                    result4=result3*1.2;
                else
                    result4=result3*1.3;
                if(zhishu==1)
                    result5=13.7*value1+5.0*value2*100-6.8*value4+66;
                else
                    result5=9.6*value1+1.8*value2*100-4.7*value4+655;
                result6 = (value1-value4)*0.2;


                Intent intent = new Intent(data.this,jieguo.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("BMI",result);
                bundle.putDouble("TZL",result2);
                bundle.putDouble("JRL",result3);
                bundle.putDouble("TS",result4);
                bundle.putDouble("DX",result5);
                bundle.putDouble("GZ",result6);
                bundle.putDouble("SG",value2);
                bundle.putDouble("TZ",value1);
                bundle.putInt("ZS",zhishu);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();









            }
        });
    }



}
