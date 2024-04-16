package com.example.aboutmelast

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.aboutmelast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val myName: MyName= MyName("boss")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.doneButton.setOnClickListener {
            addNickName(it)
        }
        binding.myName=myName
    }
    private fun addNickName(view:View){
       binding.apply {
          nickNameText.text = binding.nikeNameEdit.text
           invalidateAll()
           nikeNameEdit.visibility = View.GONE
           doneButton.visibility = View.GONE
           nickNameText.visibility = View.VISIBLE
       }
        val imm= getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)

    }










}