package com.example.logintest

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

open class DebugActivity : AppCompatActivity() {
    private val TAG = "Teste"

    private val className :String
    get(){
        val s = javaClass.name
        return s.substring(s.lastIndexOf("."))
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        Log.d(TAG, className + " onCreate() chamado: " + savedInstanceState)

        if(savedInstanceState != null) {
            for(teste in savedInstanceState.keySet()){

               Log.d(TAG, savedInstanceState[teste]?.toString())
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, className + " onStart() chamado")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, className + " onRestart() chamado")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, className + " onResume() chamado")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, className + " onPause() chamado")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, className + " onStop() chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, className + " onDestroy() chamado")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putString("login", findViewById<TextView>(R.id.editTextLogin).text.toString())
        outState?.putString("senha", findViewById<TextView>(R.id.editTextSenha).text.toString())
        Log.d(TAG, className + " .onSaveInstanceState() chamado")
    }
}