package test.musicbox;

//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//}

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;



public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    // ① 準備（コンポを部屋に置く・コピペOK）
    SoundPool soundPool;    // 効果音を鳴らす本体（コンポ）
    int aifu;          // 効果音データ（mp3）
    int aifuu;          // 効果音データ（mp3）
    int aifufu,aitunda,aimoutunda,aiend,aihapiba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ② 初期化
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        } else {
            AudioAttributes attr = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(attr)
                    .setMaxStreams(5)
                    .build();
        }

        // ③ 読込処理(CDを入れる)
        aifu = soundPool.load(this, R.raw.aifu, 1);
        aifuu = soundPool.load(this, R.raw.aifuu, 1);
        aifufu = soundPool.load(this, R.raw.aifufu, 1);
        aitunda = soundPool.load(this, R.raw.aitunda, 1);
        aimoutunda = soundPool.load(this, R.raw.aimoutunda, 1);
        aiend = soundPool.load(this, R.raw.aiend, 1);
        aihapiba = soundPool.load(this, R.raw.aihapiba, 1);

        imageView = findViewById(R.id.sayAi);
        first();

    }

    public void sayPicture() {
        Animation animation= AnimationUtils.loadAnimation(this, R.anim.clear);
        imageView.startAnimation(animation);
    }
    public void first(){
        Animation animation= AnimationUtils.loadAnimation(this, R.anim.first);
        imageView.startAnimation(animation);
    }


    public void on1(View v){
        // ④ 再生処理(再生ボタン)
        soundPool.play(aifu,1f , 1f, 0, 0, 1f);
        sayPicture();
    }

    public void on2(View v){
        // ④ 再生処理 (再生ボタン)
        soundPool.play(aifuu,1f , 1f, 0, 0, 1f);
        sayPicture();
    }

    public void on3(View v){
        // ④ 再生処理 (再生ボタン)
        soundPool.play(aifufu,1f , 1f, 0, 0, 1f);
        sayPicture();
    }
    public void on4(View v){
        // ④ 再生処理 (再生ボタン)
        soundPool.play(aitunda,1f , 1f, 0, 0, 1f);
        sayPicture();
    }
    public void on5(View v){
        // ④ 再生処理 (再生ボタン)
        soundPool.play(aimoutunda,1f , 1f, 0, 0, 1f);
        sayPicture();
    }
    public void on6(View v){
        // ④ 再生処理 (再生ボタン)
        soundPool.play(aiend,1f , 1f, 0, 0, 1f);
        sayPicture();
    }
    public void on7(View v){
        // ④ 再生処理 (再生ボタン)
        soundPool.play(aihapiba,1f , 1f, 0, 0, 1f);
        sayPicture();
    }


}
