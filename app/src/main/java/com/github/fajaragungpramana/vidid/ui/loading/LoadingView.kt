package com.github.fajaragungpramana.vidid.ui.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.github.fajaragungpramana.vidid.R
import com.github.fajaragungpramana.vidid.ui.theme.VidIDTheme

object LoadingView {

    @Composable
    fun ContentView() {
        Box(
            modifier = Modifier
                .systemBarsPadding()
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                color = MaterialTheme.colorScheme.primary,
                style = MaterialTheme.typography.headlineLarge,
                fontSize = 32.sp
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoadingActivity_Preview() {
    VidIDTheme(dynamicColor = false) {
        LoadingView.ContentView()
    }
}