package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button2: Button = findViewById(R.id.button2)
        val button: Button = findViewById(R.id.button)

        button2.setOnClickListener {
            // Aksi ketika tombol "Daftar" ditekan
            showToast("Tombol Daftar Ditekan!")
            // Tambahkan logika pindah ke layar pendaftaran atau aktivitas pendaftaran di sini
            val intent = Intent(this,daftar::class.java)
            startActivity(intent)
        }

        button.setOnClickListener {
            // Aksi ketika tombol "Masuk" ditekan
            showToast("Tombol Masuk Ditekan!")
            // Tambahkan logika pindah ke layar login atau aktivitas login di sini
            val intent = Intent(this,home::class.java)
            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    }
