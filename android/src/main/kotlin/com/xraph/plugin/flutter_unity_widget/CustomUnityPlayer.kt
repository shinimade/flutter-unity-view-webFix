package com.xraph.plugin.flutter_unity_widget

import android.annotation.SuppressLint
import android.app.Activity
import com.unity3d.player.IUnityPlayerLifecycleEvents
import com.unity3d.player.UnityPlayerForActivityOrService

// Unity 2023.1+ / Unity 6 (6000.x): UnityPlayer is abstract and no longer extends FrameLayout.
// Use UnityPlayerForActivityOrService with Activity entry point (not GameActivity).
@SuppressLint("NewApi")
class CustomUnityPlayer(context: Activity, upl: IUnityPlayerLifecycleEvents?) :
    UnityPlayerForActivityOrService(context, upl) {

    companion object {
        internal const val LOG_TAG = "CustomUnityPlayer"
    }
}
