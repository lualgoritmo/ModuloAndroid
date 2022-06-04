package br.com.zup.exercicio2meupat.model

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.exercicio2meupat.databinding.ActivityDetalheCaoBinding
import br.com.zup.exercicio2meupat.model.Cao

class DetalheCaoActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDetalheCaoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalheCaoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        exibirDetalhes()
    }

    private fun exibirDetalhes() {
        //FORMA PARA SER EM LISTA
        //        val caes = intent.getParcelableArrayListExtra<Cao>("CAES")
//        val cao = caes?.get(1)
        val cao = intent.getParcelableExtra<Cao>("CAO")
        binding.txtviewNome.text = cao?.getNome()
        binding.txtviewCor.text = cao?.getCor()
        binding.txtviewIdade.text = cao?.getIdade()?.toString()
    }
    private fun exibirNome() {

    }
}