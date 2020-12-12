#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_id_ac_ui_cs_mobileprogramming_MainActivity_helloWorldFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello World by 1706040031!";
    return env->NewStringUTF(hello.c_str());
}