package id.ac.unp.ft.elektronika.s1if02.projekikhsan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val kembali= findViewById<ImageView>(R.id.kembali)

        kembali.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val masuk= findViewById<Button>(R.id.masuk)

        masuk.setOnClickListener {
            val intent = Intent(this, pendaftaran::class.java)
            startActivity(intent)
        }
        val namaLengkap = intent.getStringExtra("NAMA_LENGKAP")
        val tempatLahir = intent.getStringExtra("TEMPAT_LAHIR")
        val tanggalLahir = intent.getStringExtra("TANGGAL_LAHIR")
        val namaOrangtua = intent.getStringExtra("NAMA_ORANGTUA")
        val kelas = intent.getStringExtra("KELAS")
        val tpaAsal = intent.getStringExtra("TPA_ASAL")

        // Menampilkan data pada TextView di activity_profile.xml
        val textViewNamaLengkap: TextView = findViewById(R.id.editTextTextNamalengkap)
        val textViewTempatLahir: TextView = findViewById(R.id.editTextTexttempatLahir)
        val textViewTanggalLahir: TextView = findViewById(R.id.editTextTextTanggalLahir)
        val textViewNamaOrangtua: TextView = findViewById(R.id.editTextTextNamaOrangtua)
        val textViewKelas: TextView = findViewById(R.id.editTextTextKelas)
        val textViewTpaAsal: TextView = findViewById(R.id.editTextTpaAsal)

        textViewNamaLengkap.text = namaLengkap
        textViewTempatLahir.text = tempatLahir
        textViewTanggalLahir.text = tanggalLahir
        textViewNamaOrangtua.text = namaOrangtua
        textViewKelas.text = kelas
        textViewTpaAsal.text = tpaAsal
    }


    }