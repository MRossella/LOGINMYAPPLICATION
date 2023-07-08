package it.parthenope.loginmyapplication

import android.content.Intent

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val loginbtn = findViewById<Button>(R.id.loginbtn)
        val Messaggio2= findViewById<TextView>(R.id.textView)
        loginbtn.setOnClickListener() {
            val Username = username.text.toString()
            val Password = password.text.toString()



            if (Username.isEmpty() || Password.isEmpty()) {
                Messaggio2.text = "DATI MANCANTI"
            } else if (!isValidPassword(Password)) {
                Messaggio2.text = "PASSWORD NON VALIDA. INSERISCI ALMENO UN CARATTERE MAIUSCOLO, UN CARATTERE MINUSCOLO, UN CARATTERE SPECIALE  RICORDA CHE DEVE ESSERE ALMENO 8 CARATTERI"
            } else {
                val message = Intent(this, Messaggio::class.java)
                startActivity(message)
            }
        }
        


        val Forgotp = findViewById<Button>(R.id.forgotpass)
        Forgotp.setOnClickListener() {
            val fp = Intent(this, ForgotPassword::class.java)
            startActivity(fp)
        }
        val Instagram = findViewById<ImageButton>(R.id.instagram_btn)
        Instagram.setOnClickListener() {
            val LoginInstagram = Intent(this, InstagramActivity::class.java)
            startActivity(LoginInstagram)
        }
        val facebook = findViewById<ImageButton>(R.id.fb_btn)
        facebook.setOnClickListener() {
            val LogingFacebook = Intent(this, FacebookActivity::class.java)
            startActivity(LogingFacebook)
        }
        val TikTok = findViewById<ImageButton>(R.id.tiktok_btn)
        TikTok.setOnClickListener() {
            val LoginTikTok = Intent(this, TikTokActivity::class.java)
            startActivity(LoginTikTok)
        }
    }



private fun isValidPassword(password: String): Boolean {
    val passwordRegex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")
    return passwordRegex.matches(password)
}
}


