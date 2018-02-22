package android.tugcekolcu.fragmentexamples;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tugcekolcu on 22.02.2018.
 */

public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("TUGCE", "first fragment onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TUGCE", "first fragment oncreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d("TUGCE", "first fragment oncreateview");
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.d("TUGCE", "first fragment onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("TUGCE", "first fragment onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("TUGCE", "first fragment onresume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("TUGCE", "first fragment onpause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("TUGCE", "first fragment onstop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("TUGCE", "first fragment ondestroy ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("TUGCE", "first fragment ondestroyview");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("TUGCE", "first fragment ondetach");
    }
}
