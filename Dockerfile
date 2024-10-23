# 첫 번째 스테이지: 빌드 스테이지
FROM gradle:jdk21-graal-jammy as builder

# 작업 디렉토리 설정
WORKDIR /app

# Gradle 종속성 파일을 먼저 복사 (캐시 무효화 포인트)
COPY build.gradle .
COPY settings.gradle .

# Gradle 래퍼와 관련 파일 복사
COPY gradlew .
COPY gradle gradle

# Gradle 래퍼에 실행 권한 부여
RUN chmod +x ./gradlew

# 종속성만 미리 설치 (소스 코드가 변경되지 않으면 종속성 캐시 유지)
RUN ./gradlew dependencies --no-daemon

# 소스 코드 복사 (변경될 가능성이 큰 파일은 나중에 복사해서 캐시를 효율적으로 사용)
COPY src src

# 애플리케이션 빌드
RUN ./gradlew build --no-daemon

# 두 번째 스테이지: 실행 스테이지
FROM ghcr.io/graalvm/jdk-community:21

# 작업 디렉토리 설정
WORKDIR /app

# 첫 번째 스테이지에서 빌드된 JAR 파일 복사
COPY --from=builder /app/build/libs/*.jar app.jar

# 실행할 JAR 파일 지정
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "app.jar"]
