package com.example.magicalexoplayerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.potyvideo.library.AndExoPlayerView

class MainActivity : AppCompatActivity() {
    var andExoPlayerView: AndExoPlayerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        andExoPlayerView = findViewById(R.id.andExoPlayerView)
        andExoPlayerView?.setSource("https://www.w3schools.com/html/mov_bbb.mp4");
    }
}