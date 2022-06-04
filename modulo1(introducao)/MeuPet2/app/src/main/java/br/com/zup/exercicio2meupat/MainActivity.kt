package br.com.zup.exercicio2meupat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.exercicio2meupat.databinding.ActivityMainBinding
import br.com.zup.exercicio2meupat.model.Cao
import br.com.zup.exercicio2meupat.model.DetalheCaoActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var nome:String
    private lateinit var cor:String
    private lateinit var idade:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetalhes.setOnClickListener {
            enviarDados()
            LimparDadosEnviados()
        }
    }
    private fun enviarDados() {

//FORMA PARA ADICIONAR EM LISTA
//        val cao = Cao(nome, cor, idade.toInt())
//        val cao2 = Cao(nome, cor, idade.toInt())
//        val cao3 = Cao(nome, cor, idade.toInt())
//        val listaCaes = arrayListOf(cao, cao2, cao3)
//        val intent = Intent(this,DetalheCaoActivity::class.java)

        this.nome = binding.txtnamepet.text.toString()
        this.cor = binding.txtcorpet.text.toString()
        this.idade = binding.txtidadepet.text.toString()

        val cao = Cao(nome, cor, idade.toInt())
        val intent = Intent(this, DetalheCaoActivity::class.java)
        intent.putExtra("CAO", cao)
        startActivity(intent)
    }
    private fun LimparDadosEnviados() {
        binding.txtnamepet.text.clear()
        binding.txtcorpet.text.clear()
        binding.txtidadepet.text.clear()
    }
//    private fun enviarDadosCachorro() {
//        recuperarDadosEdicao()
//        val cao = Cao(nome, cor, idade.toInt())
//        val intent = Intent(this, DetalheCaoActivity::class.java).apply {
//            putExtra("CAO", cao)
//            startActivity(intent)
//        }
//    }
}