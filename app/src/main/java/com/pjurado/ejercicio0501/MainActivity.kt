package com.pjurado.ejercicio0501

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun cargaFragment(numFragment: Int){
        val fragment = when(numFragment){
            1 -> MadridFragment()
            2 -> ParisFragment()
            else -> MunichFragment()
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.contenido, fragment)
            .addToBackStack(null)
            .commit()
    }
}