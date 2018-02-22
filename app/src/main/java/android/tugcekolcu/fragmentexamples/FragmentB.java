package android.tugcekolcu.fragmentexamples;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by tugcekolcu on 22.02.2018.
 */

public class FragmentB extends Fragment  {

    TextView tvResult;
    String myData;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_second, container, false);

        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.d("TUGCE", "second fragment onActivityCreated");

        tvResult = (TextView) getActivity().findViewById(R.id.tvResult);
    }

    public void editText (String data){

        this.myData=data;
        tvResult.setText(data);

    }




}
