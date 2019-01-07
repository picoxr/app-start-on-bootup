# Instructions for starting APK

1. After installing apk, run apk

2. Restart the device

3. Apk starts automatically after restart

# Startup in Unity project

1. Create a new Unity project and copy the picovrbootcomplex. jar package in assets into the plugins-> Android directory of the Unity project

2. Add permissions to AndroidManifest file
< USES - the permission of the android: name = "android. Permission. RECEIVE_BOOT_COMPLETED"
/ >
![](https://github.com/PicoSupport/BootComplete/blob/master/assets/01.png)

3. Fix Activity in AndroidManifest file:
The android: name = "com. Example. Bootcomplete. MainActivity"
![](https://github.com/PicoSupport/BootComplete/blob/master/assets/02.png)

4. Adding radio in manifestations file 
![](https://github.com/PicoSupport/BootComplete/blob/master/assets/03.png)

5. Note: it needs to be opened once before starting and restarting can take effect

# 开机自启APK使用说明

1.安装apk之后，运行apk

2.重启设备

3.重启之后apk自动启动

# Unity项目中实现开机自启

1.新建Unity工程，把assets中的PicoVRBootComplete.jar包，拷贝到Unity工程中Plugins->Android的目录下

2.AndroidManifest文件增加权限

   <uses-permission android:name="android.permission.RECEIVE_BOOT_COMPLETED"
/>
![](https://github.com/PicoSupport/BootComplete/blob/master/assets/01.png)

3.AndroidManifest文件中修正Activity：

   android:name="com.example.bootcomplete.MainActivity"
   ![](https://github.com/PicoSupport/BootComplete/blob/master/assets/02.png)

4.AndroidManifes文件中添加广播 
![](https://github.com/PicoSupport/BootComplete/blob/master/assets/03.png)

5.注意：需要先打开一次，开机重启才能生效
