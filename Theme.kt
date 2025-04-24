import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun SunflowerTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(content = content)
}


@Composable
fun SunflowerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val lightColors  = lightColorScheme(
        primary = colorResource(id = R.color.sunflower_green_500),
        primaryContainer = colorResource(id = R.color.sunflower_green_700),
        secondary = colorResource(id = R.color.sunflower_yellow_500),
        background = colorResource(id = R.color.sunflower_green_500),
        onPrimary = colorResource(id = R.color.sunflower_black),
        onSecondary = colorResource(id = R.color.sunflower_black),
    )
    val darkColors  = darkColorScheme(
        primary = colorResource(id = R.color.sunflower_green_100),
        primaryContainer = colorResource(id = R.color.sunflower_green_200),
        secondary = colorResource(id = R.color.sunflower_yellow_300),
        onPrimary = colorResource(id = R.color.sunflower_black),
        onSecondary = colorResource(id = R.color.sunflower_black),
        onBackground = colorResource(id = R.color.sunflower_black),
        surface = colorResource(id = R.color.sunflower_green_100_8pc_over_surface),
        onSurface = colorResource(id = R.color.sunflower_white),
    )
    val colors = if (darkTheme) darkColors else lightColors
    MaterialTheme(
        colorScheme = colors,
        content = content
    )
}


class PlantDetailFragment : Fragment() {
    ...
    composeView.apply {
        ...
        setContent {
            SunflowerTheme {
                PlantDetailDescription(plantDetailViewModel)
            }
        }
    }
}
