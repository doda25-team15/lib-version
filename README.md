# lib-version
Library for [SMS checker](https://github.com/doda25-team15/app).

## How to use
lib-version exposes the `VersionUtil` class that has several public fields available that can be used. It also has the `LoggerUtil` utility class which exposes the `getLogger` method. Calling this method will return a logger instance that automatically has its name set to the class name of the calling class.

## How to build
lib-version uses the Gradle build tool. It is not required to have Gradle locally installed, as the Gradle wrapper JAR comes with the project. To build the project, do

```shell
./gradlew build
```

To build and release the project to GitHub Packages, do

```shell
./gradlew publish
```

For this, make sure that the `GITHUB_ACTOR` and `GITHUB_TOKEN` environment variables are configured.

Furthermore, you can also publish the project to Maven local by doing

```shell
./gradlew publishToMavenLocal
```

This is useful for being able to depend on this project without having to have authentication configured for GitHub packages. Of course, it only works locally.

## Version awareness
lib-version is a library that is aware of its own version (as defined in `gradle.properties`), as well as other properties like the Git branch and commit hash. It achieves this by using a custom Gradle task that directly retrieves the library metadata from Gradle and stores it in a JSON file. This JSON file is then included in the JAR file through `processResources`, which lib-version will parse when the `VersionUtil` class is loaded. 

In Gradle, custom tasks can be defined in the [`buildSrc`](https://docs.gradle.org/current/userguide/sharing_build_logic_between_subprojects.html#sec:sharing_logic_via_convention_plugins) directory. The directory defines an independent Gradle project which the main Gradle project can depend on in `build.gradle`. The task itself is a simple Java class that extends `DefaultTask`. This way the entire process is done programmatically and can be arbitrarily extended.
