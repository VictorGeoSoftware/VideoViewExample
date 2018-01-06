package com.victor.test.videoviewexample

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.victor.test.videoviewlibrary.views.CustomVideoView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CustomVideoView.VideoListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoResource = "android.resource://" + packageName + "/" + R.raw.local_demo
        videoView.setVideoListener(this)
        videoView.setUpVideoResource(videoResource)
    }


    override fun onVideoResourceReady(mediaPlayer: MediaPlayer?) {
        videoView.playVideo()
    }

    override fun onVideoStart(mediaPlayer: MediaPlayer?) {

    }

    override fun onVideoStop(mediaPlayer: MediaPlayer?) {

    }
}
