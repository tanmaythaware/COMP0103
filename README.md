# COMP0103

## Prerequisites:
* Infer : To install, Run the following command:
```
      VERSION=0.XX.Y; \
curl -sSL "https://github.com/facebook/infer/releases/download/v$VERSION/infer-linux64-v$VERSION.tar.xz" \
| sudo tar -C /opt -xJ && \
sudo ln -s "/opt/infer-linux64-v$VERSION/bin/infer" /usr/local/bin/infer

```

## Setup:
* Open pom.xml in IDE.
* Uncomment the Completion needed to check.
* Run Infer analysis on the class via the following command: ``` infer run -- javac path/to/class/file.java ```
* To run property-based test classes for each program are as follows: 
  * CounterPropertiesTest.java : Counter.java
  * PrimeFactorsPropertiesTest.java : PrimeFactors.java
  * FibonacciTest.java : Task.java

## ChatGPT Responses:
* C1 Chat: https://chat.openai.com/share/edffb227-cd53-4d6c-b037-147ea7b3559a
* C2 Chat: https://chat.openai.com/share/57365375-8266-4539-b147-2b73be852eeb
* C3 Chat: https://chat.openai.com/share/6313b424-00f9-423a-af3f-933c257c2cc2
* C4 Chat: https://chat.openai.com/share/8ba33e3e-dc7e-4629-9d21-d3d95570f403
* C5 Chat: https://chat.openai.com/share/1d9870fa-d64f-45e1-8ba9-995e4d2e152b
* C6 Chat: https://chat.openai.com/share/1863f35d-542f-476a-9df9-2950908a5b60 