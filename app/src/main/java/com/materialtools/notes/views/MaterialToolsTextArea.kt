package com.materialtools.notes.views

import android.content.Context
import android.util.AttributeSet

class MaterialToolsEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null
) : androidx.appcompat.widget.AppCompatEditText(context, attrs) {
    init {
        this.background = null
    }
}