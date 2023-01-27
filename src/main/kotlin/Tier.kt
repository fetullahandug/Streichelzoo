open class Tier{
    var name: String
    var alter: Int
    var geschlecht: String
    var gewicht: Double

    constructor(name: String, alter: Int, geschlecht: String, gewicht: Double){
        this.name = name
        this.alter = alter
        this.geschlecht = geschlecht
        this.gewicht = gewicht
    }

    fun printEigenschaften(){
        println("Name: " + this.name)
        println("Alter: " + this.alter)
        println("Geschlecht: " + this.geschlecht)
        println("Gewicht: " + this.gewicht)
    }

    fun bewegen(){
        println("Das Tier ${this.name} hat sich bewegt -")
    }

    open fun geraeuscheMachen(){
        println("Das Tier ${this.name} hat ein Geräusch gemacht!")
    }

    fun streicheln(besucher: Besucher){
        println("Das Tier ${this.name} wurde von dem Besucher ${besucher.name} gestreichelt -")
    }

    fun fuettern(besucher: Besucher){
        this.gewicht = this.gewicht * 1.02
        println("Das Tier ${this.name} wurde von dem Besucher ${besucher.name} gefüttert -")
        println("${this.name} wiegt nun ${this.gewicht} kg")
    }
}
