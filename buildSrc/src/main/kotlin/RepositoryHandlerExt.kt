import org.gradle.api.artifacts.dsl.RepositoryHandler

fun addRepositories(handler: RepositoryHandler) {
    with(handler) {
        maven {
            setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
            content {
                includeGroup("com.squareup.picasso")
            }
        }
        google()
        mavenCentral()
        jcenter()
    }
}