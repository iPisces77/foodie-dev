import org.springframework.boot.gradle.tasks.bundling.BootJar

group = "com.ipisces42"
version = "0.0.1"

dependencies {
    implementation(project(":foodie-dev-common"))
    //模块需要其他第三方库, 在这里写
}
tasks.named<BootJar>("bootJar") {

        isEnabled = false

}