package jp.techacademy.yukari.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TimePicker
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.text = "ボタン"
        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        showTimePickerDialog()

    }//ボタンを押した時の操作


    private fun showTimePickerDialog() {

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->

                if (hour >= 2 && hour < 10) textView.text = "おはよう"
                else if (hour >= 10 && hour < 18) {
                    textView.text = "こんにちは"
                } else if (hour >= 18 || hour < 2) {
                    textView.text = "こんばんは"  //elseでもOK
                } else {
                    textView.text = "その他"
                }
            }

            ,
            18, 0, true

        )
        timePickerDialog.show()
    }


}


// 条件　ontimeset
