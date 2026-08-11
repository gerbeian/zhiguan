package com.zhengqi.app.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.SideEffect

private val LightColors = lightColorScheme(
    primary = ZQColors.Primary,
    onPrimary = ZQColors.BodyOnDark,
    background = ZQColors.Canvas,
    surface = ZQColors.Canvas,
    onSurface = ZQColors.Ink,
)

private val DarkColors = darkColorScheme(
    primary = ZQColors.PrimaryOnDark,
    onPrimary = ZQColors.OnBodyForDark ?: ZQColors.BodyOnDark,
    background = ZQColors.SurfaceTile1,
    surface = ZQColors.SurfaceTile1,
    onSurface = ZQColors.BodyOnDark,
)

// Fallback: create an extension for missing token used above
private val ZQColors.Companion.OnBodyForDark: androidx.compose.ui.graphics.Color?
    get() = null

@Composable
fun ZhiguanTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = ZQTypography,
        shapes = Shapes(
            small = androidx.compose.foundation.shape.RoundedCornerShape(8.dp),
            medium = androidx.compose.foundation.shape.RoundedCornerShape(18.dp),
            large = androidx.compose.foundation.shape.RoundedCornerShape(0.dp)
        ),
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun ThemePreview() {
    ZhiguanTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Primary Button:", modifier = Modifier.padding(top = ZQDimen.SpacingLG))
            Button(onClick = {}, modifier = Modifier.size(width = 180.dp, height = ZQDimen.TouchMin)) {
                Text("Primary", style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}
