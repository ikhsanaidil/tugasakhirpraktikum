package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CalendarView
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class jadwal_pelajaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal_pelajaran)

        val kembali= findViewById<ImageView>(R.id.kembali)

        kembali.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val calendarView: CalendarView = findViewById(R.id.calendarView)

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            // Saat tanggal dipilih, buat Intent untuk memulai activity DetailPembelajaran
            val intent = Intent(this, detail_pembelajaran::class.java)
            // Kirim informasi tanggal ke activity DetailPembelajaran jika diperlukan
            intent.putExtra("tahun", year)
            intent.putExtra("bulan", month)
            intent.putExtra("tanggal", dayOfMonth)
            // Mulai activity DetailPembelajaran
            startActivity(intent)
        }

    }

    fun onDateSelected(view: View) {
        // Metode ini dapat digunakan sebagai metode onClick pada XML
        // atau digunakan sebagai metode handler dari calendarView.setOnDateChangeListener
    }
    }