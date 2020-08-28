import java.util.*
import kotlin.math.ceil

/**
 * Nama : Nadya Adima Putti
 * Kelas / Absen : XI RPL 1 / 20
 **/

fun main(){

    //penerapan scanner
    val inputUser = Scanner(System.`in`)

    //initialize class
    val tabung = Tabung()
    val kerucut = Kerucut()

    println("1. Kerucut")
    println("2. Tabung")
    print("Silahkan pilih : ")
    when {
        inputUser.nextInt() == 1 -> {

            //menghitung volume kerucut
            print("Sebuah kerucut memiliki tinggi : ")
            kerucut.tinggi = inputUser.nextFloat()
            print("dan memiliki jari-jari : ")
            kerucut.jariJari = inputUser.nextFloat()
            println("maka berapakah volume kerucut tersebut?")
            println("Diketahui : \n Jari-jari ${kerucut.jariJari} \n Tinggi ${kerucut.tinggi}")


            //hasil volume
            val vKerucut = volumeKerucut(kerucut.jariJari!!, kerucut.tinggi!!)
            //menggunakan string format karena kita akan menampilkan 2 angka dibelakang koma
            //ceil ---> untuk membulatkan lebih tinggi dari angka sebelumya
            val volumeBulatkan = ceil(vKerucut)
            println("Jawab : \n Rumus kerucut adalah ( (1/3) * (22/7) * r * r * tinggi )\n Jadi volume kerucut adalah "
                    + String.format("%.2f", vKerucut )
                    + "\n Dan volume kerucut setelah dibulatkan $volumeBulatkan")

        }
        inputUser.nextInt() == 2 -> {

            //menghitung volume tabung
            print("Sebuah tabung memiliki tinggi : ")
            tabung.tinggi = inputUser.nextFloat()
            print("dan memiliki jari-jari : ")
            tabung.jariJari = inputUser.nextFloat()
            println("maka berapakah volume tabung tersebut?")
            println("Diketahui : \n Jari-jari ${tabung.jariJari} \n Tinggi ${tabung.tinggi}")

            //hasil volume
            val vTabung = volumeTabung(tabung.jariJari!!, tabung.tinggi!!)
            //menggunakan string format karena kita akan menampilkan 2 angka dibelakang koma
            //ceil ---> untuk membulatkan lebih tinggi dari angka sebelumya
            val volumeBulatkan = ceil(vTabung)
            println("Jawab : \n Rumus tabung adalah ( (22/7) * r * r * tinggi )\n Jadi volume tabung adalah "
                    + String.format("%.2f", vTabung )
                    + "\n Dan volume tabung setelah dibulatkan $volumeBulatkan")


        }
        else -> {
            println("pilihan anda saat ini belum tersedia!")
        }
    }

}

fun volumeKerucut(r : Float, t : Float) : Double{
    return (Math.PI * r * r) * t / 3
}
fun volumeTabung(r : Float, t : Float) : Double {
    return (Math.PI * r * r) * t
}