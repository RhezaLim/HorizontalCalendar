package com.hedyhidoury.calendar.horizontallibrary.utils;

/**
 * Created by hidou on 7/31/2017.
 */

import android.content.Context;
import androidx.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public final class ScreenUtils {

    private ScreenUtils() { }

    public static int getScreenHeight(@NonNull Context context) {
        final DisplayMetrics metrics = new DisplayMetrics();
        final WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        wm.getDefaultDisplay().getMetrics(metrics);

        return metrics.heightPixels;
    }
}