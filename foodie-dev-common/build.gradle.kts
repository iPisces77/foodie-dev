import org.springframework.boot.gradle.tasks.bundling.BootJar

tasks.named<BootJar>("bootJar") {
    isEnabled = false

}


dependencies {
    //模块需要其他第三方库, 在这里写
}

