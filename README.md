# CalculationLanguage
언어 만들때 계산을 해주는 라이브러리 입니다.

## Jar 파일 다운로드 링크

[모든 버전 다운로드](https://downgit.evecalm.com/#/home?url=https://github.com/PersesTitan/CalculationLanguage/tree/master/Jar)</br>
[V1 다운로드](https://downgit.evecalm.com/#/home?url=https://github.com/PersesTitan/CalculationLanguage/tree/master/Jar/V1)</br>

# 사용법
라이브러리 들어가서 jar파일을 추가해 주세요.

## setSign(plus, minus, multiply)
설명 : 처음 기호를 등록하는 메소드 입니다.</br>
리턴 타입 : void</br>
  * plus = 1이 더해지는 기호 (기본 값 : +)
  * minus = 1이 빼지는 기호 (기본 값 : -)
  * multiply = 곱해지는 기호 (기본 값 : *)

```java
엄랭 기준으로 예시를 작성하였습니다.

setSign(".", ",", " ");

```

## calculation(texts)
설명 : 계산된 값이 리턴 됩니다.</br>
리턴 타입 : long</br>
  * texts = 계산전 값을 넣으면 계산된 값이 출력됩니다.
  
```java
엄랭 기준으로 예시를 작성하였습니다.

setSign(".", ",", " ");
String text = "...,, ,";
long value = calculation(text);
결과값: -1
```

# 버전
  1. 2022/5/1 V1 - setSign, calculation 추가
