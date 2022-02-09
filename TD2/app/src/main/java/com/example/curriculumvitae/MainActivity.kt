package com.example.curriculumvitae

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {

    private var textPlainName: EditText? = null
    private var textPlainAge: EditText? = null
    private var textPlainEmail: EditText? = null
    private var buttonNext: Button? = null
    private var buttonReset: Button? = null
    private var radioGroup: RadioGroup? = null
    private var sbarr: SeekBar? = null
    private var sbarrr: SeekBar? = null
    private var sbarrrr: SeekBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sbarr= findViewById(R.id.sbar)
        sbarrr= findViewById(R.id.sbarr)
        sbarrrr= findViewById(R.id.sbarrr)





                textPlainName = findViewById(R.id.textPlainName);
        textPlainAge = findViewById(R.id.editTextAge);
        textPlainEmail = findViewById(R.id.editTextEmail);
        radioGroup = findViewById(R.id.radioGroup)
        buttonNext = findViewById(R.id.button2)
        buttonReset = findViewById(R.id.buttonReset)

        buttonNext!!.setOnClickListener{
            if(textPlainName!!.text.toString() == "" || textPlainAge!!.text.toString() == ""
                || textPlainEmail!!.text.toString() == ""){
                Snackbar.make(
                    findViewById(R.id.button2),
                    "Completer tout les champs",
                    Snackbar.LENGTH_SHORT
                ).show()
            }else{
                Snackbar.make(
                    findViewById(R.id.sbarr),
                    "Vous etes excellent!",
                    Snackbar.LENGTH_SHORT
                ).show()
            }
        }
        buttonReset!!.setOnClickListener{
            textPlainName!!.setText("")
            textPlainAge!!.setText("")
            textPlainEmail!!.setText("")
            radioGroup!!.check(R.id.radioButtonHomme)
           sbarr!!.setProgress(0)
            super.onPause()
            sbarrr!!.setProgress(0)
            super.onPause()
            sbarrrr!!.setProgress(0)
            super.onPause()
        }











    }
}