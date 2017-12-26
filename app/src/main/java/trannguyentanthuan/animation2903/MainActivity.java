package trannguyentanthuan.animation2903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnFadeIn,btnFadeOut,btnRepeat,btnZoomIn,btnZoomOut,btnMoveRight,btnMoveLeft,btnMoveUp,btnMoveDown,
            btnSameTime,btnRolate,btnSequence;
    ImageView imgHinh;
    Animation anim_FadeIn,anim_FadeOut,anim_Repeat,anim_ZoomIn,anim_ZoomOut,anim_MoveRight,anim_MoveLeft,
            anim_MoveUp,anim_MoveDown,anim_Rolate,anim_Sequence,anim_SameTime;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        Nhan();
        Animation();


    }

    private  void Nhan()
    {
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnRepeat.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);
        btnMoveDown.setOnClickListener(this);
        btnMoveUp.setOnClickListener(this);
        btnMoveLeft.setOnClickListener(this);
        btnMoveRight.setOnClickListener(this);
        btnRolate.setOnClickListener(this);
        btnSequence.setOnClickListener(this);
        btnSameTime.setOnClickListener(this);
    }
// gọi animation từ anim ra gán vs tên đã ánh xạ
    private void Animation()
    {
        anim_FadeIn= AnimationUtils.loadAnimation(this,R.anim.anim_fadein);
        anim_FadeOut=AnimationUtils.loadAnimation(this,R.anim.anim_fadeout);
        anim_Repeat=AnimationUtils.loadAnimation(this,R.anim.anim_repeat);
        anim_ZoomIn=AnimationUtils.loadAnimation(this,R.anim.anim_zoomin);
        anim_ZoomOut=AnimationUtils.loadAnimation(this,R.anim.anim_zoomout);
        anim_MoveRight=AnimationUtils.loadAnimation(this,R.anim.anim_moveright);
        anim_MoveLeft =AnimationUtils.loadAnimation(this,R.anim.anim_moveleft);
        anim_MoveDown=AnimationUtils.loadAnimation(this,R.anim.anim_movedown);
        anim_MoveUp=AnimationUtils.loadAnimation(this,R.anim.anim_moveup);
        anim_Rolate=AnimationUtils.loadAnimation(this,R.anim.anim_rolate);
        anim_Sequence=AnimationUtils.loadAnimation(this,R.anim.anim_sequence);
        anim_SameTime=AnimationUtils.loadAnimation(this,R.anim.anim_sametime);
    }

    private void AnhXa() {
        imgHinh = (ImageView) findViewById(R.id.imageView);
        btnFadeIn = (Button) findViewById(R.id.buttonFadeIn);
        btnFadeOut = (Button) findViewById(R.id.buttonFadeOut);
        btnRepeat = (Button) findViewById(R.id.buttonRepeat);
        btnZoomIn = (Button) findViewById(R.id.buttonZoomIn);
        btnZoomOut = (Button) findViewById(R.id.buttonZoomOut);
        btnMoveRight = (Button) findViewById(R.id.buttonMoveRight);
        btnMoveLeft = (Button) findViewById(R.id.buttonMoveLeft);
        btnMoveDown = (Button) findViewById(R.id.buttonMoveDown);
        btnMoveUp = (Button) findViewById(R.id.buttonMoveUp);
        btnSameTime = (Button) findViewById(R.id.buttonSameTime);
        btnSequence = (Button) findViewById(R.id.buttonSequence);
        btnRolate = (Button) findViewById(R.id.buttonRolate);
    }


    @Override
    public void onClick(View v) {
        if (v == btnFadeIn) {
        imgHinh.startAnimation(anim_FadeIn);
        }
        if (v == btnFadeOut) {
            imgHinh.startAnimation(anim_FadeOut);
        }
        if (v == btnRepeat) {
            imgHinh.startAnimation(anim_Repeat);
        }
        if (v == btnZoomIn) {
            imgHinh.startAnimation(anim_ZoomIn);
        }
        if (v == btnZoomOut) {
            imgHinh.startAnimation(anim_ZoomOut);
        }
        if (v == btnMoveRight){
            imgHinh.startAnimation(anim_MoveRight);
        }
        if (v == btnMoveLeft){
            imgHinh.startAnimation(anim_MoveLeft);
        }
        if (v == btnMoveDown){
            imgHinh.startAnimation(anim_MoveDown);
        }
        if (v == btnMoveUp){
            imgHinh.startAnimation(anim_MoveUp);
        }
        if(v==btnRolate){
            imgHinh.startAnimation(anim_Rolate);
        }
        if(v==btnSequence){
            imgHinh.startAnimation(anim_Sequence);
        }
        if(v==btnSameTime){
            imgHinh.startAnimation(anim_SameTime);
        }

    }
}
