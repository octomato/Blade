package dependencies

object TestDependencies {
    const val JUNIT = "junit:junit:${BuildDependenciesVersions.JUNIT}"
    const val ESPRESSO = "androidx.test.espresso:espresso-core:${BuildDependenciesVersions.ESPRESSO}"
    const val MOCKITO = "com.nhaarman.mockitokotlin2:mockito-kotlin:${BuildDependenciesVersions.MOCKITO}"
    const val MOCKK = "io.mockk:mockk:${BuildDependenciesVersions.MOCKK}"
    const val ASSERTJ = "org.assertj:assertj-core:${BuildDependenciesVersions.ASSERTJ}"
    const val ROBOELECTRIC = "org.robolectric:robolectric:${BuildDependenciesVersions.ROBOELECTRIC}"
}
