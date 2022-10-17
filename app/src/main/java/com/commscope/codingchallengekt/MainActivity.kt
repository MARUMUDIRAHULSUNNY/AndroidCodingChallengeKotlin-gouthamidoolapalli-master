package com.commscope.codingchallengekt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.commscope.codingchallengekt.databinding.ActivityMainBinding
import com.commscope.codingchallengekt.utils.*
import com.commscope.codingchallengekt.utils.calculatePiUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.showToastBtn.setOnClickListener {
            Toast.makeText(binding.root.context, "HELLO WORLD", Toast.LENGTH_LONG).show()
        }
        binding.showImgBtn.setOnClickListener{
            val intent = Intent(this, ImageActivity::class.java)
            startActivity(intent)
        }
        binding.showBooksBtn.setOnClickListener{
            val intent = Intent(this, BooksActivity::class.java)
            startActivity(intent)
        }
    }

    fun validate(view: View) {
        val input = binding.etInput.text.toString()
        val isValid = validatePassword(input)
        showDialog(this, "Password valid: $isValid")
    }

    fun calculatePi(view: View) {
        binding.btnCalculatePi.hide()
        binding.spinnerCalculatePi.show()

        binding.tvPiResult.text = "Calculating..."


        val pi = calculatePiUtil()
        binding.tvPiResult.text = pi.toString()
        binding.spinnerCalculatePi.hide()
        binding.btnCalculatePi.show()

            }
        }

