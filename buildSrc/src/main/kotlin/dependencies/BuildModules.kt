package dependencies

/**
 * Configuration of build modules
 */
object BuildModules {
    const val APP = ":app"
    const val CORE = ":core"
    const val DATA = ":data"

    object Features {
        const val LOGIN = ":features:login"
        const val HOME_CONTAINER = ":features:home:homeContainer"
        const val HOME_NEWS_LIST = ":features:home:newsList"
        const val HOME_NEWS_FAVORITES = ":features:home:newsFavorites"
    }

    object Core {
        const val UI_GEARS = ":core:uiGears"
        const val UNIT_TEST = ":core:test:unitTest"
        const val INTEGRATION_TEST = ":core:test:integrationTest"
        const val EXTENSIONS = ":core:extensions"
        const val INJECTIONS = ":core:injections"
    }

    object Data {
        const val EXTENSIONS = ":data:remote"
        const val INJECTIONS = ":data:local"
    }
}
