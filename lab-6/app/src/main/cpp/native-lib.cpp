#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_id_ac_ui_cs_mobileprogramming_MainActivity_helloWorldFromJNI(JNIEnv *env, jobject thiz,
                                                                  jint x) {
    std::string hello = "Hello, user!";
    int native_x = (int) x;
    if (native_x == 1) {
        hello = "Hello, world!";
    }

    return env->NewStringUTF(hello.c_str());
}extern "C"

JNIEXPORT jint JNICALL
Java_id_ac_ui_cs_mobileprogramming_MainActivity_randomIntFromJNI(JNIEnv *env, jobject thiz) {
    srand ( time(NULL) );
    int number_array[] = {1, 2};
    int random_index = rand() % 2;
    return number_array[random_index];
}extern "C"
