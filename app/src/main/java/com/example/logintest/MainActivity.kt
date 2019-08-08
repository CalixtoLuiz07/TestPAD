package com.example.logintest

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.content.Intent
import android.provider.AlarmClock
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cadastro_usuario.*

class MainActivity : AppCompatActivity() {

    private var tLogin: EditText? = null
    private var tSenha: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonLogin = findViewById<Button>(R.id.buttonLogin)
        tLogin = findViewById<EditText>(R.id.editTextLogin)
        tSenha = findViewById<EditText>(R.id.editTextSenha)


        buttonLogin.setOnClickListener {

            var login = tLogin?.text.toString()
            var senha = tSenha?.text.toString()

            if(login.toLowerCase() == "LUIZ" && senha =="124"){


                val intent = Intent(this, BemVindo::class.java)

                val params = Bundle()
                params.putString("usuario", login)
                intent.putExtras(params)
               startActivity(intent)



           }else{

                Toast.makeText(this, "login e/ou senha incorretos!", Toast.LENGTH_LONG).show()
            }

        }
        btnUserNaoExiste.setOnClickListener {

            val nextIntent = Intent(this, CadastroUsuario::class.java)
            startActivityForResult(nextIntent, 1)
        }

    }

    fun startTimer(message: String, seconds: Int) {

        val intent = Intent(AlarmClock.ACTION_SET_TIMER)
            .putExtra(AlarmClock.EXTRA_MESSAGE, message)
            .putExtra(AlarmClock.EXTRA_LENGTH, seconds)
            .putExtra(AlarmClock.EXTRA_SKIP_UI, true)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
            Toast.makeText(this, "Login realizado com sucesso", Toast.LENGTH_LONG).show()

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {

        if (resultCode == Activity.RESULT_OK) {

            if (requestCode == 1 && intent != null) {

                tLogin?.setText(intent.getStringExtra("loginCadastro"))
                tSenha?.setText(intent.getStringExtra("senhaCadastro"))
            }
        }
    }
}
