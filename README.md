# 开机自启APK使用说明

1.安装apk之后，运行apk

2.重启设备

3.重启之后apk自动启动

# Unity项目中实现开机自启

1.新建Unity工程，把Demo中的Plugins->Android中的PicoVRBootComplete_xxx.jar包，拷贝到Unity工程对应的目录下

2.AndroidManifest文件增加权限

   <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"
/>

3.AndroidManifest文件中修正Activity：

   android:name="com.example.bootcomplete.MainActivity"

4.AndroidManifes文件中添加广播

5.注意：需要先打开一次，开机重启才能生效