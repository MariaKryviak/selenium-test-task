# Selenium test project

### Summary:
This is Selenium test project for verifying rozetka website

### Required tools:
- Chrome Browser
- Gradle
- Java

### Run test:
For run test use command `gradle test`.
By default, it will run tests in 2 threads in Chrome browser (`test` env).
- To change thread count add system variables `threadCount`
- To change environment from `test` to `dev` set `environment`
  E.g.: `gradle test -DthreadCount=4 -Denvironment=dev`
