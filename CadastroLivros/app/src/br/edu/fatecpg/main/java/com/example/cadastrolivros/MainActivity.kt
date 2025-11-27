package com.example.cadastrolivros

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTitulo = findViewById<EditText>(R.id.edtTitulo)
        val edtAutor = findViewById<EditText>(R.id.edtAutor)
        val btnCadastrar = findViewById<Button>(R.id.btnCadastrar)

        btnCadastrar.setOnClickListener {
            val titulo = edtTitulo.text.toString().trim()
            val autor = edtAutor.text.toString().trim()

            val intent = Intent(this, DetalhesActivity::class.java).apply {
                putExtra("TITULO", titulo)
                putExtra("AUTOR", autor)
            }
            startActivity(intent)
        }
    }
}