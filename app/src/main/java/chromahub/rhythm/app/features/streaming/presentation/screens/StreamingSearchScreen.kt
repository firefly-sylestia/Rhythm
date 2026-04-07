package chromahub.rhythm.app.features.streaming.presentation.screens

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * Streaming Search Screen - Shows Rhythm logo with name
 */
@Composable
fun StreamingSearchScreen(
    onBack: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    BackHandler(enabled = true) {
        onBack()
    }

    RhythmStreamingLogoScreen(onSwitchToLocal = {}, modifier = modifier)
}
