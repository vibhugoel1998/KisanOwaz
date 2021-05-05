package com.example.kisaanowaz

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_marathi_keyboard.view.*

class MarathiKeyboardFragment : Fragment() {

    lateinit var languagePass : OnLanguagePass

    companion object {
        fun newInstance() : MarathiKeyboardFragment {
            return MarathiKeyboardFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_marathi_keyboard, container, false)
        handleOnClicks(view)
        return view
    }

    fun handleOnClicks(view: View) {
        view.btn_1.setOnClickListener {
            changeEditText("ौ")
        }
        view.btn_2.setOnClickListener {
            changeEditText("ै")
        }
        view.btn_3.setOnClickListener {
            changeEditText("ा")
        }
        view.btn_4.setOnClickListener {
            changeEditText("ी")
        }
        view.btn_5.setOnClickListener {
            changeEditText("ू")
        }
        view.btn_6.setOnClickListener {
            changeEditText("ब")
        }
        view.btn_7.setOnClickListener {
            changeEditText("ह")
        }
        view.btn_8.setOnClickListener {
            changeEditText("ग")
        }
        view.btn_9.setOnClickListener {
            changeEditText("द")
        }
        view.btn_10.setOnClickListener {
            changeEditText("ज")
        }
        view.btn_11.setOnClickListener {
            changeEditText("ड")
        }
        view.btn_12.setOnClickListener {
            changeEditText("ो")
        }
        view.btn_13.setOnClickListener {
            changeEditText("े")
        }
        view.btn_14.setOnClickListener {
            changeEditText("्")
        }
        view.btn_15.setOnClickListener {
            changeEditText("ि")
        }
        view.btn_16.setOnClickListener {
            changeEditText("ु")
        }
        view.btn_17.setOnClickListener {
            changeEditText("प")
        }
        view.btn_18.setOnClickListener {
            changeEditText("र")
        }
        view.btn_19.setOnClickListener {
            changeEditText("क")
        }
        view.btn_20.setOnClickListener {
            changeEditText("त")
        }
        view.btn_21.setOnClickListener {
            changeEditText("च")
        }
        view.btn_22.setOnClickListener {
            changeEditText("ट")
        }
        view.btn_23.setOnClickListener {
            changeEditText(",")
        }
        view.btn_24.setOnClickListener {
            changeEditText("ॉ")
        }
        view.btn_25.setOnClickListener {
            changeEditText("ं")
        }
        view.btn_26.setOnClickListener {
            changeEditText("म")
        }
        view.btn_27.setOnClickListener {
            changeEditText("न")
        }
        view.btn_28.setOnClickListener {
            changeEditText("व")
        }
        view.btn_29.setOnClickListener {
            changeEditText("ल")
        }
        view.btn_30.setOnClickListener {
            changeEditText("स")
        }
        view.btn_31.setOnClickListener {
            changeEditText("य")
        }
        view.btn_32.setOnClickListener {
            changeEditText(".")
        }
        view.btn_33.setOnClickListener {
            changeEditText("-1")
        }
        view.btn_34.setOnClickListener {
            changeEditText(" ")
        }
    }

    fun changeEditText(language: String) {
        languagePass.onLanguagePass(language)
    }

    interface OnLanguagePass {
        fun onLanguagePass(language: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        languagePass = context as OnLanguagePass
    }
}