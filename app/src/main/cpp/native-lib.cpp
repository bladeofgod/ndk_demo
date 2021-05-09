#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_bedrock_cppdemo_jni_TestJni_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}


//add function

extern "C" JNIEXPORT jint JNICALL
Java_com_bedrock_cppdemo_jni_TestJni_numAdd(JNIEnv *env, jobject thiz, jint a, jint b) {
    int result = (int)(a + b);
    return (jint) result;
}












