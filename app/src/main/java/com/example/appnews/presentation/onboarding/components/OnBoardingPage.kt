package com.example.appnews.presentation.onboarding.components

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appnews.R
import com.example.appnews.presentation.Dimens
import com.example.appnews.presentation.onboarding.Page
import com.example.appnews.presentation.onboarding.pages
import com.example.appnews.ui.theme.AppNewsTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier.fillMaxHeight(0.9f),
    page: Page
) {
    Column(
        modifier = modifier
    ) {
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            val screenHeight = maxHeight
            val imageHeight = screenHeight * 0.7f

            Box(modifier = Modifier.fillMaxWidth().height(imageHeight)) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    painter = painterResource(id = page.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop

                )
            }
        }
        Spacer(modifier = Modifier.height(Dimens.mediumPadding1))
        Text(
            text = page.title,
            modifier = Modifier.padding(horizontal = Dimens.mediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )
        Text(
            text = page.description,
            modifier = Modifier.padding(horizontal = Dimens.mediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun OnBoardingPagePreview() {
   AppNewsTheme {
         OnBoardingPage(
              page = pages.first()
         )
   }
}