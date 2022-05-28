package br.com.zup.exercicio2meupat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var btnMsg: Button? = null
    var textViewMsg: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMsg = findViewById(R.id.btn_mensagem)
        textViewMsg = findViewById(R.id.txtview_mensagem)

        btnMsg?.setOnClickListener {
            textViewMsg?.text = "Oi, o meu nome é Biscoito!"
        }
    }
}