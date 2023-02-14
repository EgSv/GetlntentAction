package ru.startandroid.develop.getlntentaction

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.info)

        val intent: Intent = intent

        var action = intent.action

        var format = ""
        var textInfo = ""

        if (action.equals("ru.startandroid.intent.action.showtime")) {
            format = "HH:mm:ss"
            textInfo = "Time: "
        } else if (action.equals("ru.startandroid.intent.action.showdate")) {
            format = "dd.MM.yyyy"
            textInfo = "Date: "
        }

        var sdf: SimpleDateFormat = SimpleDateFormat(format)
        var datetime = sdf.format(Date(System.currentTimeMillis()))

        var tvDate = findViewById<TextView>(R.id.tvInfo)
        tvDate.setText(textInfo + datetime)
    }
}
