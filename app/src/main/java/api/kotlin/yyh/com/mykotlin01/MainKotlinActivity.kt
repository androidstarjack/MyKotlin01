package api.kotlin.yyh.com.mykotlin01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main_kotlin.*


/**
 * 欢迎关注微信公众号：终端研发部
 * 博客地址： http://blog.csdn.net/androidstarjack
 */
class MainKotlinActivity : AppCompatActivity() {
    var lan = "Hello Kotlin";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kotlin)
        btn_onclick01.text = "123";
        btn_onclick01.setOnClickListener {
           view -> btn_onclick01.text = "androidstarjack欢迎你---->"+lan;
        }
    }
}
