import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.ipisces42"
version = "0.0.1"

dependencies {
    //模块需要其他第三方库, 在这里写
    implementation(project((":foodie-dev-pojo")))
}
tasks.named<BootJar>("bootJar") {

        isEnabled = false

}