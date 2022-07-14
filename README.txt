ZOLO - Android chat app base on Firebase

Các bước mở và build project trên Android Studio:

1. Clone project từ github: https://github.com/ThanhNguyen194/Zolo.git
2. Check trong build.gradle app
    compileSdk: 32
    minSdk 21
    targetSdk 32
    JavaVersion: VERSION_1_8
- Kiểm tra và implement các package nếu thiếu:
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.6.0'
    implementation 'de.hdodenhof:circleimageview:2.1.0'
    implementation 'com.google.firebase:firebase-database:20.0.5'
    implementation 'com.google.firebase:firebase-auth:21.0.5'
    implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.1.0'
    implementation 'com.google.firebase:firebase-storage:20.0.1'
    implementation 'com.google.firebase:firebase-messaging:23.0.6'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
    implementation 'com.yarolegovich:lovely-dialog:1.1.1'
    implementation "androidx.percentlayout:percentlayout:1.0.0"
    implementation "androidx.core:core:1.6.0"
3. Kiểm tra file build.gradle project:
classpath 'com.google.gms:google-services:4.3.13'
plugins:
    id 'com.android.application' version '7.1.1' apply false
    id 'com.android.library' version '7.1.1' apply false
4. Tạo cơ sở dữ liệu firebase theo hướng dẫn: https://firebase.google.com/docs/android/setup
5. Tiến hành build app và sử dụng.

Thông tin liên hệ:
Nguyễn Tiến Thành
SDT: 0911752663 - Email: tienthanh.hust95@gmail.com
