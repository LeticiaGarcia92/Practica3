package mx.unitec.practica3.ui

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.text.format.DateFormat
import androidx.fragment.app.DialogFragment
import java.util.*

class TimePickerFragment : DialogFragment() {

    private var listener:TimePickerDialog.OnTimeSetListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val c = Calendar.getInstance()
        val hour = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)

        return TimePickerDialog(activity, listener, hour, minute, DateFormat.is24HourFormat(activity))
    }
    companion object{
        fun newInstance (listener: TimePickerDialog.OnTimeSetListener): TimePickerFragment{
            val fragment = TimePickerFragment()
            fragment.listener = listener
            return  fragment
        }
    }
}