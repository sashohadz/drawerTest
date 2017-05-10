package info.androidhive.navigationdrawer;

import android.app.Application;

import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;

/**
 * Created by sashohadzhiev on 5/9/17.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Leanplum.setApplicationContext(this);
        LeanplumActivityHelper.enableLifecycleCallbacks(this);


        if (BuildConfig.DEBUG) {
            System.out.println("DEV MODE");
            Leanplum.setAppIdForDevelopmentMode("app_nQGF1lrbStJopxK41pzNwueB7jBbWp4Hl0Qqq1BsYNo", "dev_5yE7VOobZuvUrgoTouFDM7CvZTvD3gDeoze0VNqetTo");
        } else {
            System.out.println("PROD MODE");
            Leanplum.setAppIdForProductionMode("app_nQGF1lrbStJopxK41pzNwueB7jBbWp4Hl0Qqq1BsYNo", "prod_a6cwir5070QOAaVmtkxRAgTD88J40rLWy9lSkvBfJk0");
        }

        Leanplum.enableVerboseLoggingInDevelopmentMode();

        Leanplum.start(this);
    }
}

