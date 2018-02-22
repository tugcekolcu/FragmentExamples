package android.tugcekolcu.fragmentexamples;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TUGCE", "activity oncreate");
        setContentView(R.layout.activity_main);
    }

    public void selectFrag(View view) {
        Fragment fr;

        if(view == findViewById(R.id.firstFragment)) {
            fr = new FragmentA();

        }else {
            fr = new FragmentB();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TUGCE", "activity onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TUGCE", "activity onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TUGCE", "activity onpause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TUGCE", "activity onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TUGCE", "activity ondestroy");
    }

}