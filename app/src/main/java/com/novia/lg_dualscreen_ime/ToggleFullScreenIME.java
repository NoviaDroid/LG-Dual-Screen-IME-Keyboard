package com.novia.lg_dualscreen_ime;

import android.content.Context;
import android.inputmethodservice.InputMethodService;

import com.lge.ime.util.p118f.DualKeyboardManager;
import com.lge.ime.util.p118f.MultiDisplayUtils;

public class ToggleFullScreenIME {

    public static void ToggleSimply(Context context, boolean isOn) {
        DualKeyboardManager a2 = DualKeyboardManager.m8792a(context);
        if (isOn) {
            a2.mo6874b();
        } else {
            a2.mo6873a(false);
        }
    }

    public static void Toggle(InputMethodService f4639e){
//        case FunctionCodeConstants.PERFORM_DUAL_KEYBORAD /*{ENCODED_INT: -116}*/:
        InputMethodService inputMethodService = f4639e;
        if (inputMethodService != null && inputMethodService.isInputViewShown()) {
            boolean g = MultiDisplayUtils.m8822g(f4639e);
            DualKeyboardManager a2 = DualKeyboardManager.m8792a((Context) f4639e);
            if (MultiDisplayUtils.m8824h(f4639e)) {
                boolean z = !g;
                //set prefs,ignore
//                PreferenceUtil.m8870b(f4639e, "boolean_dual_keyboard_enabled", z);
//                if (z) {
//                    LDBLoggerManager.sendMessage(this.f4639e, LDBLogEvent.EVENT_MODE_CHANGE, LDBLoggingConstant.DUALKEYBOARD_ON);
//                } else {
//                    LDBLoggerManager.sendMessage(this.f4639e, LDBLogEvent.EVENT_MODE_CHANGE, LDBLoggingConstant.DUALKEYBOARD_OFF);
//                }

                //something not important maybe

//                if (this.f4634I != 0 && !z) {
//                    m6697c(0);
//                }
                if (z) {
                    a2.mo6874b();
                    return;
                } else {
                    a2.mo6873a(false);
                    return;
                }
            } else if (g) {
                a2.mo6873a(false);
                return;
            } else {
                //something not important maybe
//                m6665D();
                return;
            }
        } else {
            return;
        }
    }
}
