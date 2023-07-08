package it.parthenope.loginmyapplication


import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class Messaggio : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_messaggio)
        val messaggio=findViewById<TextView>(R.id.messaggio)
        messaggio.text="REGISTRAZIONE EFFETTUATA CON SUCCESSO!!!"
    }
}
