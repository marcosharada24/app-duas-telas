package com.example.cadastroalunos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNome = findViewById<EditText>(R.id.edtNome)
        val btnIr = findViewById<Button>(R.id.btnIrMatricula)

        btnIr.setOnClickListener {
            val nome = edtNome.text.toString().trim()
            val intent = Intent(this, MatriculaActivity::class.java).apply {
                putExtra("NOME", nome)
            }
            startActivity(intent)
        }
    }
}