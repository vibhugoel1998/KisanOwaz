package com.example.kisaanowaz

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_punjabi_keyboard.view.*

class PunjabiKeyboardFragment : Fragment() {

    lateinit var languagePassPunjabi : OnLanguagePassPunjabi

     companion object{
         fun newInstance() : PunjabiKeyboardFragment {
             return PunjabiKeyboardFragment()
         }
     }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_punjabi_keyboard, container, false)
        handleOnClicks(view)
        return view
    }

    fun handleOnClicks(view: View) {
        view.btn_1.setOnClickListener {
            changeEditText("ੌ")
        }
        view.btn_2.setOnClickListener {
            changeEditText("ੈ")
        }
        view.btn_3.setOnClickListener {
            changeEditText("ਾ")
        }
        view.btn_4.setOnClickListener {
            changeEditText("ੀ")
        }
        view.btn_5.setOnClickListener {
            changeEditText("ੂ")
        }
        view.btn_6.setOnClickListener {
            changeEditText("ਬੋ")
        }
        view.btn_7.setOnClickListener {
            changeEditText("ਹ")
        }
        view.btn_8.setOnClickListener {
            changeEditText("ਗ")
        }
        view.btn_9.setOnClickListener {
            changeEditText("ਦ")
        }
        view.btn_10.setOnClickListener {
            changeEditText("ਜ")
        }
        view.btn_11.setOnClickListener {
            changeEditText("ਡ")
        }
        view.btn_12.setOnClickListener {
            changeEditText("ੋ")
        }
        view.btn_13.setOnClickListener {
            changeEditText("ੇ")
        }
        view.btn_14.setOnClickListener {
            changeEditText("੍")
        }
        view.btn_15.setOnClickListener {
            changeEditText("ਿ")
        }
        view.btn_16.setOnClickListener {
            changeEditText("ੁ")
        }
        view.btn_17.setOnClickListener {
            changeEditText("ਪ")
        }
        view.btn_18.setOnClickListener {
            changeEditText("ਰ")
        }
        view.btn_19.setOnClickListener {
            changeEditText("ਕ")
        }
        view.btn_20.setOnClickListener {
            changeEditText("ਤ")
        }
        view.btn_21.setOnClickListener {
            changeEditText("ਚ")
        }
        view.btn_22.setOnClickListener {
            changeEditText("ਟ")
        }
        view.btn_23.setOnClickListener {
            changeEditText(",")
        }
        view.btn_24.setOnClickListener {
            changeEditText("ੰ")
        }
        view.btn_25.setOnClickListener {
            changeEditText("ਮ")
        }
        view.btn_26.setOnClickListener {
            changeEditText("ਨ")
        }
        view.btn_27.setOnClickListener {
            changeEditText("ਵ")
        }
        view.btn_28.setOnClickListener {
            changeEditText("ਲ")
        }
        view.btn_29.setOnClickListener {
            changeEditText("ਸ")
        }
        view.btn_30.setOnClickListener {
            changeEditText("ਯ")
        }
        view.btn_31.setOnClickListener {
            changeEditText("\\")
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
        languagePassPunjabi.onLanguagePassPunjabi(language)
    }

    interface OnLanguagePassPunjabi {
        fun onLanguagePassPunjabi(language: String)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        languagePassPunjabi = context as OnLanguagePassPunjabi
    }
}