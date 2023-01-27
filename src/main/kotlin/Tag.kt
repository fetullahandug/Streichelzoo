fun main(){
    var seb : Besucher = Besucher("Seb", 15, "Weiblich")
    var boris : Besucher = Besucher("Boris", 4, "Männlich")

    var schaaf1 = Schaaf("Shawn", 5, "Weiblich", 23.4)
    var schaaf2 = Schaaf("Schaafie", 5, "Männlich", 23.4)
    var huhn1 = Huhn("Kikeri", 2, "Männlich", 2.5, 2)
    var huhn2 = Huhn("Blöder Huhn ohne Fortpflanzungsfähigkeit", 2, "Weiblich", 2.5, 0)
    var kuh = Kuh("Berta", 7, "Weiblich", 550.0)
    var pony1 = Pony("Gustav", 3, "Männlich", 315.0, 30.5)
    var pony2 = Pony("Ponylein", 3, "Männlich", 750.0, 50.0)

    var tiereImZoo: MutableList<Tier> = mutableListOf(
        schaaf1,
        schaaf2,
        huhn1,
        huhn2,
        kuh,
        pony1,
        pony2
    )

    seb.vorstellen()
    boris.vorstellen()

    println()
    huhn1.geraeuscheMachen()
    schaaf1.fuettern(seb)
    pony1.reiten(boris)
    huhn1.bewegen()
    pony1.streicheln(seb)
    pony1.reiten(seb)
    pony1.reiten(boris)
    kuh.melken()

    println()
    schaaf1.bewegen()
    huhn1.bewegen()
    kuh.bewegen()
    pony1.bewegen()

    println()
    schaaf1.fuettern(boris)
    huhn1.fuettern(boris)
    kuh.fuettern(boris)
    pony1.fuettern(boris)

    if(pony1.geschwindigkeit > pony2.geschwindigkeit){
        println("${pony1.name} war schneller als ${pony2.name} und hat das Rennen gewonnen!")
    }else if(pony1.geschwindigkeit == pony2.geschwindigkeit){
        println("${pony1.name} war genauso schnell wie ${pony2.name}.\nUnentschieden!")
    }else{
        println("${pony2.name} war schneller als ${pony1.name} und hat das Rennen gewonnen!")
    }
}
