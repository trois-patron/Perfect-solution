package com.bluen.perfectsolution;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by root on 6/15/17.
 */

public class beforeRecClass extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.before_rec_frag,container,false);
        TextView bRec1= (TextView) v.findViewById(R.id.bRec1);

        bRec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });
        return v;
    }
}
