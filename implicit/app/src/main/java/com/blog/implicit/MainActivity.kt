package com.blog.implicit

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBrowse.setOnClickListener {
            val url = edBrowse.text.toString()
            if(url.isEmpty()) {
                //show a dialog
            }else if(!url.startsWith("http")) {
                //either prefix the string or ask the user to enter the full url
            }
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        btnDial.setOnClickListener {
            val phNo = edDial.text.toString()
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phNo"))
            startActivity(intent)
        }
    }
}