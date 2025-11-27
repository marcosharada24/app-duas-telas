package com.example.cadastroalunos

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MatriculaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matricula)

        val nome = intent.getStringExtra("NOME") ?: "(sem nome)"
        val txtNome = findViewById<TextView>(R.id.txtNome)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)
        val btnGerar = findViewById<Button>(R.id.btnGerar)

        txtNome.text = "Aluno: $nome"

        btnGerar.setOnClickListener {
            val numero = Random.nextInt(100000, 999999)
            txtResultado.text = "Matrícula: $numero\nAluno: $nome"
        }
    }
}