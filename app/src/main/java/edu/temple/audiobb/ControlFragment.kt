package edu.temple.audiobb

import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.TextView
private const val ARG_BOOK = "book"

class ControlFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var param_book: Book
    //buttons
    private lateinit var btnPlay: ImageButton
    private lateinit var btnPause: ImageButton
    private lateinit var btnStop: ImageButton
    private lateinit var seekBar: SeekBar
    private lateinit var txtTime: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param_book = it.getSerializable(ARG_BOOK) as Book
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v: View = inflater.inflate(R.layout.fragment_control, container, false)

        btnPlay = v.findViewById(R.id.btnPlay)
        btnPause = v.findViewById(R.id.btnPause)
        btnStop = v.findViewById(R.id.btnStop)
        seekBar = v.findViewById(R.id.seekBar)
        txtTime = v.findViewById(R.id.txtTime)

        return v
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: Book) =
            ControlFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(ARG_BOOK, param1)
                }
            }
    }
}