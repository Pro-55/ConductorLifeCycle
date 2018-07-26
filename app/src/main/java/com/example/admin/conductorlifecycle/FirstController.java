package com.example.admin.conductorlifecycle;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;

public class FirstController extends Controller {


    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        Log.d("Invoked: ","onCreateView 1");
        return inflater.inflate(R.layout.controller_one, container, false);
    }

    @Override
    protected void onAttach(@NonNull View view) {
        super.onAttach(view);
        Log.d("Invoked: ","onAttach 1");
    }

    @Override
    protected void onDetach(@NonNull View view) {
        super.onDetach(view);
        Log.d("Invoked: ","onDetach 1");
    }

    @Override
    protected void onDestroyView(@NonNull View view) {
        super.onDestroyView(view);
        Log.d("Invoked: ","onDestroyView 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Invoked: ","onDestroy 1");
    }
}
