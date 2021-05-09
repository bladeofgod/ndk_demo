package com.bedrock.cppdemo.jni;

/**
 * @author LiJiaqi
 * @date 2021/5/9
 * Description:
 */
public class TestJni {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    public String getStringFromJNI() {
        return stringFromJNI();
    }

    public int getAddResult(int a,int b) {
        return numAdd(a, b);
    }

    public native int numAdd(int a, int b);

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

}
