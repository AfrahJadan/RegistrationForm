package com.example.registrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.regButton.setOnClickListener { clickUser() }
    }

    fun clickUser() {

        val enName = binding.nameInput.text
        val enEmail = binding.emailAddress.text
        val enPass = binding.passwordToggle.text.toString()
        val enRePass = binding.reEnterPass.text.toString()
        val enBirthday = binding.birthdayDate.text.toString()
        var showMassage = binding.massageShow.text.toString()

            if (enName.toString().isEmpty() || enEmail.toString().isEmpty()
                || enPass.isEmpty() || enRePass.isEmpty()) {
                println(showMassage)
            } else if(enPass != enRePass){
                println("PassWord not match")
            } else{
                println("Name:${enName} + Email:${enEmail} + Birthday:${enBirthday} +PassWord:${enPass} + RePassWord:${enRePass} ")
                clickUser()
            }
    }
}
