# How to use this JAR file in Unity project

Note: Regarding JAR file creation and usage, please refer to [the Guideline](https://github.com/picoxr/support/blob/master/How_to_use_JAR_file_in_Unity_project_on_Pico_device.docx)

## ModifyAndroidManifest
Add permissions 
```
<USES-the permission of the android:name = "android.Permission.RECEIVE_BOOT_COMPLETED"/>
```

## ClassName
```
android: name = "com.Example.Bootcomplete.MainActivity"
```
## Register system broadcast 

```
<receiver android:name=".BootReceiver" >
            <intent-filter android:priority="1000">
                <action android:name="android.intent.action.BOOT_COMPLETED" />
            </intent-filter>
</receiver>
```

Note: it is required to run the application before next device boot-up

