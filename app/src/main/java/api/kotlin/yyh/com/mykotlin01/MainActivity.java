package api.kotlin.yyh.com.mykotlin01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 欢迎关注微信公众号：终端研发部
 * 博客地址： http://blog.csdn.net/androidstarjack
 */
public class MainActivity extends AppCompatActivity {
    private Button  btn_onclick01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_onclick01 = (Button) findViewById(R.id.btn_onclick01);
        btn_onclick01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_onclick01.setText("androidstarjack欢迎你");
                startActivity(new Intent(MainActivity.this,MainKotlinActivity.class));
            }
        });
    }
}
