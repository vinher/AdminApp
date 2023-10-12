package com.example.adminapp

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminapp.Adpater.GastosAdapter
import com.example.adminapp.databinding.FragmentHomeBinding
import com.example.adminapp.interfaces.MakeInterface
import com.example.adminapp.interfaces.Onclicklistener

class Home : Fragment(),MakeInterface,Onclicklistener {
    //Acceder A Los Componentes Del Fragment
    private lateinit var _add: FragmentHomeBinding
    private val c get() = _add!!
    private lateinit var dialog_gasto : Dialog
    private lateinit var dialog_saldo_total : Dialog
     override fun initDialog(
        activity: Activity,
        layout: Int,
        ancho: Double,
        alto: Double,
        cancelable: Boolean,
        transparente: Boolean
    ): Dialog {
        val dialog = Dialog(activity)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(cancelable)
        dialog.setContentView(layout)
        val width = (resources.displayMetrics.widthPixels * ancho).toInt()
        val height = (resources.displayMetrics.heightPixels * alto).toInt()
        dialog.window?.setLayout(width, height)
        return dialog
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
       _add = FragmentHomeBinding.inflate(inflater,container,false)
        val view = c.root
        initUI()
        return view
    }
    fun initUI(){
        dialog_gasto        = initDialog(requireActivity(),R.layout.dialog_gasto,0.90,0.60,true,false)
        dialog_saldo_total  = initDialog(requireActivity(),R.layout.dialog_saldo,0.90,0.45,true,false)
        var noteAdapter: GastosAdapter






        _add.cardSaldo.setOnClickListener {
           dialog_saldo_total.show()
        }
        _add.addGasto.setOnClickListener {
            dialog_gasto.show()
        }
        dialog_gasto.findViewById<Button>(R.id.save).setOnClickListener {
            _add.rvGastos.apply {
                layoutManager = LinearLayoutManager(context)


            }

        }
    }
}