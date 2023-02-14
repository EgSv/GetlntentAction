package ru.startandroid.develop.getlntentaction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnTime:Button = findViewById<Button>(R.id.btnTime)
        var btnDate:Button = findViewById<Button>(R.id.btnDate)

        btnTime.setOnClickListener(this)
        btnDate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var intent: Intent?

        when(v?.id){
            R.id.btnTime -> {
                intent = Intent("ru.startandroid.intent.action.showtime")
                startActivity(intent)
            }
            R.id.btnDate -> {
                intent = Intent("ru.startandroid.intent.action.showdate")
                startActivity(intent)
            }
        }
    }
}