package io.palaima.debugdrawer.timber;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import io.palaima.debugdrawer.base.DebugModule;
import io.palaima.debugdrawer.timber.ui.LogDialog;

public class TimberModule implements DebugModule {

    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull final ViewGroup parent) {
        View view = inflater.inflate(R.layout.dd_debug_drawer_module_log, parent, false);

        view.findViewById(R.id.dd_button_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new LogDialog(parent.getContext()).show();
            }
        });

        return view;
    }

    @Override
    public void onOpened() {

    }

    @Override
    public void onClosed() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {

    }
}
