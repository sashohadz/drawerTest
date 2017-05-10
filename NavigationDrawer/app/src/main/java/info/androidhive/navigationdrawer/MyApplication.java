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
            Leanplum.setAppIdForDevelopmentMode("app_", "dev_");
        } else {
            System.out.println("PROD MODE");
            Leanplum.setAppIdForProductionMode("app_", "prod_");
        }

        Leanplum.enableVerboseLoggingInDevelopmentMode();

        Leanplum.start(this);
    }
}

