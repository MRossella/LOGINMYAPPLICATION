package it.parthenope.loginmyapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.annotation.SuppressLint
import android.content.Intent

import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class InstagramActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        val username = findViewById<EditText>(R.id.emailorusername)
        val password = findViewById<EditText>(R.id.passwordInstagram)
        val loginbtn = findViewById<Button>(R.id.loginbtni)
        val Messaggio2 = findViewById<TextView>(R.id.textView3)
        loginbtn.setOnClickListener() {
            val Username = username.text.toString()
            val Password = password.text.toString()
            if (Username.isEmpty() || Password.isEmpty()) {
                Messaggio2.text = "DATI MANCANTI"
            } else if (!isValidPassword(Password)) {
                Messaggio2.text =
                    "PASSWORD NON VALIDA. INSERISCI ALMENO UN CARATTERE MAIUSCOLO, UN CARATTERE MINUSCOLO, UN CARATTERE SPECIALE  RICORDA CHE DEVE ESSERE ALMENO 8 CARATTERI"
            } else {
                val message = Intent(this, Messaggio::class.java)
                startActivity(message)
            }
        }
    }


    private fun isValidPassword(password: String): Boolean {
        val passwordRegex =
            Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")
        return passwordRegex.matches(password)
    }

}