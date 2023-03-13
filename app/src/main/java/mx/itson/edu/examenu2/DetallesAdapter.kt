package mx.itson.edu.examenu2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class Catalogo : AppCompatActivity() {
    var adapter: DetallesAdapter? = null
    var detalles = ArrayList<Detalles>()
    val gridView: GridView = findViewById(R.id.id_grid)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.regalos)

        cargarPeliculas()

        adapter = DetallesAdapter(detalles, this)
        gridView.adapter = adapter
    }

    fun cargarPeliculas(){
        detalles.add(Detalles(R.drawable.globoamor,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.globocumple,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.globofestejo,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.globos,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.globonum,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.globoregalo,"Globos","$300.00"))

        detalles.add(Detalles(R.drawable.cumplebotanas,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.cumplecheve,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.cumpleescolar,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.cumplesnack,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.cumplepaletas,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.cumplevinos,"Globos","$300.00"))

        detalles.add(Detalles(R.drawable.peluchemario,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.pelucheminecraft,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.peluchepeppa,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.peluches,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.peluchesony,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.peluchestich,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.peluchevarios,"Globos","$300.00"))

        detalles.add(Detalles(R.drawable.regalos,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.regaloazul,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.regalobebe,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.regalocajas,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.regalocolores,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.regalovarios,"Globos","$300.00"))

        detalles.add(Detalles(R.drawable.tazaabuela,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.tazalove,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.tazaquiero,"Globos","$300.00"))
        detalles.add(Detalles(R.drawable.tazas,"Globos","$300.00"))
         }

class DetallesAdapter: BaseAdapter {

    var detalles = ArrayList<Detalles>()
    var context: Context? = null

    constructor(detalles: ArrayList<Detalles>, context:Context?):super()
        this.
    }

    override fun getCount(): Int {
        return detalles.size
    }

    override fun getItem(p0: Int): Any {
        return detalles[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var detalle = detalles[p0]
        var inflador = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var vista =inflador.inflate(R.layout.regalos, null)




        return vista
    }
}