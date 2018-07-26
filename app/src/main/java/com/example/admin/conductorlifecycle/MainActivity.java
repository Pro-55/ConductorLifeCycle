package com.example.admin.conductorlifecycle;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Button;

import com.bluelinelabs.conductor.Conductor;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.bluelinelabs.conductor.changehandler.HorizontalChangeHandler;

public class MainActivity extends AppCompatActivity {

    Button buttonOne, buttonTwo, buttonThree;
    private Router router;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ViewGroup container = findViewById(R.id.controllerContainer);
        router = Conductor.attachRouter(this, container, savedInstanceState);


        buttonOne = findViewById(R.id.buttonOne);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirstController firstController = new FirstController();
                if (!router.hasRootController()) {
                    router.setRoot(RouterTransaction.with(firstController));
                } else {
                    router.pushController(RouterTransaction.with(firstController));
                }
            }
        });

        buttonTwo = findViewById(R.id.buttonTwo);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondController secondController = new SecondController();
                if (!router.hasRootController()) {
                    router.setRoot(RouterTransaction.with(secondController));
                } else {
                    router.pushController(RouterTransaction.with(secondController));
                }
            }
        });

        buttonThree = findViewById(R.id.buttonThree);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ThirdController thirdController = new ThirdController();
                if (!router.hasRootController()) {
                    router.setRoot(RouterTransaction.with(thirdController));
                } else {
                    router.pushController(RouterTransaction.with(thirdController));
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (!router.handleBack()) {
            super.onBackPressed();
        }
    }
}
