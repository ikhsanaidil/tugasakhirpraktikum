package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pengumuman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengumuman)

        val simpan= findViewById<Button>(R.id.simpan)

        simpan.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}