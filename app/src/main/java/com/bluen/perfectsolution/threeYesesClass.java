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
 * Created by root on 6/5/17.
 */

public class threeYesesClass extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.three_yeses_frag,container,false);
        TextView threeYeses= (TextView) v.findViewById(R.id.three);

        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.three_yeses);

        threeYeses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp.isPlaying()){

                }else {
                    mp.start();
                }
            }
        });
        return v;
    }
}
