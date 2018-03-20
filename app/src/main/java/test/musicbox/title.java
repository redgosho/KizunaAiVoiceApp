package test.musicbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.widget.TextView;
import android.view.animation.AnimationUtils;

public class title extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);

        findViewById(R.id.title_text).startAnimation(AnimationUtils.loadAnimation(this, R.anim.updown));

    }
    // タッチイベント（画面タッチを感知する）
    public boolean onTouchEvent(MotionEvent event) {

        Intent intent = new Intent(this,VoiceTypeChoice.class); // 画面指定
        startActivity(intent);

        return super.onTouchEvent(event);
    }

}

