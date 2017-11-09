package com.dovana.animationexample;



public class MainActivity extends Activity {

	ImageView animationpanel;
	AnimationDrawable animationControler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationpanel=(ImageView) findViewById(R.id.imageView1);
        animationpanel.setImageResource(R.drawable.frameanimation);
        animationControler=(AnimationDrawable)animationpanel.getDrawable();
        animationControler.start();
        
    }


}
