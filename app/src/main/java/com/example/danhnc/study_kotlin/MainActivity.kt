package com.example.danhnc.study_kotlin

import android.annotation.SuppressLint
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.util.Log
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        var wbWebview :WebView? = null
        var etlink : EditText? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo = findViewById(R.id.buttonGo) as Button
        etlink = findViewById(R.id.etLink) as EditText

        wbWebview = findViewById(R.id.wvWebview) as WebView
        btnGo.setOnClickListener{
            val url = etlink!!.text.toString()
            wbWebview!!.settings.setLoadsImagesAutomatically(true)
            wbWebview!!.settings.javaScriptEnabled
            wbWebview!!.scrollBarStyle
            Log.d("aaaa",url.toString())
            wbWebview!!.loadUrl(url)
        }
    }

//    class MyBrowser : WebViewClient(){
//        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//            return super.shouldOverrideUrlLoading(view, url)
//        }
//    }
}
