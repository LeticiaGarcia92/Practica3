package mx.unitec.practica3

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import mx.unitec.practica3.ui.TimePickerFragment

class PickerActivity : AppCompatActivity() {
    private lateinit var pkrTime: EditText

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picker)

        pkrTime = findViewById(R.id.pkrTime)
    }

    fun showDatePickerDialog(v:View) {
        val newFragment = TimePickerFragment.newInstance(TimePickerDialog.OnTimeSetListener
        { _, hourOfDay, minute ->
            pkrTime.setText("${hourOfDay}:${minute}")
        })

        newFragment.show(supportFragmentManager, "datePicker")
    }
}