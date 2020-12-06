# LG-Dual-Screen-IME-Keyboard
use LG private api to transport any IME softkeyboard into second screen

LG G8X dual screen is convenient for coding. But the build-in LG keyboard sucks, and other 3rd party soft keyboard IME is not supported dual screen.

So I have to hack into LG keyboard and find out the magic private API that can transport any IME into second screen.

So here it is the magic API:

Class.forName("android.view.inputmethod.InputMethodManager").getMethod("setForceInputMethodLandscape", Boolean.TYPE).invoke(inputMethodManager, Boolean.valueOf(z));

But you can not call it directly because it is private API and in blacklist, use this ​https://github.com/tiann/FreeReflection​​​ to bypass the limitation.

the screenshot is the hacker's keyboard on second screen, though buggy, but it works!

hacker's keyboard is opensource,maybe someone can embed this dual screen function into hacker's keyboard!

https://github.com/klausw/hackerskeyboard

![alt text](https://github.com/NoviaDroid/LG-Dual-Screen-IME-Keyboard/blob/main/screencap_aide.png?raw=true)
![alt text](https://github.com/NoviaDroid/LG-Dual-Screen-IME-Keyboard/blob/main/screencap.png?raw=true)
 
