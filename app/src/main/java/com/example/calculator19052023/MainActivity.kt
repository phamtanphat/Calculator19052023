package com.example.calculator19052023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnMultiplication: Button
    private lateinit var btnDivision: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ
        edtNumber1 = findViewById(R.id.edit_text_number_1)
        edtNumber2 = findViewById(R.id.edit_text_number_2)
        tvResult = findViewById(R.id.text_view_result)
        btnPlus = findViewById(R.id.button_plus)
        btnMinus = findViewById(R.id.button_minus)
        btnMultiplication = findViewById(R.id.button_multiplication)
        btnDivision = findViewById(R.id.button_division)

//        btnPlus.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(p0: View?) {
//
//            }
//        })

        // Viết theo lambda
        btnPlus.setOnClickListener {
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()

            // Check value not empty
            if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Input invalid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val number1 = textNumber1.toInt()
            val number2 = textNumber2.toInt()

            val total = number1 + number2
            val outPut = "Result: $number1 + $number2 = $total"
            tvResult.text = outPut
        }

        btnMinus.setOnClickListener {
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()

            // Check value not empty
            if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Input invalid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val number1 = textNumber1.toInt()
            val number2 = textNumber2.toInt()

            val total = number1 - number2
            val outPut = "Result: $number1 - $number2 = $total"
            tvResult.text = outPut
        }

        btnMultiplication.setOnClickListener {
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()

            // Check value not empty
            if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Input invalid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val number1 = textNumber1.toInt()
            val number2 = textNumber2.toInt()

            val total = number1 * number2
            val outPut = "Result: $number1 * $number2 = $total"
            tvResult.text = outPut
        }

        btnDivision.setOnClickListener {
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()

            // Check value not empty
            if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                Toast.makeText(this@MainActivity, "Input invalid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val number1 = textNumber1.toFloat()
            val number2 = textNumber2.toFloat()

            if (number2 == 0.0f) {
                Toast.makeText(this@MainActivity, "Not divide by zero", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val total = number1 / number2
            val outPut = "Result: $number1 / $number2 = $total"
            tvResult.text = outPut
        }
    }
}
