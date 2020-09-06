package com.example.btnefect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import kotlinx.android.synthetic.main.activity_page2.*

class PageActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val objetoIntent: Intent = intent
        var Nombre = objetoIntent.getStringExtra("Nombre")
        TxtVew2.text = Nombre
        val mWebView = findViewById<View>(R.id.mWebView) as WebView
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        mWebView.loadUrl( "$Nombre")
        val webSetting = mWebView.settings
        webSetting.javaScriptEnabled = true
        webSetting.textZoom = 40

        mWebView.webViewClient = WebViewClient()

        mWebView.webChromeClient = object : WebChromeClient(){
            override fun onProgressChanged(view: WebView?, newProgress: Int) {
                progressBar.progress = newProgress
                    if (newProgress == 100 ){
                        progressBar.visibility
                    }
                    super.onProgressChanged(view, newProgress)
            }
        }
    }
}