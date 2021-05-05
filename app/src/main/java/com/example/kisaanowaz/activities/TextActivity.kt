package com.example.kisaanowaz

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_text.*

class TextActivity: AppCompatActivity(), MarathiKeyboardFragment.OnLanguagePass, PunjabiKeyboardFragment.OnLanguagePassPunjabi {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)
        val language : String = handleSpinnerOperation()
        handleKeyboardOperation(language)
    }

    fun handleKeyboardOperation(language: String) {
        if (language.equals(getString(R.string.marathi))) {
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, MarathiKeyboardFragment.newInstance()).commit()
        } else if (language.equals(getString(R.string.punjabi))) {
            supportFragmentManager.beginTransaction().add(R.id.fragment_container, PunjabiKeyboardFragment.newInstance()).commit()
            //check if replace can work here
        }
    }

    fun handleSpinnerOperation() : String {
        spinner_language.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                val selectedText = spinner_language.selectedItem.toString()
                handleKeyboardOperation(selectedText)
            }

            override fun onNothingSelected(parent: AdapterView<*>) {

            }
        }
        return spinner_language.selectedItem.toString()
    }

    fun changeEditText(letter: String) {
        if (letter.equals("-1")) {
            val length = edt_question.text?.length
            if (!(length == null || length <= 0)) {
                edt_question.text?.delete(length-1, length)
            }
        } else {
            edt_question.append(letter)
        }
    }

    override fun onLanguagePass(language: String) {
        changeEditText(language)
    }

    override fun onLanguagePassPunjabi(language: String) {
        changeEditText(language)
    }
}