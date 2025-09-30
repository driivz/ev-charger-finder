
package com.driivz.chargerfinder

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ChargersScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier.fillMaxSize()
    ) { paddingValues ->

        Text("Chargers Screen", modifier = Modifier.padding(paddingValues))
    }
}

@Preview
@Composable
private fun ChargersScreenPreview() {
    MaterialTheme {
        Surface {
            ChargersScreen()
        }
    }
}

