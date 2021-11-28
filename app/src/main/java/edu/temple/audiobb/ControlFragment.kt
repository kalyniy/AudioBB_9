package edu.temple.audiobb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val ARG_BOOK = "book"

class ControlFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var param_book: Book

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
        return inflater.inflate(R.layout.fragment_control, container, false)
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