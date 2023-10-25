package com.example.bai2register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editfirst = findViewById<EditText>(R.id.editfirst)
        val editlast = findViewById<EditText>(R.id.editlast)
        val radmale = findViewById<RadioButton>(R.id.male)
        val radfemale = findViewById<RadioButton>(R.id.female)
        val editbirth = findViewById<EditText>(R.id.editbirth)
        val editaddre = findViewById<EditText>(R.id.editaddre)
        val editemail = findViewById<EditText>(R.id.editemail)
        val checkBox = findViewById<CheckBox>(R.id.checkbox)

        val register = findViewById<Button>(R.id.register)

        register.setOnClickListener {
            val firstname = editfirst.text.toString()
            val lastname = editlast.text.toString()
            val male = radmale.isChecked
            val female = radfemale.isChecked
            val birthday = editbirth.text.toString()
            val address = editaddre.text.toString()
            val email = editemail.text.toString()
            val accept = checkBox.isChecked

            if (firstname.isBlank() || lastname.isBlank() || !(male || female) || email.isBlank() ||
                birthday.isBlank() || address.isBlank() || !accept) {

                Toast.makeText(
                    this,
                    "Vui lòng nhập đầy đủ thông tin và chọn đồng ý",
                    Toast.LENGTH_SHORT
                    ).show()
                } else {
                    // Xử lý đăng ký tài khoản ở đây
                    Toast.makeText(
                        this,
                        "Đã đăng ký thành công",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }







    }
}