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

        button2.setOnClickListener {
            // Tambahkan logika pindah ke layar pendaftaran atau aktivitas pendaftaran di sini
            val intent = Intent(this, daftar::class.java)
            startActivity(intent)
        }

        val actButton= findViewById<Button>(R.id.button)

        actButton.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

    }

    }
