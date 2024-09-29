package com.zeronine.toastykit

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


/** `ToastyKit` Android dependency developed by 'Asmat Ullah Khan'
 on 28-sep-2024 */
class ToastyKit {
    companion object {
        /** Simple Toast */
        fun simple(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        /** Error Toast */
        fun error(context: Context, msg: String) {
            val inflater = LayoutInflater.from(context)
            val layout = inflater.inflate(R.layout.toast_layout, null)

            val parentToast = layout.findViewById<View>(R.id.parentToast)
            val tvToastMsg = layout.findViewById<TextView>(R.id.tvToastMsg)
            val ivToastIcon = layout.findViewById<ImageView>(R.id.ivToastIcon)
            parentToast.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#FF0000"))
            tvToastMsg.text = msg
            ivToastIcon.setImageResource(R.drawable.ic_error)
            tvToastMsg.setTextColor(Color.parseColor("#FFFFFF"))
            ivToastIcon.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN)

            val toast = Toast(context)
            toast.apply {
                setGravity(Gravity.BOTTOM, 0, 0)
                duration = Toast.LENGTH_SHORT
                view = layout
                show()
            }
        }

        /** Success Toast */
        fun success(context: Context, msg: String) {
            val inflater = LayoutInflater.from(context)
            val layout = inflater.inflate(R.layout.toast_layout, null)

            val parentToast = layout.findViewById<View>(R.id.parentToast)
            val tvToastMsg = layout.findViewById<TextView>(R.id.tvToastMsg)
            val ivToastIcon = layout.findViewById<ImageView>(R.id.ivToastIcon)
            parentToast.backgroundTintList = ColorStateList.valueOf(Color.parseColor("#008000"))
            tvToastMsg.text = msg
            ivToastIcon.setImageResource(R.drawable.ic_check)
            tvToastMsg.setTextColor(Color.parseColor("#FFFFFF"))
            ivToastIcon.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_IN)

            val toast = Toast(context)
            toast.apply {
                setGravity(Gravity.BOTTOM, 0, 0)
                duration = Toast.LENGTH_SHORT
                view = layout
                show()
            }
        }
        

        /** Customizable Toast */
        fun customizable(context: Context, msg: String, msgColor: Int, icon: Int, iconColor: Int, backgroundColor: Int) {
            val inflater = LayoutInflater.from(context)
            val layout = inflater.inflate(R.layout.toast_layout, null)

            val parentToast = layout.findViewById<View>(R.id.parentToast)
            val tvToastMsg = layout.findViewById<TextView>(R.id.tvToastMsg)
            val ivToastIcon = layout.findViewById<ImageView>(R.id.ivToastIcon)
            parentToast.backgroundTintList = ColorStateList.valueOf(backgroundColor)
            tvToastMsg.text = msg
            ivToastIcon.setImageResource(icon)
            tvToastMsg.setTextColor(msgColor)
            ivToastIcon.setColorFilter(iconColor, PorterDuff.Mode.SRC_IN)

            val toast = Toast(context)
            toast.apply {
                setGravity(Gravity.BOTTOM, 0, 0)
                duration = Toast.LENGTH_SHORT
                view = layout
                show()
            }
        }
    }

}