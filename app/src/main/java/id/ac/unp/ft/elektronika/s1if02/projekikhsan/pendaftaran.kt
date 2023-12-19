package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class pendaftaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendaftaran)

        val kembali: ImageView = findViewById(R.id.kembali)
        kembali.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val masuk: Button = findViewById(R.id.masuk)
        masuk.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }
        val buttonMasuk: Button = findViewById(R.id.masuk)

        buttonMasuk.setOnClickListener {
            // Mendapatkan nilai dari EditText
            val namaLengkap = findViewById<EditText>(R.id.editTextTextNamalengkap).text.toString()
            val tempatLahir = findViewById<EditText>(R.id.editTextTexttempatLahir).text.toString()
            val tanggalLahir = findViewById<EditText>(R.id.editTextTextTanggalLahir).text.toString()
            val namaOrangtua = findViewById<EditText>(R.id.editTextTextNamaOrangtua).text.toString()
            val kelas = findViewById<EditText>(R.id.editTextTextKelas).text.toString()
            val tpaAsal = findViewById<EditText>(R.id.editTextTpaAsal).text.toString()

            // Membuat Intent untuk berpindah ke aktivitas Profile
            val intent = Intent(this, profile::class.java)

            // Menambahkan data ke Intent
            intent.putExtra("NAMA_LENGKAP", namaLengkap)
            intent.putExtra("TEMPAT_LAHIR", tempatLahir)
            intent.putExtra("TANGGAL_LAHIR", tanggalLahir)
            intent.putExtra("NAMA_ORANGTUA", namaOrangtua)
            intent.putExtra("KELAS", kelas)
            intent.putExtra("TPA_ASAL", tpaAsal)

            // Memulai aktivitas baru
            startActivity(intent)
        }
    }
}