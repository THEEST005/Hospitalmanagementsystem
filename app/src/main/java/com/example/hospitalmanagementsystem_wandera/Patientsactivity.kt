package com.example.hospitalmanagementsystem_wandera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.Toast

class Patientsactivity : AppCompatActivity() {
    lateinit var patientname:EditText
    lateinit var patientage:EditText
    lateinit var patientgender:EditText
    lateinit var patientphoneno:EditText
    lateinit var submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patientsactivity)

        patientname = findViewById(R.id.edtname_patients)
        patientage = findViewById(R.id.edtage_patients)
        patientgender = findViewById(R.id.edtgender_patients)
        patientphoneno = findViewById(R.id.edtphone_patients)
        submit = findViewById(R.id.btndetails_patients)


        submit.setOnClickListener {
            var name_patients = patientname.text.toString().trim()
            var age_patients = patientage.text.toString().trim()
            var gender_patients = patientgender.text.toString().trim()
            var phone_patients = patientphoneno.text.toString().trim()

            if (name_patients.isEmpty()|| age_patients.isEmpty()||gender_patients.isEmpty()|| phone_patients.isEmpty())
            {
                Toast.makeText(this, "Cannot submit an an empty field", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Fields submitted successfully", Toast.LENGTH_SHORT).show()
                var gotodoctor = Intent(this, Doctorsactivity::class.java)
                startActivity(gotodoctor)
                finish()
            }
        }

    }
}