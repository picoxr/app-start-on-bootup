<p align="right"><a href="https://github.com/PicoSupport/PicoSupport" target="_blank"> <img src="https://github.com/PicoSupport/PicoSupport/blob/master/Assets/home.png" width="20"/> </a></p>

# Instructions for starting APK

Note: Regarding java package creation and usege, please refer to [the Guideline](https://github.com/PicoSupport/PicoSupport/blob/master/How_to_use_JAR_file_in_Unity_project_on_Pico_device.docx)

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

