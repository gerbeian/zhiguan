package com.zhengqi.app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// NOTE: SF Pro is proprietary. Use system fallback on Android (Roboto/Inter) or add custom font in res/font.
val ZQTypography = Typography(
    displayLarge = TextStyle(
        fontSize = 56.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 60.sp
    ),
    displayMedium = TextStyle(
        fontSize = 40.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 44.sp
    ),
    displaySmall = TextStyle(
        fontSize = 34.sp,
        fontWeight = FontWeight.SemiBold,
        lineHeight = 50.sp
    ),
    headlineLarge = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 32.sp
    ),
    bodyLarge = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.Normal,
        lineHeight = 25.sp
    ),
    labelLarge = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Medium,
        lineHeight = 18.sp
    ),
    small = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )
)
