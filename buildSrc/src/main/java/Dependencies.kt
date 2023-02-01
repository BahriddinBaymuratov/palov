
object Dependencies {
    const val DaggerHilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    const val KotlinVersion = "androidx.core:core-ktx:${Versions.kotlin}"
    const val LifeCycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleKtx}"
    const val AppCompat = "androidx.activity:activity-compose:${Versions.appComp}"
    const val ComposeUi = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val CompPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val MaterialDesign = "androidx.compose.material3:material3:${Versions.m3}"
    const val JUnit = "junit:junit:${Versions.jUnit}"
    const val ExtUnit = "androidx.test.ext:junit:${Versions.test}"
    const val Espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val ComposeTest = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val ComposeTool = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val TestMan = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"
    const val ComposeNavigation = "androidx.navigation:navigation-compose:${Versions.navigation}"
    const val ComposePager = "com.google.accompanist:accompanist-pager:${Versions.paging}"
    const val PagerIndicator = "com.google.accompanist:accompanist-pager-indicators:${Versions.paging}"
    const val Coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val AndroidCoroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
    const val LifecycleScope = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.scope}"
    const val RuntimeScope = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.scope}"
    const val Retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val GsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val Okhttp = "com.squareup.okhttp3:okhttp:${Versions.ok}"
    const val Interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.ok}"
    const val Coil = "io.coil-kt:coil:${Versions.coil}"
    const val AccCoil = "com.google.accompanist:accompanist-coil:${Versions.accCoil}"
    const val Hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val KaptHilt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val HiltVM = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltVm}"
    const val CompHilt = "androidx.hilt:hilt-compiler:${Versions.compHilt}"
    const val HiltNavigation = "androidx.hilt:hilt-navigation-compose:${Versions.compHilt}"
    const val RoomRun = "androidx.room:room-runtime:${Versions.room}"
    const val RoomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val RoomAn = "androidx.room:room-compiler:${Versions.room}"
    const val RoomComp = "androidx.room:room-compiler:${Versions.room}"
    const val DataStore = "androidx.datastore:datastore-preferences:${Versions.compHilt}"
    const val Jsoup = "org.jsoup:jsoup:${Versions.jsoup}"
    const val Lottie = "com.airbnb.android:lottie-compose:${Versions.lottie}"
}
object Versions {
    const val composeVersion = "1.1.1"
    const val hilt = "2.40.5"
    const val kotlin = "1.7.0"
    const val lifeCycleKtx = "2.3.1"
    const val appComp = "1.3.1"
    const val m3 = "1.1.0-alpha04"
    const val jUnit = "4.13.2"
    const val test = "1.1.5"
    const val espresso = "3.5.1"
    const val navigation = "2.6.0-alpha04"
    const val paging = "0.28.0"
    const val coroutine = "1.6.4"
    const val scope = "2.5.1"
    const val retrofit = "2.9.0"
    const val ok = "5.0.0-alpha.2"
    const val coil = "1.4.0"
    const val accCoil = "0.10.0"
    const val hiltVm = "1.0.0-alpha03"
    const val compHilt = "1.0.0"
    const val room = "2.4.3"
    const val jsoup = "1.13.1"
    const val lottie = "5.2.0"
}