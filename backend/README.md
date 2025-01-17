## AWS S3 사용을 위해 다음과 같은 환경변수 설정이 필요하다
```env
S3_ACCESS_KEY=1q2w3e4r
S3_SECRET_KEY=1q2w3e4r/1q2w3e4r
S3_REGION=ap-northeast-2
S3_BUCKET=s3bucketname
```

## SENS API 사용을 위해 다음과 같은 환경변수 설정이 필요하다
```env

# NAVER CLOUD PLATFORM - Simple & Easy Notification Service
SENS_ACCESSKEY=123WER
SENS_SERVICEKEY=S1D32FS1DF
SENS_SECRETKEY=nS1D2F3SFDS
SENS_FROMNUM=01012345678
```

### IDE(IntelliJ)에서 환경변수 설정 방법
configuration에서 다음과 같이 설정할 수 있다.
![set](../etc/set-env-in-intellij.png)

## AES128 사용을 위해 다음과 같은 환경변수 설정이 필요하다

```sh
# 16자 이상으로 설정해야 한다
AES128_SECRETKEY=1q2w3e4r1q2w3e4r1q2w3e4r1q2w3e4r
```
