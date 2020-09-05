package com.example.rxjava

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

var cnt = 0

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener(this)
        btnMinus.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnMinus -> {
                --cnt
                textCounter.setText("" + cnt)
            }
            R.id.btnPlus -> {
                ++cnt
                textCounter.setText("" + cnt)
            }
        }
    }


}