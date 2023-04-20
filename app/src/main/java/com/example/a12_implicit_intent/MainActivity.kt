package com.example.a12_implicit_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ShareCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openurl(view: View) {
    var address = Uri.parse("websitetext.text.toString()")
        startActivity(Intent(Intent.ACTION_VIEW, address))
    }
    fun openmap(view: View){
        var location = Uri.parse("geo:0,0?q=" + locationtext.text.toString())
        startActivity(Intent(Intent.ACTION_VIEW,location))
    }
    fun dialno(view: View){
        var mobno = Uri.parse("tel:" + mobileno.text.toString())
        startActivity(Intent(Intent.ACTION_DIAL,mobno))
    }
    fun share(view: View)
    {
    ShareCompat.IntentBuilder.from(this)
        .setText(messagetext.text.toString())
        .setChooserTitle("Sharing Text")
        .setType("text/plain")
        .startChooser()

    }

}