package it.parthenope.loginmyapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        val loginbtn = findViewById<Button>(R.id.loginbtnp)
        val Messaggio2= findViewById<TextView>(R.id.textView6)
        val email=findViewById<EditText>(R.id.email)
        val Email = email.text

        loginbtn.setOnClickListener() {
            if ( Email.isEmpty() ) {
                Messaggio2.text="DATI MANCANTI"

            }
            else {
              Messaggio2.text=" Nei prossimi minuti controlla il tuo indirizzo email." +
                      "Ti invieremo il codice al più presto!"
            }
        }
    }
}