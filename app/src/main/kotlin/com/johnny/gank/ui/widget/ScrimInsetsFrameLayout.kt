package com.johnny.gank.ui.widget

/*
 * Copyright (C) 2016 Johnny Shieh Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout

/**
 * @author Johnny Shieh (JohnnyShieh17@gmail.com)
 * *
 * @version 1.0
 */
class ScrimInsetsFrameLayout
    @JvmOverloads constructor(
            context: Context,
            attrs: AttributeSet? = null,
            defStyleAttr: Int = 0) : FrameLayout(context, attrs, defStyleAttr) {

    init {
        setWillNotDraw(true) // No need to draw until the insets are adjusted

        val resId = resources.getIdentifier("status_bar_height", "dimen", "android")
        if (resId > 0) {
            val statusBarHeight = resources.getDimensionPixelOffset(resId)
            setPadding(paddingLeft, statusBarHeight, paddingRight, paddingBottom)
        }
    }
}
