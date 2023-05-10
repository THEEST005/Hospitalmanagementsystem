package com.example.hospitalmanagementsystem_wandera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name:EditText
    lateinit var phone:EditText
    lateinit var email:EditText
    lateinit var password:EditText
    lateinit var createaccount:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edtname)
        phone = findViewById(R.id.edtphone)
        email = findViewById(R.id.edtemail)
        password = findViewById(R.id.edtpassword)
        createaccount = findViewById(R.id.btncreateacc)



        createaccount.setOnClickListener {
            var name_edt = name.text.toString().trim()
            var phone_edt = phone.text.toString().trim()
            var email_edt = email.text.toString().trim()
            var password_edt = password.text.toString().trim()

            if (name_edt.isEmpty()|| phone_edt.isEmpty()|| email_edt.isEmpty()|| password_edt.isEmpty()){
                Toast.makeText(this, "Failed To Create Account", Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this, "Account Created Successfully", Toast.LENGTH_SHORT).show()
                var gotolog = Intent(this, Loginactivity::class.java)
                startActivity(gotolog)
                finish()
            }
        }

    }
}