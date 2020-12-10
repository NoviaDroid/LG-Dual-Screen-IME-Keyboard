# LG-Dual-Screen-IME-Keyboard
use LG private api to transport any IME softkeyboard into second screen

LG G8X dual screen is convenient for coding. But the build-in LG keyboard sucks, and other 3rd party soft keyboard IME is not supported by dual screen.

So I have to hack into LG keyboard and find out the magic private API that can transport any IME into second screen.

So here it is the magic API:

Class.forName("android.view.inputmethod.InputMethodManager").getMethod("setForceInputMethodLandscape", Boolean.TYPE).invoke(inputMethodManager, Boolean.valueOf(z));

But you can not call it directly because it is private API and in blacklist, use this ​https://github.com/tiann/FreeReflection​​​ to bypass the limitation.

the screenshot is the hacker's keyboard on second screen, though buggy, but it works!

hacker's keyboard is opensource,maybe someone can embed this dual screen function into hacker's keyboard!

https://github.com/klausw/hackerskeyboard

![alt text](https://github.com/NoviaDroid/LG-Dual-Screen-IME-Keyboard/blob/main/screenshot.jpg?raw=true)
![alt text](https://github.com/NoviaDroid/LG-Dual-Screen-IME-Keyboard/blob/main/full.png?raw=true)
 
How to use:


1.Download and install the apk from the release.

2.Open the app

3.Switch to dual screen landscape mode on your phone (G8X or other LG phone supports dual screen).

4.Put the app you want use IME on main screen.

5.Put my app on second screen.

6.Make sure the IME is not show(press backspace to turn it off if already shown), and press "IME DUAL ON" button

7.Show your IME by click input field on your main screen app.


You'll find your IME is shown on second screen. Reverse the process to disable dual screen IME feature.

You need tweak you 3rd party IME settings to get a better look, already tested Google keyboard and Hacker's keyboard.
