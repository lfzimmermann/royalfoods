# Royal Foods

Bring _back_ more food sources from **modern** Minecraft!

# Features

At this point only adds raw and cooked mutton, and adds it as a drop to sheeps.

## Prerequisites
- JDK for Java 17 ([Eclipse Temurin](https://adoptium.net/temurin/releases/) recommended)
- [Intellij IDEA](https://www.jetbrains.com/idea/download/) (Scroll down for the free community edition, if using linux **DO NOT** use the flatpak distribution)
- Minecraft Development plugin (Optional, but highly recommended)

## Setup instructions
   

1. Clone this repo, or open IntelliJ IDEA and click 'Get from VCS' -> Select 'Repository URL' and enter this repo's url.

2. After the project has finished importing, close it and open it again.  
   If that does not work, open the right sidebar with `Gradle` on it, open `Tasks` > `fabric` and run `ideaSyncTask`.

3. Create a new run configuration by going in `Run > Edit Configurations`.  
   Then click on the plus icon and select Gradle. In the `Tasks and Arguments` field enter `build`.  
   Running it will build your finished jar files and put them in `build/libs/`.

4. Lastly, open `File` > `Settings` and head to `Build, Execution, Development` > `Build Tools` > `Gradle`.  
   Make sure `Build and run using` and `Run tests using` is set to `Gradle`.

5. Done!. Happy modding!

## Tips

1. If you haven't already you should join the BTA modding discord! https://discord.gg/FTUNJhswBT
2. You can set your username when launching the client run configuration by setting `--username <username>` in your program arguments.
3. When launching the server run configuration you may want to remove the `nogui` program argument in order to see the regular server GUI.
4. In Intellij you can double press shift or press ctrl+N to search class files, change the search from the default `Project Files` to `All Places` you can easily explore the classes for you dependencies and even BTA itself.
5. In Intellij if ctrl+left click on a field or method you can quickly get information on when and where that field or method is assign or used.

