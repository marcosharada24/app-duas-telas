package com.example.cadastrolivros

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        val titulo = intent.getStringExtra("TITULO") ?: "(sem título)"
        val autor = intent.getStringExtra("AUTOR") ?: "(sem autor)"

        val resumo = findViewById<TextView>(R.id.txtResumo)
        resumo.text = "Livro cadastrado:\nTítulo: $titulo\nAutor: $autor"

        findViewById<Button>(R.id.btnVoltar).setOnClickListener { finish() }
    }
}