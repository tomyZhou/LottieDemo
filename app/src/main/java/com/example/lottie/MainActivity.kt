package com.example.lottie

import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.*
import com.airbnb.lottie.LottieCompositionFactory.fromJson
import org.json.JSONObject
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private var lottie: LottieAnimationView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lottie = findViewById(R.id.lottie)

        //第一种加载方式 本地
//        //设置资源文件,默认加载assets
//        lottie?.setAnimation("test.json")
//        //设置动画重复次数
//        lottie?.repeatCount = ValueAnimator.INFINITE
//        //开始
//        lottie?.playAnimation()

        loadNetWorkLitteEasy()

    }

    /**
     *
     * https://assets6.lottiefiles.com/packages/lf20_pjaextie.json
     *
     * https://assets1.lottiefiles.com/packages/lf20_h6ggxg2q.json
     *
     * https://assets2.lottiefiles.com/packages/lf20_sf1bpcsj.json
     *
     */
    private fun loadNetWorkLitteEasy(){
        lottie?.setAnimationFromUrl("https://assets2.lottiefiles.com/packages/lf20_sf1bpcsj.json")
        lottie?.scale = 0.2f
        lottie?.repeatCount = ValueAnimator.INFINITE
        lottie?.playAnimation()

    }


    //支持zip包和json两种类型的url，且均支持简易加载和复杂方式加载。  https://blog.csdn.net/qq_21154101/article/details/115773156
    private fun loadNetWorkLottie() {
        LottieCompositionFactory.fromUrl(this,"https://assets2.lottiefiles.com/packages/lf20_sf1bpcsj.json")
            .addListener{
                lottie?.setComposition(it)
                lottie?.scale = 0.2f
                lottie?.repeatCount = ValueAnimator.INFINITE
                lottie?.playAnimation()
            }
    }

}