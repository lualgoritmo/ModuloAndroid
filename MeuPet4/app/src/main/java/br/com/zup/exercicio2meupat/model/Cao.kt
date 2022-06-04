package br.com.zup.exercicio2meupat.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Cao(private var nome:String, private var cor: String, private var idade:Int):Parcelable {
    fun getNome() = this.nome
    fun getCor() = this.cor
    fun getIdade() = this.idade
}