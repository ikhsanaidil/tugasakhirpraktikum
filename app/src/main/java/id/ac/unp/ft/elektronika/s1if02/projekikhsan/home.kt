package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val imagebutton3: ImageButton = findViewById(R.id.imageButton3)

        imagebutton3.setOnClickListener {
            // Tambahkan logika pindah ke layar pendaftaran atau aktivitas pendaftaran di sini
            val intent = Intent(this, pendaftaran::class.java)
            startActivity(intent)
        }

        val imageButton4= findViewById<ImageButton>(R.id.imageButton4)

        imageButton4.setOnClickListener {
            val intent = Intent(this, jadwal_pelajaran::class.java)
            startActivity(intent)
        }
        val imageButton5= findViewById<ImageButton>(R.id.imageButton5)

        imageButton5.setOnClickListener {
            val intent = Intent(this, pengumuman::class.java)
            startActivity(intent)
        }
        val button5= findViewById<Button>(R.id.button5)

        button5.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        val button6= findViewById<Button>(R.id.button6)

        button6.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }



    }
    }
