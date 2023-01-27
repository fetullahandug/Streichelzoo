class Huhn(name: String, alter: Int, geschlecht: String, gewicht: Double, eierProTag: Int): Tier(name, alter, geschlecht, gewicht){
    var eierProTag: Int

    init{
        this.eierProTag = eierProTag
    }

    override fun geraeuscheMachen(){
        println("${super.name}: Ga-gack!")
    }

    fun wieVieleEierProTag(){
        println("Ich heiße ${super.name} und lege ${this.eierProTag} Eier Pro Tag!")
    }
}