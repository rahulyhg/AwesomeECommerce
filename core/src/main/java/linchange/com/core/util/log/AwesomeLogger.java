package linchange.com.core.util.log;

import android.util.Log;

/**
 * Created by LinChange on 2017/12/31
 */

public final class AwesomeLogger {

    private static final int VERBOSE = 1;
    private static final int DEBUG = 2;
    private static final int INFO = 3;
    private static final int WARN = 4;
    private static final int ERROR = 5;
    private static final int NOTHING = 6;

    //控制log等级
    private static int LEVEL = VERBOSE;

    public static void v(String tag, String message) {
        if (LEVEL <= VERBOSE) {
//            Logger.t(tag).v(message);
            Log.v(tag, message);
        }
    }

    public static void d(String tag, String message) {
        if (LEVEL <= DEBUG) {
//            Logger.t(tag).d(message);
            Log.d(tag, message);
        }
    }

    public static void d(String message) {
        if (LEVEL <= DEBUG) {
//            Logger.d(message);
            Log.d("default", message);
        }
    }

    public static void i(String tag, String message) {
        if (LEVEL <= INFO) {
//            Logger.t(tag).i(message);
            Log.i(tag, message);
        }
    }

    public static void w(String tag, String message) {
        if (LEVEL <= WARN) {
//            Logger.t(tag).w(message);
            Log.w(tag, message);
        }
    }

    public static void json(String tag, String message) {
        if (LEVEL <= WARN) {
//            Logger.t(tag).json(message);
            Log.d(tag, message);
        }
    }

    public static void e(String tag, String message) {
        if (LEVEL <= ERROR) {
//            Logger.t(tag).e(message);
            Log.e(tag, message);
        }
    }
}
