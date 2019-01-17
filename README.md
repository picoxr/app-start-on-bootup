# How to use this JAR file in Unity project

Note: Regarding java package creation and usage, please refer to [the Guideline](https://github.com/picoxr/support/blob/master/How_to_use_JAR_file_in_Unity_project_on_Pico_device.docx)

## ModifyAndroidManifest
Add permissions 
```
<USES-the permission of the android:name = "android.Permission.RECEIVE_BOOT_COMPLETED"/>
```
![](https://github.com/PicoSupport/BootComplete/blob/master/assets/01.png)

## ClassName
```
android: name = "com.Example.Bootcomplete.MainActivity"
```
## Register system broadcast 

 ![](https://github.com/PicoSupport/BootComplete/blob/master/assets/03.png)

Note: it is required to run the application before next device boot-up

