class Pony(name: String, alter: Int, geschlecht: String, gewicht: Double, geschwindigkeit: Double): Tier(name, alter, geschlecht, gewicht){
    var geschwindigkeit: Double = geschwindigkeit

    override fun geraeuscheMachen(){
        println("${super.name}: Wieh hie hie hie!")
    }

    fun reiten(besucher: Besucher){
        if(besucher.alter >= 6){
            if(super.alter > 1){
                println("Der Besucher ${besucher.name} reitet jetzt mit dem Pony ${this.name}")
            }else{
                println("Du bist zwar alt genug, ich muss aber noch warten bis ich 1 Jahr alt bin um dich reiten zu lassen!")
            }
        }else{
            println("Hallo ${besucher.name}!\nDu musst mindestens 6 Jahre alt sein um mich zu reiten!")
        }
    }

}