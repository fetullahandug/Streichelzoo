fun main(){

    var besucher1 = Besucher("Franz", 15, "männlich")
    var tier1 = Tier("Helga", 12, "weiblich", 35.3)


    besucher1.vorstellen()
    println()
    tier1.printEigenschaften()
    println()
    tier1.bewegen()
    tier1.geraeuscheMachen()
    tier1.streicheln(besucher1)
    tier1.fuettern(besucher1)
    println()

    var dasKleineSchaaf = Schaaf("Shawn", 5, "Weiblich", 23.4)
    dasKleineSchaaf.geraeuscheMachen()

    var einfachEinHuhn = Huhn("Kikeri", 2, "Männlich", 2.5, 2)
    einfachEinHuhn.geraeuscheMachen()
    println()
    einfachEinHuhn.wieVieleEierProTag()


    var dieDickeKuh = Kuh("Berta", 7, "Weiblich", 550.0)
    dieDickeKuh.melken()

    println()

    var pony = Pony("Gustav", 3, "Männlich", 315.0, 30.5)
    pony.reiten(besucher1)

    println()

    var jungerBesucher = Besucher("Sissie", 4, "Weiblich")
    pony.reiten(jungerBesucher)
}