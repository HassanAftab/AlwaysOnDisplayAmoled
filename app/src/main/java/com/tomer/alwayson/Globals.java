package com.tomer.alwayson;

import android.graphics.drawable.Drawable;

import com.afollestad.materialdialogs.color.ColorChooserDialog;
import com.android.vending.billing.IInAppBillingService;
import com.tomer.alwayson.Services.NotificationListener;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Globals {
    public static boolean isShown;
    public static boolean sensorIsScreenOff;
    public static boolean inCall = false;
    public static Map<String, NotificationListener.NotificationHolder> notifications = new ConcurrentHashMap<>();
    public static boolean notificationChanged;
    public static ColorChooserDialog.Builder colorDialog;
    public static boolean noLock;
    public static boolean killedByDelay;
    public static ArrayList<String> ownedItems;
    public static IInAppBillingService mService;
    public static NotificationListener.NotificationHolder newNotification;
    public static boolean nightMode;
    public static boolean isServiceRunning;
    public static boolean waitingForApp = false;
    public static Runnable onNotificationAction;
}
