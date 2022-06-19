import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.ipisces42"
version = "0.0.1"

tasks.named<BootJar>("bootJar") {
    mainClass.set("com.ipisces42.foodiedev.FoodieDevApplicationKt")
}


dependencies {
    implementation(project(":foodie-dev-service"))
    //模块需要其他第三方库, 在这里写
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("mysql:mysql-connector-java")
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}