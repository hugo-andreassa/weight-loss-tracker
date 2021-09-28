package com.example.android.weightlosstracker.utils

import android.view.View
import android.widget.Button
import androidx.databinding.BindingAdapter

/**
 * Binding adapter usado para esconder o spinner
 */
@BindingAdapter("goneIfNotTrue")
fun goneIfNotTrue(view: View, it: Boolean?) {
    it?.let {
        view.visibility = if (it) View.VISIBLE else View.GONE
    }
}

/**
 * Binding adapter usado para desabilitar/habilitar o botão
 */
@BindingAdapter("disableIfNotTrue")
fun disableIfNotTrue(button: Button, it: Boolean?) {
    it?.let {
        button.isEnabled = !it
    }
}