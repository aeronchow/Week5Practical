package com.example.test

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener(){
            //val intent = Intent(this,AboutActivity::class.java)

            val telNo = Uri.parse("tel:012345678")
            val  intent = Intent(Intent.ACTION_DIAL,telNo)

            try{
                startActivity(intent)
            }catch(e:ActivityNotFoundException){
                Toast.makeText(this,"No App Found",Toast.LENGTH_LONG).show()
            }

        }
    }
}