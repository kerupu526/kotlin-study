# kotlin-study

코틀린 학습용 워크스페이스입니다.

## 로컬 Kotlin 실행

워크스페이스의 `.tools/kotlin`에 Kotlin JVM 컴파일러가 있습니다. JDK 21 이상이 필요합니다.

```powershell
\.tools\kotlin\bin\kotlinc.bat .\src\main\kotlin\Main.kt -classpath .\.tools\kotlin\lib\kotlin-stdlib.jar -include-runtime -d .\build\kotlin-study.jar
java -jar .\build\kotlin-study.jar
```

현재 설치된 컴파일러 버전은 Kotlin 2.2.20입니다.
