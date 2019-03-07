package com.cuncisboss.databindingexample;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickListener {

    private Context context;
    private User user;

    public MyClickListener(Context context, User user) {
        this.context = context;
        this.user = user;
    }

    public void showToast(View view) {
        Toast.makeText(context, "Button clicked...", Toast.LENGTH_SHORT).show();
        user.name.set("Cuncis Boss");
        user.email.set("cuncisboss@gmail.com");
    }
}
