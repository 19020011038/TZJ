package com.example.tzj;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class report extends AppCompatActivity {
    private TextView get1;
    private TextView get2;
    private TextView get3;
    private TextView get4;
    private TextView get5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar !=null){
            actionBar.hide();
        }
        Bundle bundle = getIntent().getExtras();
        String a = bundle.getString("P1x");
        String b = bundle.getString("P2x");
        String c = bundle.getString("P3x");
        String d = bundle.getString("P4x");
        String e = bundle.getString("P5x");

        get1 = (TextView)findViewById(R.id.text_view1);
        get2 = (TextView)findViewById(R.id.text_view2);
        get3 = (TextView)findViewById(R.id.text_view3);
        get4 = (TextView)findViewById(R.id.text_view4);
        get5 = (TextView)findViewById(R.id.text_view5);

        if("过轻".equals(a))
            get1.setText("建议您增加肉制品的摄入量，多到户外进行有氧呼吸的锻炼，可适当多吃一些甜点");
        else
            if("正常".equals(a))
                get1.setText("恭喜您！您的BMI指数正常，请您继续保持哦~");
            else
                if("超重".equals(a)||"肥胖".equals(a))
                    get1.setText("建议您减肥，可尝试控制饮食，减少油腻食品的摄入，多进行体育运动等方法");
                else
                    get1.setText("您的BMI不在测试范围之内！");


        if("偏低".equals(b))
            get2.setText("您的肌肉率偏低，建议您增加肌肉锻炼，平板支撑是不错的选择哦~");
        else
            if("正常".equals(b))
                get2.setText("恭喜您！您的肌肉率指标正常！");
            else
                if("优秀".equals(b))
                    get2.setText("恭喜您！您的肌肉率指标为优秀！请您继续保持！");
                else
                    get2.setText("您的肌肉率不在测试范围之内！");


        if("偏低".equals(c))
            get3.setText("您的体水分率较低，工作繁忙，但请不要忘记多喝水哦~");
        else
            if("正常".equals(c))
                get3.setText("恭喜您！您的体水分率指标正常！请您继续保持");
            else
                if("偏高".equals(c))
                    get3.setText("您的体水分率偏高，建议您减少盐分摄入，多吃水果蔬菜，多锻炼多出汗，规律作息");
                else
                    get3.setText("您的体水分率不在测试范围之内！");


        if("风险高".equals(d))
            get4.setText("您的骨质风险较高，建议您减少剧烈的户外运动项目，多摄入高钙食品");
        else
            if("中度风险".equals(d))
                get4.setText("您的骨质存在中度风险，提醒您注意增加摄入维生素D和钙");
            else
                if("风险低".equals(d))
                    get4.setText("您的骨质存在较低风险，提醒您增加体育锻炼");
                else
                    get4.setText("您的骨质不在测试范围内");


        if("偏低".equals(e))
            get5.setText("您的代谢指标偏低，建议您多进行有氧运动，如慢跑，坚持就是胜利~");
        else
            if("正常".equals(e))
                get5.setText("恭喜您！您的代谢指标正常，请您继续保持");
            else
                if("偏高".equals(e))
                    get5.setText("您的代谢指标偏高，请您合理控制饮食，减少高热量食物的摄入，降低剧烈运动的频率！");
                else
                    get5.setText("您的代谢指标不在测试范围内");


        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(report.this,jieguo.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
