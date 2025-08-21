package br.edu.fatecpg.appduastelas

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.appduastelas.model.Produto
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtNomeProduto= findViewById<EditText>(R.id.edt_nome_produto)
        val edtPrecoProduto= findViewById<EditText>(R.id.edt_preco_produto)
        val btnCadrastar= findViewById<Button>(R.id.btn_cadrastar)
        val fabAvanca= findViewById<FloatingActionButton>(R.id.fab_avanca)
        var prod = Produto ("sem produto", 0.0)
        btnCadrastar.setOnClickListener {
            val nome = edtNomeProduto.text.toString()
            val preco = edtPrecoProduto.text.toString().toDouble()
            prod = Produto(nome,preco)
            val builder = AlertDialog.Builder(this)
            builder.setTitle("sucesso")
            builder.setMessage("castrato ok!")
            val alert = builder.create()
            edtNomeProduto.text.clear()
            edtPrecoProduto.text.clear()
        }
        fabAvanca.setOnClickListener{
            val intent = Intent(this,ProdutoActivity::class.java)
            intent.putExtra("produto",prod.toString())
            startActivity(intent)
        }
    }
}