/**
* Author: Nelson Victor Cruz Hdez
* Alias: vicco
* Mail: victor.cruz.isc@gmail.com | victor@bitso.com
* Description: Simple C calling method class
* Date: 29/10/2017
*/

#include <jni.h>
#include <stdio.h>

#include "JavaCWrapper.h"

/*
 * Class:     JavaCWrapper
 * Method:    additionFromC
 * Signature: (II)D
 */
JNIEXPORT jdouble JNICALL Java_JavaCWrapper_additionFromC
  (JNIEnv *env, jobject o, jdouble a, jdouble b){
  	return a + b;
}

/*
 * Class:     JavaCWrapper
 * Method:    substractionFromC
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_JavaCWrapper_substractionFromC
  (JNIEnv *env, jobject o, jdouble a, jdouble b){
  	return a - b;
  }

/*
 * Class:     JavaCWrapper
 * Method:    divisionFromC
 * Signature: (DD)D
 */
JNIEXPORT jdouble JNICALL Java_JavaCWrapper_divisionFromC
  (JNIEnv *env, jobject o, jdouble a, jdouble b){
  	if(b == 0){
  		printf("%f value is 0 not able to process\n", b);
  		return 0;
  	}
  	return a/b;
  }

/*
 * Class:     JavaCWrapper
 * Method:    aboutFromC
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_JavaCWrapper_aboutFromC
  (JNIEnv *env, jobject o){
  	printf("MAth library in C says hello");
  }