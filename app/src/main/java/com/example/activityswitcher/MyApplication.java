package com.example.activityswitcher;

import android.app.Application;
import android.graphics.Color;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.hitomi.aslibrary.ActivitySwitcher;

/**
 * Created by hitomi on 2016/10/11.
 */
public class MyApplication extends Application {
    static int index;
    static int totalCount = 8;
    static int[] bgColors = new int[] {
            Color.parseColor("#92c8d0"),
            Color.parseColor("#c4dcce"),
            Color.parseColor("#cd7b91"),
            Color.parseColor("#e5c5dc"),
            Color.parseColor("#742a8d"),
            Color.parseColor("#2eb2d8"),
            Color.parseColor("#b9d84e"),
            Color.parseColor("#35fe62")
    };

    private RelativeLayout relativeLayout;
    private Button btnNext;
    private TextView tvPage;

    private ActivitySwitcher activitySwitcher;
    private int tag;

    @Override
    public void onCreate() {
        super.onCreate();
        ActivitySwitcher.getInstance().init(this);
    }
}
