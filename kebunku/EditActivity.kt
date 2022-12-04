package com.example.kebunku
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class EditActivity : AppCompatActivity() {
    private lateinit var etNama: EditText
    private lateinit var etJenis: EditText
    private lateinit var etDeskripsi: EditText
    private lateinit var tvNumber: TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var radioButton1: RadioButton
    private lateinit var radioButton2: RadioButton
    private lateinit var radioButton3: RadioButton
    private lateinit var radioButton4: RadioButton
    private lateinit var btnSimpan: Button
    private lateinit var btnDecrement: Button
    private lateinit var btnIncrement: Button
    private lateinit var numPicker1: NumberPicker
    private lateinit var numPicker2: NumberPicker

    //private lateinit var btnUpload: ImageButton
    private lateinit var imageViewBack: ImageView

    var num = 1
    companion object {
        val IMAGE_REQUEST_CODE = 100
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_main)

        etNama = findViewById(R.id.et_nama)
        etJenis = findViewById(R.id.et_jenis)
        etDeskripsi = findViewById(R.id.et_deskripsi)
        tvNumber = findViewById(R.id.tv_number)
        radioGroup = findViewById(R.id.radioGroup)
        radioButton1 = findViewById(R.id.radioButton1)
        radioButton2 = findViewById(R.id.radioButton2)
        radioButton3 = findViewById(R.id.radioButton3)
        radioButton4 = findViewById(R.id.radioButton4)
        btnSimpan = findViewById(R.id.btn_simpan)
        btnDecrement = findViewById(R.id.decrement)
        btnIncrement = findViewById(R.id.increment)
        numPicker1 = findViewById(R.id.numberPicker1)
        numPicker2 = findViewById(R.id.numberPicker2)

        numPicker1.minValue = 0
        numPicker1.maxValue = 23

        numPicker2.minValue = 0
        numPicker2.maxValue = 59

        var min = 0
        var sec = 0
        var amOrpm = ""
//        val str = arrayOf<String>("AM", "PM")
//        numPicker3.minValue = 0
//        numPicker3.maxValue = (str.size-1)
//        numPicker3.displayedValues = str

        numPicker1.setOnValueChangedListener { numberPicker, i, i2 ->
            min = numberPicker.value
        }
        numPicker2.setOnValueChangedListener { numberPicker, i, i2 ->
            sec = numberPicker.value
        }
//        numPicker3.setOnValueChangedListener { numberPicker, i, i2 ->
//            val i = numberPicker.value
//            amOrpm = str[i]
//        }

        //     btnUpload = findViewById(R.id.imageButton)
        imageViewBack = findViewById(R.id.iv_backbutton)

        btnDecrement.setOnClickListener{
            num--
            tvNumber.setText("$num")
        }
        btnIncrement.setOnClickListener{
            num++
            tvNumber.setText("$num")
        }
        btnSimpan.setOnClickListener {
            val check = radioGroup.checkedRadioButtonId
            if(radioButton1.isChecked)
                startActivity(Intent(this, DetailActivity::class.java)
                    .putExtra("Nama", etNama.text.toString())
                    .putExtra("Jenis Tanaman", etJenis.text.toString())
                    .putExtra("Deskripsi", etDeskripsi.text.toString())
                    .putExtra("Kategori", radioButton1.text.toString()))
            if(radioButton2.isChecked)
                startActivity(Intent(this, DetailActivity::class.java)
                    .putExtra("Nama", etNama.text.toString())
                    .putExtra("Jenis Tanaman", etJenis.text.toString())
                    .putExtra("Deskripsi", etDeskripsi.text.toString())
                    .putExtra("Kategori", radioButton2.text.toString()))
            if(radioButton3.isChecked)
                startActivity(Intent(this, DetailActivity::class.java)
                    .putExtra("Nama", etNama.text.toString())
                    .putExtra("Jenis Tanaman", etJenis.text.toString())
                    .putExtra("Deskripsi", etDeskripsi.text.toString())
                    .putExtra("Kategori", radioButton3.text.toString()))
            if(radioButton4.isChecked)
                startActivity(Intent(this, DetailActivity::class.java)
                    .putExtra("Nama", etNama.text.toString())
                    .putExtra("Jenis Tanaman", etJenis.text.toString())
                    .putExtra("Deskripsi", etDeskripsi.text.toString())
                    .putExtra("Kategori", radioButton4.text.toString()))
        }
//            btnUpload.setOnClickListener {
//                val intent = Intent(this, DetailActivity::class.java)
//                pickImageGallery()
//            }
    }

//        imageViewBack.setOnClickListener {
//            val intent = Intent(this, DetailActivity::class.java)
//        }
}

//    private fun pickImageGallery(){
//        val intent = Intent(Intent.ACTION_PICK)
//        intent.type = "image/"
//        startActivityForResult(intent, IMAGE_REQUEST_CODE)
//    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if(requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){
//            btnUpload.setImageURI(data?.data)
//        }
//    }
