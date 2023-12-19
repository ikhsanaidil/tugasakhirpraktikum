package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class detail_pembelajaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pembelajaran)

        val kembali= findViewById<Button>(R.id.kembali)

        kembali.setOnClickListener {
            val intent = Intent(this, jadwal_pelajaran::class.java)
            startActivity(intent)
        }
    }
}